package service;

import model.Cliente;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;
import java.util.List;

public class ClienteRepository {

    public void salvar(Cliente cliente){
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.persist(cliente);
            transaction.commit();
            System.out.println("Cliente salvo no banco de dados");

        } catch (Exception e) {
            if(transaction != null) transaction.rollback();
            System.out.println("Erro ao salvar: " + e.getMessage());

        }
    }

    public static List<Cliente> carregarDoBanco() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Cliente> lista = session.createQuery("FROM Cliente", Cliente.class).list();
        session.close();
        return lista;
    }
}
