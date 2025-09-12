package editor_proyecto_render_1_14;

public class Principal {

    public static void main(String[] args) {
        Proyecto p1 = new Proyecto("TP Probabilidad y Estadistica", 7);
        EditorVideo.exportar("mp4", p1);
        System.out.println(p1);
              
    }
}
