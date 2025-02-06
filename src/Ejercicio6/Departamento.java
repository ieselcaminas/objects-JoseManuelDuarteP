package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int depID;
    private String nombre;
    private AreaConocimiento areaConocimiento;
    private List<Profesor> profesores;
    private List<Catedra> catedras;

    public Departamento(int depID, String nombre, AreaConocimiento areaConocimiento) {
        this.depID = depID;
        this.nombre = nombre;
        this.areaConocimiento = areaConocimiento;
        this.profesores = new ArrayList<>();
        this.catedras = new ArrayList<>();
    }

    public int getDepID() {
        return depID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AreaConocimiento getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(AreaConocimiento areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void addProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void addCatedra(Catedra catedra) {
        this.catedras.add(catedra);
    }

    @Override
    public String toString() {
        return "ID departamento: " + this.depID + ", Nombre departamento: " + this.nombre;
    }
}