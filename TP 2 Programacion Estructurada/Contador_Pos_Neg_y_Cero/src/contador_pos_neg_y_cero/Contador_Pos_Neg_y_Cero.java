package contador_pos_neg_y_cero;
import java.util.Scanner;
/**
 * @author juana
 */
public class Contador_Pos_Neg_y_Cero {
    public static void main(String[] args) {
          int num, contPos, contNeg, contC;
        Scanner input = new Scanner(System.in);
        contPos = 0; contNeg = 0; contC = 0;
        for (int i=1; i<=10; i++){
            System.out.print("Ingrese el número " + i + " :");
            num = Integer.parseInt(input.nextLine());
            if (num > 0){
                contPos +=1;
            }else if (num < 0){
                contNeg +=1;
            }else{
                contC +=1;
            }
        } 
        System.out.println("Resultados: Positivos: " + contPos +
                    " Negativos: " + contNeg + " Ceros: " + contC);
    }
    
}
