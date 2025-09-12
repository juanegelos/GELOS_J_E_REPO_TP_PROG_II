package editor_proyecto_render_1_14;

public class EditorVideo {
    
    public static void exportar(String formato, Proyecto proyecto){
        Render r1 = new Render(formato);
        r1.setProyecto(proyecto);
    }
}
