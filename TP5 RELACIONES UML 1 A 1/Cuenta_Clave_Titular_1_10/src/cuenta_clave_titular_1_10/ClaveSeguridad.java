package cuenta_clave_titular_1_10;
import java.time.LocalDate;

public class ClaveSeguridad {
    private String codigo;
    private LocalDate ultimaModificacion;

    public ClaveSeguridad(String codigo, LocalDate ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }
    
    public void modificarClave(String codigo, LocalDate fechaModificacion){
        this.codigo = codigo;
        this.ultimaModificacion = fechaModificacion;
                    
    }

    public LocalDate getUltimaModificacion() {
        return ultimaModificacion;
    }

    public String getCodigo() {
        return codigo;
    }
}
