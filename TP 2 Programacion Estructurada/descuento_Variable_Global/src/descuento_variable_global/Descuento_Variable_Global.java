package descuento_variable_global;
import java.util.Scanner;
/**
 * @author juana
 */
public class Descuento_Variable_Global {
    
    public static final double DESCUENTO = 0.10;

    public static void main(String[] args) {
        double precio, dto;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        dto = calcularDescuentoEspecial(precio);
        System.out.println("El descuento especial aplicado es de: " + dto);
        System.out.println("El precio final con descuento es de: " + (precio - dto));
    }
    
    public static double calcularDescuentoEspecial(double valor){
        return valor * DESCUENTO;
        }
}
