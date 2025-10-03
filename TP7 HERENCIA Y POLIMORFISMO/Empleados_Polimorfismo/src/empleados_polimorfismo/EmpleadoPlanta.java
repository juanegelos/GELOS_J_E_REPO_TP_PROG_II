package empleados_polimorfismo;

public class EmpleadoPlanta extends Empleado {
    private final double VALOR_HORA = 1350;
    private String fechaIngreso;
    private boolean permanente;

    public EmpleadoPlanta(String fechaIngreso, boolean permanente, String legajo,
                String nombre, String dni, double horasTrabajadas) {
        super(legajo, nombre, dni, horasTrabajadas);
        this.fechaIngreso = fechaIngreso;
        this.permanente = permanente;
    }
    
    @Override
    public double calcularSueldo() {
        return VALOR_HORA * getHorasTrabajadas();
    }

    public double getVALOR_HORA() {
        return VALOR_HORA;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }
}
