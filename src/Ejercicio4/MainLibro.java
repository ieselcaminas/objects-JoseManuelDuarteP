package Ejercicio4;

import java.util.ArrayList;

public class MainLibro {
    public static void main(String[] args) {
        ArrayList<Tema> temas = new ArrayList();
        ArrayList<Autor> autores = new ArrayList();
        ArrayList<Libro> libros = new ArrayList();

        Tema tema = new Tema("Histórico");
        temas.add(tema);
        tema = new Tema("Horror");
        temas.add(tema);
        tema = new Tema("Acción");
        temas.add(tema);

        Autor autor = new Autor("Martin", "18-05-1984");
        autores.add(autor);
        autor = new Autor("Juan", "27-01-1996");
        autores.add(autor);

       // Libro libro = new Libro("Pájaros de acero",autores.get(1),203,temas.get(1));

    }
}
