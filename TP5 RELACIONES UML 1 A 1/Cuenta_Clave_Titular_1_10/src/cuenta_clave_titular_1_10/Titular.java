package cuenta_clave_titular_1_10;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }
    
    public void setCuentaBancaria(CuentaBancaria cuenta){
        this.cuenta = cuenta;
        if (cuenta != null && cuenta.getTitular() != this){
            cuenta.setTitular(this);
        }
    }
    
    public void mostrarClienteCuenta(){
        System.out.println("Titular: " + nombre + ", CBU Cuenta " + cuenta.getCbu() + 
                    ", Saldo " + cuenta.getSaldo());
    }
    
    public void cambiarClave(String codigo){
        cuenta.modificarClave(codigo);
    }
    
    public String mostrarClave(){
        return cuenta.getClave();
    }
}
