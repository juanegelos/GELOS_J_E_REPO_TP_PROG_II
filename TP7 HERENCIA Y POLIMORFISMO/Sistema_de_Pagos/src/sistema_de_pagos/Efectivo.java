package sistema_de_pagos;

public class Efectivo implements Pagable {
         
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando en efectivo un monto de $ " + monto);
    }
}
