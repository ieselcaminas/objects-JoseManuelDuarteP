package Ejercicio6;

import Ejercicio5.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String dni;
    private String nombre;
    private Departamento departamento;
    private List<Catedra> catedras;

    public Profesor(String dni, String nombre, Departamento departamento) {
        this.dni = dni;
        this.nombre = nombre;
        this.departamento = departamento;
        this.catedras = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void addCatedra(Catedra catedra) {
        catedras.add(catedra);
    }

    @Override
    public String toString() {
        return "DNI profesor: " + this.dni + ", Nombre profesor: " + this.nombre;
    }
}
