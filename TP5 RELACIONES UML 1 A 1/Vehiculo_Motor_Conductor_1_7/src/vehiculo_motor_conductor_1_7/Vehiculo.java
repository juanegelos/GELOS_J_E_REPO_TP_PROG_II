package vehiculo_motor_conductor_1_7;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Conductor getConductor() {
        return conductor;
    }
    
    public void setConductor(Conductor conductor){
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo()!= this){
            conductor.setVehiculo(this);
        }
    }
    
    public void mostrarVehiculo(){
        System.out.println("Vehiculo modelo " + modelo + " patente " + patente +
                    ", motor " + motor.getTipo() + ", conducido por " + 
                    conductor.getNombre());
    }
}
