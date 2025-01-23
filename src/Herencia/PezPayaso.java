package Herencia;

public class PezPayaso extends Pez {

    public PezPayaso(String nombre) {
        super(nombre);
    }

    public void comunicarse() {
        System.out.println("Comunicando pez payaso");
    }

}
