package division;

import java.util.Scanner;
/**
 * @author juana
 */
public class Division {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int numero1, numero2; // Opcion con enteros
        double numero1, numero2;
        System.out.println("DIVISION CON NUMEROS DECIMALES");
        System.out.print("Ingrese un numero: ");
        //numero1 = Integer.parseInt(input.nextLine());
        numero1 = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese otro numero: ");
        //numero2 = Integer.parseInt(input.nextLine());
        numero2 = Double.parseDouble(input.nextLine());
        
        System.out.println("Los números ingresados son: " + numero1 + " y " + 
                    numero2);
        System.out.println("La división es: " + ( numero1 / numero2));
    }
    
}
