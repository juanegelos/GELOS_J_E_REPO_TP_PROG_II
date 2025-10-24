package lectura_archivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("=== Lectura de Archivo ===");
        
        try {
            File archivo = new File("datos.txt");
            Scanner scanner = new Scanner(archivo);
            
            System.out.println("Contenido del archivo:");
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                System.out.println(linea);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe - " + e.getMessage());
        }
    }
    
}
