package clasificacion_edad;
import java.util.Scanner;
/**
 * @author juana
 */
public class Clasificacion_Edad {
    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        if (edad <= 0){
            System.out.println("ERROR, edad incorrecta");
            return;
        }
        
        if (edad < 12){
            System.out.println("Eres un niño");
        }else if (edad <= 17 && 12 <= edad){
            System.out.println("Eres un adolecente");
        }else if (edad <= 59 && 18 <= edad){
            System.out.println("Eres un adulto");
        }else{
            System.out.println("Eres un adulto mayor");
        }
    }
}
