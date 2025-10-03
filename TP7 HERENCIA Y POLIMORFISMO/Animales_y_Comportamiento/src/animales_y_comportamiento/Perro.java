package animales_y_comportamiento;

public class Perro extends Animal {

    public Perro(String filo, String clase, String orden, String familia) {
        super(filo, clase, orden, familia);
    }
        
    @Override
     public void hacerSonido(){
        System.out.println("Guau, guau, guau");
    }
    
    @Override
     public void describirAnimal(){
        System.out.println(" El perro es un mamifero carnivoro domesticado, "
                    + "conocido por su inteligencia y lealtad. Pertenecen a "
                    + "la familia de los canidos. Se utilizan como mascotas, "
                    + "animales de trabajo (pastoreo, rescate) y seguridad. "
                    + "Su estructura social y comunicacion son complejas, "
                    + "y se distinguen por su variada morfologia.");
    }
}
