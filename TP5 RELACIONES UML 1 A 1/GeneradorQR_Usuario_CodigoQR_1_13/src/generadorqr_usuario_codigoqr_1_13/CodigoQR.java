package generadorqr_usuario_codigoqr_1_13;

public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }
}
