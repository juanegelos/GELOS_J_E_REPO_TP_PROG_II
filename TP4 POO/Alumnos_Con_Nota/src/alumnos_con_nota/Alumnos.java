package alumnos_con_nota;

public class Alumnos {
    private String nombre;
    private double promedio;
    private static double notaAprobar = 6;

    public Alumnos(String nombre) {
        this.setNombre(nombre); 
        this.promedio = 0.0;
    }

    public Alumnos(String nombre, double promedio) {
        this.setNombre(nombre);
        this.setPromedio(promedio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null){
        this.nombre = nombre;
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (0 <= promedio && promedio <= 10){
        this.promedio = promedio;
        }
    }
    
    public void setPromedio(double[] nuevoPromedio){
        this.setPromedio(Alumnos.calcularPromedio(nuevoPromedio));
    }
    private static double calcularPromedio(double[] notas){
        if (notas == null || notas.length == 0){
            return 0.0;
        }
        double nuevoPromedio = 0;
        for (double nota : notas){
            nuevoPromedio += nota;
        }
        return nuevoPromedio / notas.length; 
    }
    
    public boolean aprobo(){
        return promedio >= Alumnos.notaAprobar;
    }

    public static void setNotaAprobar(double nuevaNota){
        if(0 <= nuevaNota && nuevaNota <= 10){
        Alumnos.notaAprobar = nuevaNota;
        }else {
            System.out.println("La nota no se ha actualizado por dato erroneo");
        }
    }
    public static double getNotaAprobar(){
        return Alumnos.notaAprobar;
    }
    
    @Override
    public String toString() {
        return "nombre=" + "Alumnos{" + nombre + ", promedio=" + promedio + ", Aprobado=" + this.aprobo() + '}';
    }
    
    
}
