import model.Cliente;
import model.OrdemServico;
import model.Status;
import service.ArquivoService;
import service.GerenciadorAssistencia;
import service.HibernateUtil;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        GerenciadorAssistencia gerenciador = new GerenciadorAssistencia();
        Scanner sc = new Scanner(System.in);

        try {
            HibernateUtil.getSessionFactory();
            System.out.println("Conexão com banco OK!");
        } catch (Exception e) {
            System.out.println("Erro na conexão: " + e.getMessage());
        }


        //menu de interação
        GerenciadorAssistencia.menu();

        int op = sc.nextInt();
        sc.nextLine();

        while (op != 0) {

            switch (op) {
                case 1:

                    System.out.println("Digite o ID do Cliente");
                    int id = sc.nextInt();
                    sc.nextLine();
                    var C = gerenciador.buscarClientePorId(id);

                    if (C.isPresent()) {
                        Cliente encontrado = C.get();

                        System.out.println("Digite o modelo: ");
                        String modelo = sc.nextLine();

                        System.out.println("Digite o Status: ");
                        String stts = sc.nextLine().toUpperCase();
                        Status st = null;
                        try {
                            st = Status.valueOf(stts);
                        } catch (IllegalArgumentException e) {
                            System.out.println("Você digitou algo invalido!!!!");
                        }

                        System.out.println("Digite o valor: ");
                        double v = sc.nextDouble();
                        sc.nextLine();
                        OrdemServico os1 = new OrdemServico(modelo, encontrado, st, v);
                        gerenciador.CriarOS(os1);
                    } else {
                        System.out.println("Cliente não encontrado! Cadastre primeiro no menu 4.");
                    }
                    break;

                case 2:
                    gerenciador.listarTodos();
                    break;
                case 3:
                    System.out.println("digite o STATUS: ");
                    String s = sc.nextLine().toUpperCase();
                    Status sttss = null;
                    try {
                        sttss = Status.valueOf(s);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Você digitou algo invalido!!!!");
                    }
                    gerenciador.listarPorStatus(sttss);
                    break;

                case 4:
                    System.out.println("Digite o nome: ");
                    String nCliente = sc.nextLine();
                    System.out.println("Digite o Telefone: ");
                    String numeroCliente = sc.nextLine();

                    Cliente cliente = new Cliente(nCliente, numeroCliente);
                    gerenciador.CriarCadastro(cliente);

                    break;
                case 5:
                    System.out.println("Digite o ID da remover a OS");
                    int RV = sc.nextInt();
                    gerenciador.removerPorId(RV);
                    break;

                case 6:
                    System.out.println("Digite o número da OS para atualizar");
                    int n = sc.nextInt();
                    sc.nextLine();
                    gerenciador.finalizarOS(n);

                    break;
            }
            //Menu de interação

            GerenciadorAssistencia.menu();
            op = sc.nextInt();
            sc.nextLine();

        }
        sc.close();
        System.out.println("Saindo...");
    }
}
