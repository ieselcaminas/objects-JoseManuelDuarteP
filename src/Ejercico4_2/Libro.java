package Ejercico4_2;

import java.util.ArrayList;

public class Libro {
    private String titulo;
    private Autor autor;
    private int paginas;
    private ArrayList<Tema> temas;

    public Libro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.temas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public ArrayList<Tema> getTemas() {
        return temas;
    }

    public void addTemas(Tema temas) {
        this.temas.add(temas);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", paginas=" + paginas +
                ", temas=" + temas +
                '}';
    }
}
