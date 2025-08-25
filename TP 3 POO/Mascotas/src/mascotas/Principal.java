package mascotas;

public class Principal {

    public static void main(String[] args) {
        Mascotas mascota1 = new Mascotas();
        
        mascota1.mostrarInfo();
        mascota1.setNombre("Pituca");
        mascota1.setEspecie("Perro");
        mascota1.setEdad(6);
        
        mascota1.mostrarInfo();
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
        
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
        
                    
    }
    
}
