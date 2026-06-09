package model;

public class OrdemServico {

    private static int contador = 0;
    private int id;
    private Cliente cliente;
    private String aparelho;
    private double valorOrcamento;
    private Status status;

    public OrdemServico(String aparelho, Cliente cliente, Status status, double valorOrcamento) {
        this.aparelho = aparelho;
        this.cliente = cliente;
        this.id = ++contador;;
        this.status = status;
        this.valorOrcamento = valorOrcamento;
    }

    public String getAparelho() {
        return aparelho;
    }

    public void setAparelho(String aparelho) {
        this.aparelho = aparelho;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(double valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    @Override
    public String toString() {
        return "OrdemServiço{" +
                "aparelho='" + aparelho + '\'' +
                ", id=" + id +
                ", telefone=" + cliente.getTelefone() +
                ", cliente=" + cliente.getNome() + '\'' +
                ", valorOrcamento=" + valorOrcamento +
                ", status=" + status +
                '}';
    }
}
