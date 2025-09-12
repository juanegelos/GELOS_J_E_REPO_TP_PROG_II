
package alumnos_con_nota;

public class Principal {

    public static void main(String[] args) {
        Alumnos a1 = new Alumnos("Juan");
        System.out.println(a1.toString());
        a1.setPromedio(new double[] {8.0, 9.0, 7.0});
        System.out.println(a1.toString());
        Alumnos a2 = new Alumnos("Guillermo", 7.99);
        System.out.println(a2.toString());
        Alumnos.setNotaAprobar(8.0);
        System.out.println("Nueva nota para aprobar: " + Alumnos.getNotaAprobar());
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    
    
    }
       
}
