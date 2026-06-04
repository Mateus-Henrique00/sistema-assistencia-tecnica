package Model;

public class Notebook extends Dispositivo implements Garantia {
    protected String voltagem;
    protected String senhaBios;


    public Notebook(int imeiSerie, String marca, String modelo) {
        super(imeiSerie, marca, modelo);
    }

    public Notebook(int imeiSerie, String marca, String modelo, String senhaBios, String voltagem) {
        super(imeiSerie, marca, modelo);
        this.senhaBios = senhaBios;
        this.voltagem = voltagem;
    }


    @Override
    public String toString() {
        return super.toString() + "Notebook{" +
                "voltagem='" + voltagem + '\'' +
                ", senhaBios='" + senhaBios + '\'' +
                '}';
    }

    @Override
    public void calcularGarantia() {
        System.out.println("Garantia de 6 Meses");
    }
}
