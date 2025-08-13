package suma_numeros_pares;
import java.util.Scanner;
/**
 * @author juana
 */
public class Suma_numeros_pares {
    public static void main(String[] args) {
        int num, suma;
        Scanner input = new Scanner(System.in);
        suma = 0;
        do{
            System.out.print("Ingrese un numero (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
            if (num % 2 == 0){
                suma += num;
            }
        }while (num != 0);
        System.out.println("La suma de los numeros pares es: " + suma);
    }
}
