package variables_por_usuarrio;

import java.util.Scanner;

/**
 * @author juana
 */
public class Variables_Por_Usuarrio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        System.out.println("Su nombre es: " + nombre + " y tiene " + edad +
                  " años");
    }
    
}
