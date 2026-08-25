package com.Mateus.assistencia_tecnica_api.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

        @NotBlank(message = "Nome é obrigatorio")
        private String nome;
        @NotBlank(message = "Telefone é obrigatorio")
        private String telefone;

        public Cliente() {
        }

        public Cliente(String nome, String telefone) {
            this.nome = nome;
            this.telefone = telefone;
        }

    public long getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
        public String toString() {
            return "Cliente{" +
                    "nome='" + nome + '\'' +
                    ", telefone='" + telefone + '\'' +
                    ", ID=" + ID +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Cliente cliente = (Cliente) o;
            return Objects.equals(nome, cliente.nome) && Objects.equals(telefone, cliente.telefone);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, telefone);
        }
}
