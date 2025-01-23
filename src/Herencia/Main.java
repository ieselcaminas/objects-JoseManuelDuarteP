package Herencia;

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("WillyRex");
        System.out.println(perro.getNombre());
        perro.comunicarse();
        perro.traerZapatillas();
        perro.mamar();

        Gato gato = new Gato("Vegetta777");
        System.out.println(gato.getNombre());
        gato.comunicarse();
        gato.jugarConOvillos();
        gato.mamar();

        Tiburon tiburon = new Tiburon("Llados");
        System.out.println(tiburon.getNombre());
        tiburon.comunicarse();
        tiburon.morderBanyista();
        tiburon.nadar();

        PezPayaso pezPayaso = new PezPayaso("Nemo");
        System.out.println(pezPayaso.getNombre());
        pezPayaso.comunicarse();
        pezPayaso.nadar();
        pezPayaso.respirar();

    }
}