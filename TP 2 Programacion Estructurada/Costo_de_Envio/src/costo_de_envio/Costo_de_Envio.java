package costo_de_envio;
import java.util.Scanner;
/**
 * @author juana
 */
public class Costo_de_Envio {
    public static void main(String[] args) {
        double precio, peso;
        String zona;
        Scanner input = new Scanner(System.in);    
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el peso del paquete: ");
        peso = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        zona = input.nextLine();
        double costoEnvio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + calcularTotalCompra(precio, costoEnvio));
    }   
    
    public static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio;
        if (zona.equals("Nacional")){
            costoEnvio = peso * 5;
        }else{
            costoEnvio = peso * 10;
        }
        return costoEnvio;
    }
    
    public static double calcularTotalCompra(double precio, double costoEnvio){
        return precio + costoEnvio;
    }
}
