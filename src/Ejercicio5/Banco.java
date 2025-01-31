package Ejercicio5;

import java.util.ArrayList;

public class Banco {
    private int id;
    private String nombre;
    private ArrayList<Sucursal> sucursales;

    public Banco(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
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

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void addSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    @Override
    public String toString() {
        return "ID Banco: " + this.id + " - " + "Nombre banco: " + this.nombre;
    }
}
