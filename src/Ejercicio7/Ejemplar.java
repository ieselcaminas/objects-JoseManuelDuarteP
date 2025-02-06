package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Ejemplar {
    private int IDejemplar;
    private Libro libro;
    private String fechaPrestamo;
    private Lector lectorActual;
    private List<Lector> lectoresPasados;

    public Ejemplar(int IDejemplar, Libro libro) {
        this.IDejemplar = IDejemplar;
        this.libro = libro;
        this.fechaPrestamo = "";
        this.lectorActual = null;
        this.lectoresPasados = new ArrayList<>();
    }

    public int getIDejemplar() {
        return IDejemplar;
    }

    public Libro getLibro() {
        return libro;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Lector getLectorActual() {
        return lectorActual;
    }

    public void setLectorActual(Lector lector) {
        this.lectorActual = lector;
    }

    public List<Lector> getLectoresPasados() {
        return lectoresPasados;
    }

    public void addLectorPasado(Lector lectorPasado) {
        this.lectoresPasados.add(lectorPasado);
    }

    @Override
    public String toString() {
        return "ID ejemplar: " + this.IDejemplar;
    }
}
