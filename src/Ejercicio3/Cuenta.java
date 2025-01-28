package Ejercicio3;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta [" +
                "\ntitular= " + titular +
                "\ncantidad= " + cantidad +
                "\n}";
    }

    public double ingresar(double cantidad) {
        if (cantidad < 0) {
            System.out.println("Cantidad no permitida");
            return 0;
        } else {
            return this.cantidad += cantidad;
        }
    }

    public double retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            return this.cantidad = 0;
        } else {
            return this.cantidad -= cantidad;
        }
    }

}
