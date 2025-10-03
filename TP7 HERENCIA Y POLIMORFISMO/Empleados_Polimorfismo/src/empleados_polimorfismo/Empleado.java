package empleados_polimorfismo;

public abstract class Empleado {
    private String legajo;
    private String nombre;
    private String dni;
    private double horasTrabajadas;

    public Empleado(String legajo, String nombre, String dni, double 
                horasTrabajadas) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
    }

    public abstract double calcularSueldo();

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
}
