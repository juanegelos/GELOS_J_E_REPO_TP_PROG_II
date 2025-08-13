package modificaciones_de_arrays;
/**
 * @author juana
 */
public class Modificaciones_de_Arrays {
    public static void main(String[] args) {
        double[] precios = {199.99, 299.50, 149.79, 399.00, 89.99};
        System.out.println("PRECIOS ORIGINALES");
        mostrarPrecios(precios);
        precios[2] = 129.99;
        System.out.println("PRECIOS MODIFICADOS");
        mostrarPrecios(precios);
    }
    
    public static void mostrarPrecios(double[] precios){
        for (double precio : precios){
            System.out.println("Precio: " + precio);
        }
    }
}
