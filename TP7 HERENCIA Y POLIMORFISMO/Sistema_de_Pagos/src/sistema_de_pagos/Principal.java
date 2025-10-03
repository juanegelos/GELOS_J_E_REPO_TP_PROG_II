package sistema_de_pagos;

public class Principal {

    public static void main(String[] args) {
        Pagable tarjeta = new TarjetadeCredito("4555852174549685");
        Pagable trans = new Transferencia("2001000005866598500000");
        Pagable efectivo = new Efectivo();
        
        procesarPago(tarjeta, 5000.00);
        procesarPago(trans, 23000.0);
        procesarPago(efectivo, 15000.0);
    }
    public static void procesarPago(Pagable medio, double monto){
            medio.pagar(monto);
        }
}