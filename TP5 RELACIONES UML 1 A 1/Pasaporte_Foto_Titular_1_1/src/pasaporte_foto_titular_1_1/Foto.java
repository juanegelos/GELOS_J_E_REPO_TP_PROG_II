package pasaporte_foto_titular_1_1;

public class Foto {
    private String url;
    private String formato;

    public Foto(String url, String formato) {
        this.url = url;
        this.formato = formato;
    }
    
    public String mostrarFoto(){
        return url + "." + formato;
    }
}
