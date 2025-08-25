package naveespacial;

public class NaveEspacial {
    private String nombre;
    private double combustible;

    public NaveEspacial(String nombre) {
        this.nombre = nombre;
    }
    
    private boolean verificarCombustible(){
        if(combustible > 0){
            return true;
        }else{
            System.out.println("Combustible insuficiente");
            return false;
        }
    }
    
    public void despegar(){
        if (verificarCombustible()){
        System.out.println("Despegando.......");
        }
    }
    public void avanzar(int distancia){
        double consumo = 0.05;
        double combNecesario = distancia * consumo;
        if(combustible > combNecesario){
            System.out.println("Avanzando " + distancia + " kms.");
            combustible -=combNecesario;
        }else{
            System.out.println("Combustible insuficiente para avanzar esa distancia");
        }
    }
    
    public void recargarCombustible(double cantidad){
        if(cantidad < 0){
            System.out.println("Cantidad incorrecta");
        }else if((combustible + cantidad) > 50){
            System.out.println("La cantidad ingresada hace superar el limite de 50 litros");
            mostrarEstado();
        }else{
            combustible += cantidad;
        }
         
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre: " + nombre + "; Combustible disponible: " +
                    combustible);
    }
    
}
