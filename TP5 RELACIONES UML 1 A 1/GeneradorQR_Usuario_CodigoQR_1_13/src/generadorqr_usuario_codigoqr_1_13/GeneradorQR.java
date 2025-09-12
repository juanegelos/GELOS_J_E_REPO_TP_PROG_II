package generadorqr_usuario_codigoqr_1_13;

public class GeneradorQR {
    
    public static void generar(String valor, Usuario usuario){
        CodigoQR qr1 = new CodigoQR(valor);
        qr1.setUsuario(usuario);
    }
}
