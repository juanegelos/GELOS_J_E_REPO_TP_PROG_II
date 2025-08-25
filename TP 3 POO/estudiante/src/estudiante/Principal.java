package estudiante;

public class Principal {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.mostrarInfo();
        
        estudiante1.setNombre("Carlos");
        estudiante1.setApellido("Tevez");
        estudiante1.setCurso("Defensa I");
        
        estudiante1.mostrarInfo();  
        
        estudiante1.aumentarCalificacion(5);
        estudiante1.mostrarInfo();  
        estudiante1.aumentarCalificacion(6);
        estudiante1.mostrarInfo();  
        estudiante1.bajarCalificacion(4);
        estudiante1.mostrarInfo();  
        estudiante1.bajarCalificacion(8);
        estudiante1.mostrarInfo();  
    }
    
}
