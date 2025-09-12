package libro_autor_editorial_1_3;

public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    
    public void mostrarLibro(){
        System.out.println("Titulo: " + titulo + ", Autor: " + autor.getNombre() 
                    + ", Editorial: " + editorial.getNombre());
    }
}
