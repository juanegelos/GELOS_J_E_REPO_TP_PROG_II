package pasaporte_foto_titular_1_1;
import java.time.LocalDate;

public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Titular titular;
    private Foto foto;
    
    public Pasaporte(String numero, LocalDate fechaEmision, String urlFoto, 
                String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(urlFoto, formato);
    }
    
    public void setTitular(Titular titular){
        this.titular = titular;
        if (titular != null && titular.getPasaporte()!= this){
            titular.setPasaporte(this);
        }
    }
    public Titular getTitular(){
        return titular;
    }
    public String getNumero() {
        return numero;
    }
    public void mostrar(){
        System.out.println("Pasaporte: "+ numero + ", Fecha de emision: " + 
                    fechaEmision + ", Url foto:" + foto.mostrarFoto());
    }
}
