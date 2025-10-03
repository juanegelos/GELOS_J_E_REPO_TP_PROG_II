package figuras_geometricas;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; 
    }
}
