package Network;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Publicacion> listaPublicaciones = new ArrayList<>();

        Usuario pepe = new Usuario("pepe","Pepe García",1);
        Usuario andrea = new Usuario("andrea","Andrea García",2);
        Usuario manolo = new Usuario("manolo","Manolo Pérez",3);

        PublicacionConTexto pt = new PublicacionConTexto(pepe,"Cocina conmigo patatas");
        //System.out.println(pt);
        listaPublicaciones.add(pt);

        pt = new PublicacionConTexto(andrea,"Excursion montaña");
        //System.out.println(pt);
        listaPublicaciones.add(pt);

        pt = new PublicacionConTexto(pepe,"Cocina conmigo lentejas");
        //System.out.println(pt);
        listaPublicaciones.add(pt);

        PublicacionConImagen pi = new PublicacionConImagen(manolo,"Fotos de tractores","/home/juan/images/tractor.png");
        //System.out.println(pi);
        listaPublicaciones.add(pi);

        pi = new PublicacionConImagen(manolo,"Fotos de camiones","/home/juan/images/camion.png");
        //System.out.println(pi);
        listaPublicaciones.add(pi);

        publicacionDe("andrea garcía",listaPublicaciones);

        //Faltan los comentarios

    }

    public static void publicacionDe(String nombre, ArrayList<Publicacion> listaPublicaciones) {

        listaPublicaciones.stream()
                .filter((p) -> p.getNombreUsuario().getNombre().equalsIgnoreCase(nombre))
                .forEach(System.out::println);

    }

}
