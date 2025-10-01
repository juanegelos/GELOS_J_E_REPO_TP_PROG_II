package sistema_academico;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
    
    public void agregarCurso(Curso curso){
        if (curso != null && !cursos.contains(curso)){
            cursos.add(curso);
        }
        if (curso.getProfesor() != this){
            curso.setProfesor(this);
        }
    }
    public void eliminarCurso(Curso curso){
        if (curso != null && cursos.contains(curso)){
            cursos.remove(curso);
        }
        if (curso.getProfesor() == this){
            curso.setProfesor(null);
        }
    }
    public void mostrarInfo(){
        List<Curso> cursos = this.getCursos();
        List cursosDados = new ArrayList<>();
        if (!cursos.isEmpty()){
            for (Curso curso : cursos) {
                cursosDados.add(curso.getNombre());
            }
        } else{
            cursosDados = null;
            }
        
        System.out.println("Id: " + id+ ", Nombre: " + nombre+ ", Especialidad: " +
                    especialidad+ ", Cursos asignados: " + cursosDados);
    }
}
