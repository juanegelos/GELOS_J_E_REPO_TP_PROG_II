package vehiculo_motor_conductor_1_7;

public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this){
            vehiculo.setConductor(this);
        }
    }
    
    public void mostrarVehiculo(){
        System.out.println("El conductor " + nombre + ", tiene asignado el vehiculo " +
                    vehiculo.getModelo() + " patente " + vehiculo.getPatente());
    }
}
