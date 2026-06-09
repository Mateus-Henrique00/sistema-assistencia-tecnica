package model;

public class Smartphone extends Dispositivo implements Garantia {
    protected int imei;
    protected boolean telaQuebrada;
    protected int numeroChip;
    protected String sistemaOperacional;

    public Smartphone(int imeiSerie, String marca, String modelo) {
        super(imeiSerie, marca, modelo);
    }


    public Smartphone(int imeiSerie, String marca, String modelo, int imei, boolean telaQuebrada, int numeroChip, String sistemaOperacional) {
        super(imeiSerie, marca, modelo);
        this.imei = imei;
        this.telaQuebrada = telaQuebrada;
        this.numeroChip = numeroChip;
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString() {
        return  super.toString() + "Smartphone{" +
                "numeroChip=" + numeroChip +
                ", sistemaOperacional='" + sistemaOperacional + '\'' +
                '}';
    }

    @Override
    public void calcularGarantia() {
        System.out.println("garantia de 3 Meses");
    }
}
