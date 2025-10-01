package biblioteca_tp6;

public class Libro {
    private String isbn;
    private String titulo;
    private int anio;
    private Autor autor;

    public Libro(String isbn, String titulo, int anio, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void mostrarInfo(){
        System.out.println("ISBN: " + isbn + ", Titulo: " + titulo + 
                    ",  A#o: " + anio + ", Autor: " + autor.getNombre() + 
                    ", Nacionalidad: " + autor.getNacionalidad());
    }
}
