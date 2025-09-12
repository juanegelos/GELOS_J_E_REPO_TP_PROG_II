package sistema_registro_libros;

public class Libro {
    private String titulo;
    private String autor;
    private static String editorial = "INDEPENDIENTES";

    public Libro(String titulo, String autor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
    }
    
    public Libro(String titulo, String autor, String editorial) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setEditorial(editorial);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null){
        this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor != null){
        this.autor = autor;
        }
    }
    
    public void actualizarTitulo(String titulo){
        this.setTitulo(titulo);
    }
    public void actualizarTitulo(String prefijo, String titulo){
        this.setTitulo(prefijo + " " + titulo);
    }
    
    public void setEditorial(String editorial){
        if (editorial != null){
        Libro.editorial = editorial;
        }
    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo=" + titulo + ", Autor=" + autor + ", Editorial=" + Libro.editorial + "}";
    }
    
    
}
