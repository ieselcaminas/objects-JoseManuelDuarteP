package Ejercicio5;

import java.util.ArrayList;

public class Cliente {
    private String dni;
    private String nombre;
    private ArrayList<Prestec> prestecs = new ArrayList<>();

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.prestecs = new ArrayList<>();
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Prestec> getPrestecs() {
        return prestecs;
    }

    public void addPrestec(Prestec prestec) {
        prestecs.add(prestec);
    }

    @Override
    public String toString() {
        return this.dni + " - " + this.nombre;
    }
}
