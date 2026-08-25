package com.Mateus.assistencia_tecnica_api.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.LocalDate;



@Entity
@Table(name = "Ordem_Servico")
public class OrdemServico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_OS")
    private int numeroOS;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cliente_ID")
    private Cliente cliente;
    @NotBlank(message = "Modelo do aparelho é obrigatorio")
    private String aparelho;
    @NotNull(message = "Valor é obrigatorio")
    @Positive(message = "Valor deve ser maior que zero")
    private double valorOrcamento;

    @Column(name = "dataAbertura")
    private LocalDate dataAbertura;

    @Column(name = "dataFinalizada")
    private LocalDate dataFinalizada;

    @NotNull(message = "Status é obrigatorio")
    @Enumerated(EnumType.STRING)
    private Status status;

    public OrdemServico() {
    }

    public OrdemServico(String aparelho, Cliente cliente, Status status, double valorOrcamento) {
        this.aparelho = aparelho;
        this.cliente = cliente;
        this.status = status;
        this.valorOrcamento = valorOrcamento;
        this.dataAbertura = LocalDate.now();
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

    public long getNumeroOS() {
        return numeroOS;
    }

    public void setNumeroOS(int numeroOS) {
        this.numeroOS = numeroOS;
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

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDate getDataFinalizada() {
        return dataFinalizada;
    }

    public void setDataFinalizada(LocalDate dataFinalizada) {
        this.dataFinalizada = dataFinalizada;
    }

    @Override
    public String toString() {
        return "OrdemServico{" +
                "NumeroOS=" + numeroOS +
                ", cliente=" + cliente +
                ", aparelho='" + aparelho + '\'' +
                ", valorOrcamento=" + valorOrcamento +
                ", dataAbertura=" + dataAbertura +
                ", dataFinalizada=" + dataFinalizada +
                ", status=" + status +
                '}';
    }
}
