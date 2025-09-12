package impuesto_contribuyente_calculadora_1_12;

public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
}
