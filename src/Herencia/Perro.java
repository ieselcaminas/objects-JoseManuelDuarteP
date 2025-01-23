package Herencia;

public class Perro extends Mamifero {

    public Perro (String nombre) {
        super(nombre);
    }

    @Override
    public void comunicarse() {
        System.out.println("Guau");
    }

    public void traerZapatillas() {
        System.out.println("Toma tus zapatillas, amo");
    }

}
