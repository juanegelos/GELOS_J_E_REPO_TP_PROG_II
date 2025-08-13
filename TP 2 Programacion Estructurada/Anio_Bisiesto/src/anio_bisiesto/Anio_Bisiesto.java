package anio_bisiesto;

import java.util.Scanner;

/**
 * @author juana
 */
public class Anio_Bisiesto {
    public static void main(String[] args) {
        int anio;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el año a determinar: ");
        anio = Integer.parseInt(input.nextLine());
        
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0){
            System.out.println("El año " + anio + " es bisiesto");
        }else{
            System.out.println("El año " + anio + " no es bisiesto");
        }
    }
}
