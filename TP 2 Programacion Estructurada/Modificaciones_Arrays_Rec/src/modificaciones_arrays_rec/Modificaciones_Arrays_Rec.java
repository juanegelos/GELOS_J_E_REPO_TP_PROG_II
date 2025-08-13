package modificaciones_arrays_rec;
/**
 * @author juana
 */
public class Modificaciones_Arrays_Rec {

    public static void main(String[] args) {
        double[] precios = {599.99, 24.50, 749.79, 125.00, 128.99};
        System.out.println("PRECIOS ORIGINALES");
        mostrarPrecios(precios, 0);
        precios[2] = 133.99;
        System.out.println("PRECIOS MODIFICADOS");
        mostrarPrecios(precios, 0);
    }
    
    public static void mostrarPrecios(double[] precios, int index){
        if (index >= precios.length){
        }else{
            System.out.println("Precio: " + precios[index]);
            mostrarPrecios(precios, index + 1);
        }
    }
}
