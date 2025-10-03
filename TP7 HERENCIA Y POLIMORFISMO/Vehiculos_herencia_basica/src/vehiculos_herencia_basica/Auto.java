package vehiculos_herencia_basica;

public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
     public String mostrarInfo(){
         return super.mostrarInfo() + ", con " + cantidadPuertas + " puertas.";
     }
}
