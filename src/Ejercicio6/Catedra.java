package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Catedra {
    private int catID;
    private String titulo;
    private Departamento departamento;
    private Facultad facultad;
    private List<Profesor> profesores;

    public Catedra(int catID, String titulo, Departamento departamento, Facultad facultad) {
        this.catID = catID;
        this.titulo = titulo;
        this.departamento = departamento;
        this.facultad = facultad;
        this.profesores = new ArrayList<>();
    }

    public int getCatID() {
        return catID;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void addProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    @Override
    public String toString() {
        return "ID cátedra: " + this.catID + ", Titulo cátedra: " + this.titulo;
    }
}
