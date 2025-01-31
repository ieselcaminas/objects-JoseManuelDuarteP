package Ejercico4_2;

import java.util.ArrayList;

public class MainLibro {
    public static void main(String[] args) {

        ArrayList<Libro> libros = new ArrayList();

        Tema historico = new Tema("Histórico");
        Tema horror = new Tema("Horror");
        Tema accion = new Tema("Acción");

        Autor martin = new Autor("Martin", "18-05-1984");
        Autor juan = new Autor("Juan", "27-01-1996");

        Libro libro = new Libro("Pájaros de acero",juan);
        libro.addTemas(historico);
        libro.addTemas(accion);
        libros.add(libro);

        Libro libro2 = new Libro("Ananinoan",martin);
        libro2.addTemas(horror);
        libros.add(libro2);

        for(Libro l: libros) {
            System.out.println(l.getTitulo() + " - " + l.getAutor());
            for(Tema tema: l.getTemas()) {
                System.out.println(tema);
            }
        }

    }
}
