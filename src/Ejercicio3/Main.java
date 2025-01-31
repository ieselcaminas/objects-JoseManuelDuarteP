package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("Manolo",1350.20);

        c.retirar(1300);

        System.out.println(c);

        c.ingresar(10);
        System.out.println(c);
    }
}
