package calcular_precio_final_8;
import java.util.Scanner;
/**
 * @author juana
 */
public class Calcular_Precio_Final_8 {
    public static void main(String[] args) {
        double preciobase, descuento, impuesto;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        preciobase = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
        impuesto = Double.parseDouble(input.nextLine());
        System.out.print("ingrese el descuento en porcentaje (Ej: 15 para 15%)");
        descuento = Double.parseDouble(input.nextLine());
        System.out.println("El precio final del producto es: " + calcularPrecioFinal(preciobase, impuesto, descuento));
    }
    public static double calcularPrecioFinal(double preciobase, double impuesto, double descuento){
        double preciofinal;
        preciofinal = preciobase + (preciobase * impuesto/100) - (preciobase * descuento/100);
        return preciofinal;
    }
}
