package sistema_registro_libros;

public class Principal {

    public static void main(String[] args) {
        Libro libro1= new Libro("Ficciones", "Jorge Luis Borges");
        System.out.println(libro1.toString());
        libro1.setEditorial("Sudamericana");
        System.out.println(libro1.toString());
        libro1.actualizarTitulo("Nueva Edicion", "Nuestras Ficciones");
        System.out.println(libro1.toString());
        
        Libro libro2 = new Libro("Rayuela", "Julio Cortazar", "Alfaguara");
        System.out.println(libro2.toString());
        libro2.actualizarTitulo("RAYUELA");
        System.out.println(libro2.toString());
    
    }
}