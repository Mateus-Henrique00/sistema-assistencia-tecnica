package Model;

import java.util.Objects;

public class Cliente {
    private static int contador = 1;
    private String nome;
    private String telefone;
    private int ID;

    public Cliente(String nome, String telefone) {
        this.ID = contador++;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
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

