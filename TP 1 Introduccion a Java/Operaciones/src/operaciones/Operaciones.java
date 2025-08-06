package operaciones;
import java.util.Scanner;
/**
 * @author juana
 */
public class Operaciones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("OPERACIONES CON NUMEROS ENTEROS");
        System.out.print("Ingrese un numero entero: ");
        numero1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese otro numero entero: ");
        numero2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Los números ingresados son: " + numero1 + " y " + 
                    numero2);
        System.out.println("La suma es: " + (numero1 + numero2) + "\nLa resta "
                    + "es: " + (numero1 - numero2) + "\nLa multiplicación es: "
                    + (numero1 * numero2) + "\nLa división es: " + 
                    ((double) numero1 / numero2));
    }
    
}
