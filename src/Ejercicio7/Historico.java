package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Historico {
    private String fechaPrestamo;
    private String fechaDevuelta;
    private List<Ejemplar> ejemplares;
    private List<Lector> lectores;

    public Historico(String fechaPrestamo, String fechaDevuelta) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevuelta = fechaDevuelta;
        this.ejemplares = new ArrayList<>();
        this.lectores = new ArrayList<>();
    }

    public String getFechaPrestamo() {
        return this.fechaPrestamo;
    }

    public String getFechaDevuelta() {
        return this.fechaDevuelta;
    }

    public List<Ejemplar> getEjemplar() {
        return this.ejemplares;
    }

    public void addEjemplar(Ejemplar ejemplar) {
        ejemplares.add(ejemplar);
    }

    public List<Lector> getLector() {
        return this.lectores;
    }

    public void addLector(Lector lector) {
        lectores.add(lector);
    }

    @Override
    public String toString() {
        return "Fecha prestamo: " + this.fechaPrestamo + ", Fecha devuelta: " + this.fechaDevuelta;
    }
}
