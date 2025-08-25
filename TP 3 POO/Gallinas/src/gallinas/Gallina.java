package gallinas;

public class Gallina {
    private int IdGallina;
    private int edad; //Edad expresado en numero de semanas
    private int huevosPuestos;
    
    public Gallina(int IdGallina, int edad, int huevosPuestos) {
        this.IdGallina = IdGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevo() {
        huevosPuestos ++;
    }
    
    public void envejecer(){
        edad ++;
    }
    
    public void mostrarEstado(){
        System.out.println("Id: " + IdGallina + ": Edad (semanas): " + edad +
                    "; Huevos puestos: " + huevosPuestos);
    }
                
}
