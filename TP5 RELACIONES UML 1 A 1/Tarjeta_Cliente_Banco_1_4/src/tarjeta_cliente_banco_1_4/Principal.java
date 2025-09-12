package tarjeta_cliente_banco_1_4;
import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        Banco bbva = new Banco("BBVA", "33-12345688-1");
        Banco nacion = new Banco("Banco Nacion", "33-85477847-5");
        Cliente pablo = new Cliente("Pablo Matera", "27659554");
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("4452858569854712", LocalDate.of(2030, 9, 30), bbva);
        tarjeta1.setCliente(pablo);
        tarjeta1.mostrarClinte();
        pablo.mostrarTarjeta();
    }
}
