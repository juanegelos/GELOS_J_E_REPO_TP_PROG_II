package impuesto_contribuyente_calculadora_1_12;

public class Contribuyente {
    private String nombre;
    private String cuit;

    public Contribuyente(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }
}
