package naveespacial;

public class Principal {

    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("Interprise");
        
        nave1.despegar();
        nave1.mostrarEstado();
        
        nave1.recargarCombustible(50);
        
        nave1.despegar();
        nave1.avanzar(800);
        nave1.mostrarEstado();
        nave1.avanzar(500);
        nave1.recargarCombustible(50);
        nave1.recargarCombustible(40);
        nave1.avanzar(500);
        nave1.mostrarEstado();
    }
    
}
