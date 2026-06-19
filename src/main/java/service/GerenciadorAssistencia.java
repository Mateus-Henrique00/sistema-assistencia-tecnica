package service;

import model.Cliente;
import model.OrdemServico;
import model.Status;

import java.util.*;

public class GerenciadorAssistencia {


    public GerenciadorAssistencia() {
        //Metodo substituido
        //this.listaOS = ArquivoService.carregar();

        List<Cliente> clienteDoBanco = ClienteRepository.carregarDoBanco();
        for (Cliente c : clienteDoBanco) {
            this.clientes.add(c);
            this.buscaRapida.put(c.getID(), c);
        }

        List<OrdemServico> ordemServicosDB = OrdemServicoRepository.carregarDoBanco();
        for (OrdemServico o : ordemServicosDB){
            this.listaOS.add(o);
            this.BUSCA.put(o.getNumeroOS(),o);
        }



    }


    private OrdemServicoRepository ordemServicoRepository = new OrdemServicoRepository();
    private ClienteRepository clienteRepository = new ClienteRepository();
    private List<OrdemServico> listaOS = new ArrayList<>();
    private HashMap<Integer, OrdemServico> BUSCA = new HashMap<>();
    private Set<Cliente> clientes = new HashSet<>();
    private HashMap<Integer, Cliente> buscaRapida = new HashMap<>();

    public void CriarCadastro(Cliente cliente) {
        if (!clientes.add(cliente)) {
            System.out.println("Esses dados já tem Cadastro");

        } else {
            clienteRepository.salvar(cliente);
            buscaRapida.put(cliente.getID(), cliente);
            System.out.println("Cadastro realizado com sucesso");
        }


    }

    public void CriarOS(OrdemServico os) {
        listaOS.add(os);
        BUSCA.put(os.getNumeroOS(), os);
        //ArquivoService.salvar(listaOS);
        ordemServicoRepository.salvar(os);
        System.out.println("#OS" + os.getNumeroOS() + " Adicionado com sucesso!!!!!!!!");
    }

    public void listarTodos() {
        if (listaOS.isEmpty()) {
            System.out.println("Nenhum encontrado!!!!!!!!!!");
        } else {
            for (OrdemServico ordemServiço : listaOS) {
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

    public void listarPorId(int id) {
        Optional<OrdemServico> os = Optional.ofNullable(BUSCA.get(id));
        if (os.isPresent()) {
            System.out.println(os.get());
        } else {
            System.out.println("Nenhum encontrado");
        }
    }

    public void removerPorId(int id) {
        Optional<OrdemServico> os = Optional.ofNullable(BUSCA.get(id));
        if (os.isPresent()) {
            listaOS.remove(os.get());
            BUSCA.remove(id, os.get());
            ordemServicoRepository.remove(os.get());

            //ArquivoService.salvar(listaOS);
            System.out.println("OS # " + id + " removida com sucesso!");

        } else {
            System.out.println("Nenhum encontrado");
        }

    }

    public Optional<Cliente> buscarClientePorId(int id) {
        Optional<Cliente> os = Optional.ofNullable(buscaRapida.get(id));
        if (os.isPresent()) {
            System.out.println(os.get());
        } else {
            System.out.println("Você precisa cadastrar o cliente primeiro. ");
        }
        return os;
    }

    public static void menu() {
        System.out.println("\n--- ASSISTÊNCIA TÉCNICA DO MATEUS ---");
        System.out.println("1. Nova Ordem de Serviço");
        System.out.println("2. Listar Todas Ordem de Serviço");
        System.out.println("3. Listar OS por Status");
        System.out.println("4. Cadastrar Cliente novo");
        System.out.println("5. Remover OS por ID");
        System.out.println("0. Sair");
        System.out.print("Escolha: ");

    }
}
