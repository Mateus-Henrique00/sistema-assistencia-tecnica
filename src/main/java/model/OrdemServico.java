package model;

import jakarta.persistence.*;


@Entity
@Table(name = "Ordem_Servico")
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_OS")
    private int NumeroOS;

    @ManyToOne
    private Cliente cliente;

    private String aparelho;
    private double valorOrcamento;

    @Enumerated(EnumType.STRING)
    private Status status;

    public OrdemServico() {
    }

    public OrdemServico(String aparelho, Cliente cliente, Status status, double valorOrcamento) {
        this.aparelho = aparelho;
        this.cliente = cliente;
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

    public int getNumeroOS() {
        return NumeroOS;
    }

    public void setNumeroOS(int numeroOS) {
        this.NumeroOS = numeroOS;
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
        return "OrdemServico{" +
                "aparelho='" + aparelho + '\'' +
                ", id Cliente=" + cliente.getID()+
                ", N° OS=" + NumeroOS +
                ", telefone=" + cliente.getTelefone() +
                ", cliente=" + cliente.getNome() + '\'' +
                ", valorOrcamento=" + valorOrcamento +
                ", status=" + status +
                '}';
    }
}
