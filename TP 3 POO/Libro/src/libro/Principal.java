package libro;

public class Principal {

    public static void main(String[] args) {
        Libro book1 = new Libro("Rayuela", "Julio Cortazar");
        
        System.out.println("Autor: " + book1.getAutor());
        System.out.println("Titulo: " + book1.getTitulo());
        System.out.println("Fecha de Publicacion: " + book1.getAnioPublicacion());
        
        book1.setAnioPublicacion(2032);
        System.out.println("Fecha de Publicacion: " + book1.getAnioPublicacion());
        
        book1.setAnioPublicacion(1963);
        System.out.println("Fecha de Publicacion: " + book1.getAnioPublicacion());
    }
    
}
