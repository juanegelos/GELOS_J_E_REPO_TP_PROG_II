package celular_bateria_usuario_1_2;

public class Principal {


    public static void main(String[] args) {
        Bateria bat1 = new Bateria("Moto1", 5500);
        Bateria bat2 = new Bateria("Moto2", 4700);
        Celular motog42 = new Celular("123321456654897", "Motorola", "G42 Plus", bat1);
        Celular motog42C = new Celular("123321456654789", "Motorola", "G42", bat2);
        motog42.mostrarCelular();
        motog42C.mostrarCelular();
                
        Usuario santiago = new Usuario("Santiago Carreras", "28554668");
        Usuario bautista = new Usuario("Bautista Delguy", "29687459");
        motog42.setUsuario(santiago);
        motog42C.setUsuario(bautista);
        motog42.mostrarUsuario();
        motog42C.mostrarUsuario();
        santiago.mostrarCelular();
        bautista.mostrarCelular();
    }
    
}
