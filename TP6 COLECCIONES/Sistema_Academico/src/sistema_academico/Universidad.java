package sistema_academico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    public void agregarProfesor(Profesor profesor){
        if (profesor != null && !profesores.contains(profesor)){
            this.profesores.add(profesor);
        }
    }
    public void agregarCurso(Curso curso){
        if (curso != null && !cursos.contains(curso)){
            this.cursos.add(curso);
        }
    }
    public void asignarProfesorACurso(String codigo, String id){
        Curso curso = buscarCursoPorCodigo(codigo);
        Profesor profesor = buscarProfesorPorId(id);
        if (codigo != null && profesor != null){
            curso.setProfesor(profesor);
        }
    }
    public void desAsignarProfesorACurso(String codigo, String id){
        Curso curso = buscarCursoPorCodigo(codigo);
        Profesor profesor = buscarProfesorPorId(id);
        if (codigo != null && profesor != null){
            profesor.eliminarCurso(curso);
        }
    }
    public Profesor buscarProfesorPorId(String id){
        int i = 0;
        Profesor profesorBuscado = null;
        if (id != null){
            while(i<profesores.size() && !profesores.get(i).getId().equals(id)){
                i++;
            }
            if (i<profesores.size()){
                profesorBuscado = profesores.get(i);
            }
        }
        return profesorBuscado;
    }
    public Curso buscarCursoPorCodigo(String codigo){
        int i = 0;
        Curso cursoBuscado = null;
        if (codigo != null){
            while(i<cursos.size() && !cursos.get(i).getCodigo().equals(codigo)){
                i++;
            }
            if (i<cursos.size()){
                cursoBuscado = cursos.get(i);
            }
        }
        return cursoBuscado;
    }
    public void listarProfesores(){
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }
    public void  listarCursos(){
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }
    public void eliminarCurso(String codigo){
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null && cursos.contains(curso)){
            Profesor profesor = curso.getProfesor();
            profesor.eliminarCurso(curso);
            cursos.remove(curso);
        }
    }
    public void eliminarProfesor(String id){
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null && profesores.contains(profesor)){
            List<Curso> cursosProfesor = profesor.getCursos();
            for (Curso curso : cursosProfesor) {
                curso.setProfesor(null);            }
            }
            profesores.remove(profesor);
        }
    public void cantidadCursosPorProfesor(){
        for (Profesor profesor : profesores) {
            System.out.println("Profesor: " + profesor.getNombre() + ", Cantidad"
                        + " de cursos dados: " + profesor.getCursos().size());
        }
    }
}

