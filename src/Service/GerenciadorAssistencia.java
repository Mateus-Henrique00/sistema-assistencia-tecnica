package Service;

import Model.Cliente;
import Model.OrdemServiço;
import Model.Status;

import java.util.*;

public class GerenciadorAssistencia {
    private List<OrdemServiço> listaOS = new ArrayList<>();
    private HashMap<Integer,OrdemServiço> BUSCA = new HashMap<>();
    private Set <Cliente> clientes = new HashSet<>();
    private HashMap<Integer, Cliente> buscaRapida = new HashMap<>();


    public void CriarCadastro(Cliente cliente){
        if (!clientes.add(cliente)) {
            System.out.println("Esses dados já tem Cadastro");

        }else {
            buscaRapida.put(cliente.getID(),cliente);
            System.out.println("Cadastro realizado com sucesso");
        }

    }

    public void CriarOS(OrdemServiço os) {
        listaOS.add(os);
        BUSCA.put(os.getId(),os);



        System.out.println("#OS" + os.getId() + " Adicionado com sucesso!!!!!!!!");
    }

    public void listarTodos() {
        if (listaOS.isEmpty()) {
            System.out.println("Nenhum encontrado!!!!!!!!!!");
        } else {
            for (OrdemServiço ordemServiço : listaOS) {
                System.out.println(ordemServiço);
            }
        }
    }

    public void listaAparelhocaro() {
        listaOS.stream()
                .filter(p -> p.getValorOrcamento() > 2000)
                .forEach(System.out::println);
    }

    public void listarPorStatus(Status n) {
        listaOS.stream().filter(s -> s.getStatus().equals(n))
                .forEach(System.out::println);

    }
    public void listarPorId(int id){
        Optional<OrdemServiço > os = Optional.ofNullable(BUSCA.get(id));
        if(os.isPresent()){
            System.out.println(os.get());
        }else {
            System.out.println("Nenhum encontrado");
        }
    }

    public void removerPorId(int id){
        Optional<OrdemServiço > os = Optional.ofNullable(BUSCA.get(id));
        if(os.isPresent()){
            listaOS.remove(os.get());
            BUSCA.remove(id,os.get());
            System.out.println("OS # " + id + " removida com sucesso!");

        }else{
            System.out.println("Nenhum encontrado");
        }

    }

    public Optional<Cliente> buscarClientePorId(int id){
        Optional<Cliente > os = Optional.ofNullable(buscaRapida.get(id));
        if(os.isPresent()){
            System.out.println(os.get());
        }else {
            System.out.println("Você precisa cadastrar o cliente primeiro. ");
        }
        return os;
    }

    public static void menu(){
        System.out.println("\n--- ASSISTÊNCIA TÉCNICA DO MATEUS ---");
        System.out.println("1. Nova Ordem de Serviço");
        System.out.println("2. Listar Todas");
        System.out.println("3. Ver Faturamento");
        System.out.println("4. Cadastrar Cliente");
        System.out.println("0. Sair");
        System.out.print("Escolha: ");

    }
}
