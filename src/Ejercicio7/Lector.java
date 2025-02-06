package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Lector {
    private String dni;
    private String nombre;
    private List<Ejemplar> ejemplares;
    private List<Ejemplar> ejemplaresPasados;

    public Lector(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        ejemplares = new ArrayList<>();
        ejemplaresPasados = new ArrayList<>();
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

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void addEjemplar(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
    }

    public List<Ejemplar> getEjemplaresPasados() {
        return ejemplaresPasados;
    }

    public void addEjemplarPasado(Ejemplar ejemplarPasado) {
        ejemplaresPasados.add(ejemplarPasado);
    }

    @Override
    public String toString() {
        return "DNI: " + this.dni + ", Nombre lector: " + this.nombre;
    }
}
