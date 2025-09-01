package sistema_gestion_empleados;

public class Principal {

    public static void main(String[] args) {
        try {
            Empleado e1 = new Empleado(2, "Juan Mallia", "", 0);
            System.out.println(e1);
            e1.setSalario(5000);
            e1.setPuesto("Administrativo");
            System.out.println(e1);
            Empleado.mostrarTotalEmpleados();
            Empleado e2 = new Empleado("Ernesto Gutierrez", "Vendedor A");
            System.out.println(e2);
            e2.actualizarSalario(40.0);
            System.out.println(e2);
            Empleado e3 = new Empleado("Fernanda Ontivero", "Cajera");
            System.out.println(e3);
            Empleado.mostrarTotalEmpleados();
            e1.actualizarSalario(1500);
            System.out.println(e1);
            Empleado e4 = new Empleado(6, "Laura Gonzalez", "Vendedor B", 5000.00);
            e4.actualizarSalario(15.0);
            System.out.println(e4);
            Empleado.mostrarTotalEmpleados();
            Empleado e5 = new Empleado("", "Administrativo");
            
                        
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            Empleado.mostrarTotalEmpleados();
            
        }
    }
}
