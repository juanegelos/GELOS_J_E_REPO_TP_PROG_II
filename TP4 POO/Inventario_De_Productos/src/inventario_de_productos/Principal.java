package inventario_de_productos;

public class Principal {

    public static void main(String[] args) {
        try{
            Producto jarra = new Producto("Jarra");
            System.out.println(jarra.toString());
            jarra.setPrecioBase(5500);
            System.out.println(jarra.toString());
            Producto vaso = new Producto("Vaso", 2500.00);
            System.out.println(vaso.toString());
            jarra.aplicarDescuento(10);
            System.out.println(jarra.toString());
            System.out.println(jarra.calcularPrecioFinal());
            
            Producto.cambiarIVA(10.5);
            System.out.println(jarra.toString());
            
        }catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    
    }
}
