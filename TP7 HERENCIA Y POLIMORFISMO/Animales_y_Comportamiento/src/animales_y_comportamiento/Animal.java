package animales_y_comportamiento;

public class Animal {
    private String filo;
    private String clase;
    private String orden;
    private String familia;

    public Animal(String filo, String clase, String orden, String familia) {
        this.filo = filo;
        this.clase = clase;
        this.orden = orden;
        this.familia = familia;
    }
    
    public void hacerSonido(){
        System.out.println("El animal suena asi.....");
    }
    public void describirAnimal(){
        System.out.println("Este animal tiene las siguientes caracteristicas:");
    }
}
