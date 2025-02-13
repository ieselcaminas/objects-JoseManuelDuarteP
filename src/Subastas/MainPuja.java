package Subastas;

import java.util.ArrayList;
import java.util.List;

public class MainPuja {
    public static void main(String[] args) {
        List<Subasta> subastas = new ArrayList<>();

        Subasta s1 = new Subasta(1,"29-08-2024");
        Subasta s2 = new Subasta(2,"30-10-2024");
        subastas.add(s1);
        subastas.add(s2);

        Lote l1 = new Lote(1,400);
        s1.addLotes(l1);
            Articulo a1 = new Articulo(1,"Lámpara",200,l1);
            Articulo a2 = new Articulo(2,"Plato",200,l1);
            l1.addArticulo(a1);
            l1.addArticulo(a2);

        Pujador paco = new Pujador("Paco");
        l1.addPujador(paco);
            Puja pujaPaco1 = new Puja(450,paco,l1);
            l1.addPuja(pujaPaco1);
            paco.addPuja(pujaPaco1);

        Pujador manolo = new Pujador("Manolo");
        l1.addPujador(manolo);
            Puja pujaManolo1 = new Puja(600,manolo,l1);
            l1.addPuja(pujaManolo1);
            manolo.addPuja(pujaManolo1);

        for (Subasta subasta : subastas) {
            System.out.println(subasta);
            for (Lote lote : subasta.getLotes()) {
                System.out.println("\t" +lote);
                for (Pujador pujador : lote.getPujadores()) {
                    System.out.println("\t\t" +pujador);
                    for (Puja puja : pujador.getPujas()) {
                        System.out.println("\t\t\t" +puja);
                    }
                }
            }
        }
    }
}