package actualizacion_de_stock;
import java.util.Scanner;
/**
 * @author juana
 */
public class Actualizacion_de_Stock {
    public static void main(String[] args) {
        int stockActual, ventas, compras;
        Scanner input = new Scanner(System.in); 
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad vendida: ");
        ventas = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad recibida: ");
        compras = Integer.parseInt(input.nextLine());
        System.out.println("El nuevo Stock del producto es: " + actualizarStock(stockActual, compras, ventas));
        
    }
    
    public static int actualizarStock(int stA, int comp, int ven){
        return stA + comp - ven;
    }
}
