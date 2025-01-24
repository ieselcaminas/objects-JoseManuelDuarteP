package Network;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Publicacion> listaPublicaciones = new ArrayList<>();

        PublicacionConTexto pt = new PublicacionConTexto("Pepe","Cocina conmigo patatas");
        //System.out.println(pt);
        listaPublicaciones.add(pt);

        pt = new PublicacionConTexto("Andrea","Excursion montaña");
        //System.out.println(pt);
        listaPublicaciones.add(pt);

        pt = new PublicacionConTexto("Pepe","Cocina conmigo lentejas");
        //System.out.println(pt);
        listaPublicaciones.add(pt);

        PublicacionConImagen pi = new PublicacionConImagen("Manolo","Fotos de tractores","/home/juan/images/tractor.png");
        //System.out.println(pi);
        listaPublicaciones.add(pi);

        pi = new PublicacionConImagen("Manolo","Fotos de camiones","/home/juan/images/camion.png");
        //System.out.println(pi);
        listaPublicaciones.add(pi);

        publicacionDe("pepe",listaPublicaciones);
    }

    public static void publicacionDe(String nombre, ArrayList<Publicacion> listaPublicaciones) {

        listaPublicaciones.stream()
                .filter((p) -> p.getNombreUsuario().equalsIgnoreCase(nombre))
                .forEach(System.out::println);

    }

}
