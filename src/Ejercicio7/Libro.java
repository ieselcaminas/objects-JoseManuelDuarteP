package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String isbn;
    private String titulo;
    private Tema tema;
    private List<Autor> autores;
    private List<Ejemplar> ejemplares;

    public Libro(String isbn, String titulo, Tema tema) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.tema = tema;
        this.autores = new ArrayList<>();
        this.ejemplares = new ArrayList<>();
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Tema getTema() {
        return this.tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void addAutor(Autor autor) {
        this.autores.add(autor);
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void addEjemplar(Ejemplar ejemplar) {
        this.ejemplares.add(ejemplar);
    }

    @Override
    public String toString() {
        return "ISBN: " + this.isbn + ", Titulo libro: " + this.titulo;
    }
}
