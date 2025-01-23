package Herencia;

public abstract class Mamifero extends Animal{

    public Mamifero(String nombre) {
        super(nombre);
    }

    public void mamar() {
        System.out.println("Cuando soy pequeño mamo");
    }

    @Override
    public void respirar() {
        System.out.println("Respirando por los pulmones");
    }

}
