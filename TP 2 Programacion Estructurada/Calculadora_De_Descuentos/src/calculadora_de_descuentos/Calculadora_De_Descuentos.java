package calculadora_de_descuentos;
import java.util.Scanner;
/**
 * @author juana
 */
public class Calculadora_De_Descuentos {
    public static void main(String[] args) {
        double precio;
        char cat;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la categoría (A, B, o C): ");
        cat = input.nextLine().charAt(0);
        
        switch (cat) {
            case 'a', 'A': 
                System.out.println("Descuento aplicado 10%");
                System.out.println("El precio final es: " + (precio - precio * 0.1));
                break;
            case 'b', 'B': 
                System.out.println("Descuento aplicado 15%");
                System.out.println("El precio final es: " + (precio - precio * 0.15));
                break;
            case 'c', 'C': 
                System.out.println("Descuento aplicado 20%");
                System.out.println("El precio final es: " + (precio - precio * 0.2));
                break;
            default:
                System.out.println("La categoría ingresada no es válida");
                break;
        }       
    }
}
    
