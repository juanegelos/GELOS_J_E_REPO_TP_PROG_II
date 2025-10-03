package vehiculos_herencia_basica;

public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public String mostrarInfo(){
        return "Vehiculo marca: " + marca+ ", Modelo: " + modelo;
    }
}
