package Subastas;

public class Articulo {
    private int id;
    private String nombre;
    private double precio;
    private Lote lote;

    public Articulo(int id,String nombre, double precio, Lote lote) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.lote = lote;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "ID artículo: " + this.id + ", Artículo: " + this.nombre + ", Precio: " + this.precio;
    }
}