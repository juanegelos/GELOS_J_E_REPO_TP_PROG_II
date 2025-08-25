package libro;
import java.time.LocalDate;
            
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    LocalDate fechaActual = LocalDate.now();
    int anioActual = fechaActual.getYear();

    public Libro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if ((anioPublicacion > anioActual) || (anioPublicacion < 0)){
            System.out.println("Fecha de publicacion mal ingresada");
        }else{
            this.anioPublicacion = anioPublicacion;
        }
    }
}
