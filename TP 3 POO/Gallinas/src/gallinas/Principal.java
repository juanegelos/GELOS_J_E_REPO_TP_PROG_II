package gallinas;

public class Principal {

    public static void main(String[] args) {
        Gallina ave1 = new Gallina(1, 16, 0);
        Gallina ave2 = new Gallina(2, 20, 13);
        
        ave1.ponerHuevo();
        ave2.ponerHuevo();
        ave2.ponerHuevo();
        ave2.ponerHuevo();
        ave1.ponerHuevo();
        ave2.ponerHuevo();
        ave1.envejecer();
        ave2.envejecer();
        
        ave1.mostrarEstado();
        ave2.mostrarEstado();
        
    }
    
}
