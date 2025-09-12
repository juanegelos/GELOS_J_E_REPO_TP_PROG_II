package computadora_placamadre_propietario_1_5;

public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computaora;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Computadora getComputaora() {
        return computaora;
    }
    
    public void setComputadora(Computadora computadora){
        this.computaora = computadora;
        if (computadora != null && computadora.getPropietario() != this){
            computadora.setPropietrio(this);
        }
    }    
    
    public void mostrar(){
        System.out.println("Propietario: " + nombre + ", Computadora marca: " 
                    + computaora.getMarca() + ", Serie: " + computaora.getNumeroSerie());
    }
}
