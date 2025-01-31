package Ejercicio5;

public class Prestec {
    private int id;
    private int cantidad;
    private Cliente cliente;
    private Sucursal sucursal;

    public Prestec(int id, int cantidad, Cliente cliente, Sucursal sucursal) {
        this.id = id;
        this.cantidad = cantidad;
        this.cliente = cliente;
        this.sucursal = sucursal;
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

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.cantidad;
    }
}
