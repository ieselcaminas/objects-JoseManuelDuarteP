package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class MainLibreria {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();

        Lector pedro = new Lector("3456T","Pedro Herrero");

        Tema satira = new Tema(1,"Sátira");
        Tema horror = new Tema(2,"Horror");

        Libro quijote = new Libro("543-76","El Quijote",satira);
        libros.add(quijote);
            Ejemplar quijote1 = new Ejemplar(1,quijote);
            quijote.addEjemplar(quijote1);
            quijote1.setLectorActual(pedro);

        Libro sql = new Libro("563-90","SQL para novatos",horror);
        libros.add(sql);
            Ejemplar sql1 = new Ejemplar(2,sql);
            sql.addEjemplar(sql1);
            sql1.addLectorPasado(pedro);

        pedro.addEjemplar(quijote1);
        pedro.addEjemplarPasado(sql1);

        for (Libro libro : libros) {
            System.out.println(libro);
            for (Ejemplar ejemplar : libro.getEjemplares()) {
                System.out.println("\t" + ejemplar);
                for (Lector lector : ejemplar.getLectoresPasados()) {
                    System.out.println("\t\t" + lector);
                }
            }
        }
    }
}
