package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class MainLibreria {
    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<>();
        List<Historico> historicos = new ArrayList<>();

        Historico h1 = new Historico("04-11-2024","28-12-2024");
        historicos.add(h1);

        Lector pedro = new Lector("3456T","Pedro Herrero");

        Tema satira = new Tema(1,"Sátira");
        Tema horror = new Tema(2,"Horror");

        Libro quijote = new Libro("543-76","El Quijote",satira);
        libros.add(quijote);
            Ejemplar quijote1 = new Ejemplar(1,quijote);
            quijote.addEjemplar(quijote1);
            quijote1.setLectorActual(pedro);
            h1.addLector(pedro);
            h1.addEjemplar(quijote1);

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

        System.out.println("--------------------------");

        for (Historico historico : historicos){
            System.out.println(historico);
            for(Ejemplar ejemplar : historico.getEjemplar()) {
                System.out.println("\t" + ejemplar);
            }
            for (Lector lector : historico.getLector()) {
                System.out.println("\t" + lector);
            }
        }
    }
}
