package Herencia;

public abstract class Pez extends Animal {

    public Pez(String nombre) {
        super(nombre);
    }

    public void nadar() {
        System.out.println("Nadando");
    }

    @Override
    public void respirar() {
        System.out.println("Respirando por las branquias");
    }

}
