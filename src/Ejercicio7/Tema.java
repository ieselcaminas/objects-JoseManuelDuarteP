package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Tema {
    private int IDtema;
    private String nombreTema;
    private List<Libro> libros;

    public Tema(int IDtema, String nombreTema) {
        this.IDtema = IDtema;
        this.nombreTema = nombreTema;
        this.libros = new ArrayList<>();
    }

    public int getIDtema() {
        return this.IDtema;
    }

    public String getNombreTema() {
        return this.nombreTema;
    }

    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }

    public List<Libro> getLibros() {
        return this.libros;
    }

    public void addLibro(Libro libro) {
        this.libros.add(libro);
    }

    @Override
    public String toString() {
        return "ID de tema: " + this.IDtema + ", Tema: " + this.nombreTema;
    }
}
