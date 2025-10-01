package sistemadestock;

public enum CategoriaProducto {
    ALIMENTOS("Productos Comestibles"),
    ELECTRONICA("Dispositivos Electronicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Articulos para el hogar");

    private final String descripcion;

    private CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public static void mostrarCategorias(){
        CategoriaProducto[] categoria = CategoriaProducto.values();
        System.out.println("\nLISTADO DE CATEGORIAS, CON SUS DESCRIPCIONES");
        for (int i=0; i< categoria.length; i++){
            System.out.println((i +1) + ".- " + categoria[i] + ", " + 
                        categoria[i].getDescripcion());
        } 
    }
}
