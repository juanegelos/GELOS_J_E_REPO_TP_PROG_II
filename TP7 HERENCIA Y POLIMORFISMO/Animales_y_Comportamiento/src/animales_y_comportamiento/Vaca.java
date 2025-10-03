package animales_y_comportamiento;

public class Vaca extends Animal {

    public Vaca(String filo, String clase, String orden, String familia) {
        super(filo, clase, orden, familia);
    }
    
    @Override
     public void hacerSonido(){
        System.out.println("Muuuu, muuuu, muuu");
    }
    
    @Override
     public void describirAnimal(){
        System.out.println(" La vaca es un  mamiferos herbivoros rumiantes "
                    + "de la familia de los bovidos, criados principalmente "
                    + "por los humanos para obtener leche y carne. Tienen un "
                    + "estomago dividido en cuatro compartimentos. "
                    + "Son animales sociales, domesticados hace miles de a#os,"
                    + " y fundamentales en la agricultura y economia global.");
    }
}
