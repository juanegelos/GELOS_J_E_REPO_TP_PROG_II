package inventario_de_productos;

public class Producto {
    private String nombre;
    private double precioBase;
    private static double IVA = 21.00;

    public Producto(String nombre, double precioBase) {
        this.setNombre(nombre);
        this.setPrecioBase(precioBase);
    }

    public Producto(String nombre) {
        this.setNombre(nombre);
        this.setPrecioBase(100);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase <= 0){
            throw new IllegalArgumentException("El precio debe ser mayor que 0.00");
        }
        this.precioBase = precioBase;
    }

    public void aplicarDescuento(double porcentaje, double minimo){
        if (0 > porcentaje || porcentaje > 100){
             throw new IllegalArgumentException("El % de descuento es incorrecto");
        }else if((precioBase - (precioBase * porcentaje / 100)) < minimo){
            precioBase = minimo;
        }else{
            precioBase -= precioBase * porcentaje / 100;
        }
    }
    
    public static void cambiarIVA(double nuevoIVA){
        Producto.IVA = nuevoIVA;
    }
    
    public void aplicarDescuento(double porcentaje){
        this.aplicarDescuento(porcentaje, 0.00);
    }
    
    public double calcularPrecioFinal(){
        return precioBase * (1 + Producto.IVA/100);
    }
    
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precioBase=" + precioBase + ", Precio Final=" + this.calcularPrecioFinal() + '}';
    }
    
    
    
}
