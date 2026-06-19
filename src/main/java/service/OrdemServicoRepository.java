package service;

import model.OrdemServico;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

public class OrdemServicoRepository {

    public static List<OrdemServico> carregarDoBanco() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<OrdemServico> ordemServicos = session.createQuery("FROM OrdemServico", OrdemServico.class).list();
        session.close();
        return ordemServicos;
    }

    public void salvar(OrdemServico ordemServico) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.persist(ordemServico);
            transaction.commit();
            System.out.println("OS salvo no banco de dados");

        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            System.out.println("Erro ao salvar: " + e.getMessage());

        }
    }

    public void remove(OrdemServico ordemServico) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            OrdemServico ordemServicos = session.get(OrdemServico.class, ordemServico.getNumeroOS());
            session.remove(ordemServicos);
            transaction.commit();
            System.out.println("OS excluida do Banco de dados");
        } catch (Exception e) {
            if (transaction == null) transaction.rollback();
            System.out.println("Erro ao remover: " + e.getMessage());
        }
    }
}

