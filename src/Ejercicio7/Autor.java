package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private int IDautor;
    private String nombre;
    private List<Libro> libros;

    public Autor(int IDautor, String nombre) {
        this.IDautor = IDautor;
        this.nombre = nombre;
        libros = new ArrayList<>();
    }

    public int getIDautor() {
        return IDautor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void addLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public String toString() {
        return "ID autor: " + this.IDautor + ", Nombre autor: " + this.nombre;
    }
}
