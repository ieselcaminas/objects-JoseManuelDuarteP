package Ejercicio5;

public class Prestec {
    private int id;
    private int cantidad;
    private Cliente cliente;

    public Prestec(int id, int cantidad, Cliente cliente) {
        this.id = id;
        this.cantidad = cantidad;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.cantidad;
    }
}
