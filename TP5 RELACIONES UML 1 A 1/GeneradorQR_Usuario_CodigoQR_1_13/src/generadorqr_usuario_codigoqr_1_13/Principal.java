package generadorqr_usuario_codigoqr_1_13;

public class Principal {

    public static void main(String[] args) {
        Usuario javier = new Usuario("Javier Limei", "vllc@gmail.com");
        GeneradorQR.generar("www.vllc.com.ar", javier);
    }    
}
