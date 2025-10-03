package vehiculos_herencia_basica;

public class Principal {

    public static void main(String[] args) {
        Vehiculo a1 = new Auto(4, "Ford", "Focus");
        Vehiculo a2 = new Auto(5, "Citroen", "C4 Picasso");
        
        System.out.println(a1.mostrarInfo());
        System.out.println(a2.mostrarInfo());
    }
    
}
