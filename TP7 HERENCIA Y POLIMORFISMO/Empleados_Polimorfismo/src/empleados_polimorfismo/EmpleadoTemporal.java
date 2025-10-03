package empleados_polimorfismo;

public class EmpleadoTemporal extends Empleado {
    private final double VALOR_HORA = 1550;
    private final double SEGURO_DESEMPLEO = 0.02;
    private String fechaIngreso;
    private String fechaFinalizacion;

    public EmpleadoTemporal(String fechaIngreso, String fechaFinalizacion, 
                String legajo, String nombre, String dni, double horasTrabajadas) {
        super(legajo, nombre, dni, horasTrabajadas);
        this.fechaIngreso = fechaIngreso;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    @Override
    public double calcularSueldo(){
        return VALOR_HORA * getHorasTrabajadas() - VALOR_HORA * getHorasTrabajadas() * 
                    SEGURO_DESEMPLEO;
    }

    public double getVALOR_HORA() {
        return VALOR_HORA;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }
}
