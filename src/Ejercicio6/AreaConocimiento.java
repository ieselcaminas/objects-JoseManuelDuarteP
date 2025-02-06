package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class AreaConocimiento {
    private int areaConID;
    private String nombre;
    private List<Departamento> departamentos;

    public AreaConocimiento(int areaConID, String nombre) {
        this.areaConID = areaConID;
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public int getAreaConID() {
        return areaConID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void addDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }

    @Override
    public String toString() {
        return "ID area de conocimiento: " + this.areaConID + ", Nombre area de conocimiento: " + this.nombre;
    }
}
