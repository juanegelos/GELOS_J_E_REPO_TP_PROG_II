package sistema_de_pagos;

public class TarjetadeCredito implements Pagable{
    private String numeroTarjeta;
    
    public TarjetadeCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    @Override
    public void pagar(double monto) {
        String ultimosDigitos = numeroTarjeta.substring
            (numeroTarjeta.length() - 4);
        System.out.println("Pago efectuado con tarjeta Nª ************" +
                    ultimosDigitos +
                    ", por un monto de $ " + monto);
    }
}

