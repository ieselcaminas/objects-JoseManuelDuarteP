package Network;

public class Main {
    public static void main(String[] args) {
        PublicacionConTexto pt = new PublicacionConTexto("Pepe","Cocina conmigo patatas");
        System.out.println(pt);

        PublicacionConImagen pi = new PublicacionConImagen("Manolo","Fotos de tractores","/home/juan/images/tractor.png");
        System.out.println(pi);
    }
}
