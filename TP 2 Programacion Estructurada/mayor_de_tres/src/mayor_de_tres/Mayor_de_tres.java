package mayor_de_tres;
import java.util.Scanner;
/**
 * @author juana
 */
public class Mayor_de_tres {
    public static void main(String[] args) {
        int num, mayor;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresará tres numeros enteros y determinaremos cual"
                    + " es el mayor.");
        System.out.print("Ingrese el número 1: ");
        mayor = Integer.parseInt(input.nextLine());
        
        for (int i = 2; i <= 3; i++) {
            System.out.print("Ingrese el número " + i + " : ");
            num = Integer.parseInt(input.nextLine());
            if (num > mayor){
                mayor = num;
            }
        }
        System.out.println("El mayor es: " + mayor);
    }
    
}
