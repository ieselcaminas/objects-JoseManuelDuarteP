package Ejercicio5;

public class Domiciliacion {
    private int id;
    private String concepto;
    private int cantidad;
    private Cuenta cuenta;

    public Domiciliacion(int id, String concepto, int cantidad, Cuenta cuenta) {
        this.id = id;
        this.concepto = concepto;
        this.cantidad = cantidad;
        this.cuenta = cuenta;
    }

    public int getId() {
        return id;
    }

    public String getConcepto() {
        return concepto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "ID Domiciliacion: " + this.id + " - " + "Concepto: " + this.concepto + " - " + "Cantidad: " + this.cantidad;
    }
}
