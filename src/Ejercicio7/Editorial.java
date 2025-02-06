package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Editorial {
    private int IDeditorial;
    private String nombreEditorial;
    private List<Libro> libros;

    public Editorial(int IDeditorial, String nombreEditorial) {
        this.IDeditorial = IDeditorial;
        this.nombreEditorial = nombreEditorial;
        libros = new ArrayList<>();
    }

    public int getIDeditorial() {
        return IDeditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void addLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public String toString() {
        return "ID de editorial: " + this.IDeditorial + ", Nombre editorial: " + this.nombreEditorial;
    }
}
