package Subastas;

import Ejercicio5.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int id;
    private double precioSalida;
    private List<Articulo> articulos;
    private List<Pujador> pujadores;
    private List<Puja> pujas;

    public Lote(int id, double precioSalida) {
        this.id = id;
        this.precioSalida = precioSalida;
        this.articulos = new ArrayList<>();
        this.pujadores = new ArrayList<>();
        this.pujas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public double getPrecioSalida() {
        return precioSalida;
    }

    public void setPrecioSalida(double precioSalida) {
        this.precioSalida = precioSalida;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void addArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public List<Pujador> getPujadores() {
        return pujadores;
    }

    public void addPujador(Pujador pujador) {
        pujadores.add(pujador);
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void addPuja(Puja puja) {
        this.pujas.add(puja);
    }

    @Override
    public String toString() {
        return "ID lote: " + this.id + ", Precio salida: " + this.precioSalida;
    }

}