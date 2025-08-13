package validacion_de_notas;
import java.util.Scanner;
/**
 * @author juana
 */
public class Validacion_de_notas {
    public static void main(String[] args) {
        double nota;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.print("Ingrese una nota (0-10): ");
            nota = Double.parseDouble(input.nextLine());
            if (nota > 10 || nota < 0 ){
                System.out.println("ERROR. Ingrese una nota entre 0 y 10");
            }
        }while (nota > 10 || nota < 0 );
        System.out.println("Nota guardada correctamente");
    }
}
