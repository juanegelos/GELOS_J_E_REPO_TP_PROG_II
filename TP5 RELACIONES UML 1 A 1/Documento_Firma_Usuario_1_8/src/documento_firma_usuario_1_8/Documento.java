package documento_firma_usuario_1_8;
import java.time.LocalDateTime;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;
   

    public Documento(String titulo, String contenido, String firma, 
                LocalDateTime fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(firma, fecha, usuario);
      }
    
    public void mostrarDocumento(){
        System.out.println("Titulo: " + titulo + ", Contenido: " + contenido +
                    ", Firma digital: " + firma.getCodigoHash() + ", Fecha: " +
                    firma.getFecha() + ", Usuario: " + 
                    firma.getUsuario().getNombre());
    }
}
