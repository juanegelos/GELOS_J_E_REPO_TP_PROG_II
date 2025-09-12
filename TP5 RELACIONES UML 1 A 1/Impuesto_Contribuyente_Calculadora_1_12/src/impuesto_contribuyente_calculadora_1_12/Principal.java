package impuesto_contribuyente_calculadora_1_12;

import java.util.HashSet;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {
        Contribuyente amado = new Contribuyente("Amado Boudo", "20-19456987-2");
        Impuesto automotor = new Impuesto(12000);
        automotor.setContribuyente(amado);
        Calculadora.calcular(automotor);
     }
}
