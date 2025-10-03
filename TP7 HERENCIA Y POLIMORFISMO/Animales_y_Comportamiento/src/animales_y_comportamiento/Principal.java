package animales_y_comportamiento;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("Vertebrado", "Mamifero", "Carnivoro", "Canidos"));
        animales.add(new Gato("Vertebrado", "Mamifero", "Carnivoro", "Felidos"));
        animales.add(new Vaca("Vertebrado", "Mamifero", "Hervivoro", "Bovido"));
        
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
        
        for (Animal animal : animales) {
            animal.describirAnimal();
        }
        
    }
    
}
