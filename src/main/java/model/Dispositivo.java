package model;

public class Dispositivo {
    protected String marca;
    protected String modelo;
    protected int ImeiSerie;

    public Dispositivo(int imeiSerie, String marca, String modelo) {
        ImeiSerie = imeiSerie;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ImeiSerie=" + ImeiSerie +
                '}';
    }
}
