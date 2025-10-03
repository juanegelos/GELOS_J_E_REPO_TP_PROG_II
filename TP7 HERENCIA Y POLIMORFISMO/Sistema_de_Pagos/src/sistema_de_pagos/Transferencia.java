package sistema_de_pagos;

public class Transferencia implements Pagable{
    private String cuentaOrigen;
    
    public Transferencia(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }
    @Override
    public void pagar(double monto) {
        String ultimosDigitos = cuentaOrigen.substring
            (cuentaOrigen.length() - 10);
        System.out.println("Pago por transferencia desde cuenta "
                    + "N ************ " + ultimosDigitos + 
                    ", por un monto de $ " + monto);
    }
}
