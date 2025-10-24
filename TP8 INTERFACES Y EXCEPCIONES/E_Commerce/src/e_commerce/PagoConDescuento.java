package e_commerce;

public interface PagoConDescuento {
    void procesarPago(double monto);
    void aplicarDescuento(double descuento);
}
