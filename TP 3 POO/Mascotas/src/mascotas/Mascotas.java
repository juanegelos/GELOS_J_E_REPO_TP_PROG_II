package mascotas;

public class Mascotas {
    private String nombre;
    private String especie;
    private int edad;

    public void setNombre(String nombre){
        if (nombre != null){
        this.nombre = nombre;
        }
    }
    public void setEspecie(String especie){
        if (especie != null){
        this.especie = especie;
        }
    }

    public void setEdad(int edad) {
        if (edad >=0){
        this.edad = edad;
        }
    }
    
   public void mostrarInfo(){
       System.out.println("Nombre: " + nombre + "; Especie: " + especie +
                   "; Edad: " + edad);
   }
   
   public void cumplirAnios(){
       edad ++;
   }
    
}
