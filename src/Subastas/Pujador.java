package Subastas;

import java.util.ArrayList;
import java.util.List;

public class Pujador {
    private String nombre;
    private List<Lote> lotes;
    private ArrayList<Puja> pujas;

    public Pujador(String nombre) {
        this.nombre = nombre;
        this.lotes = new ArrayList<>();
        this.pujas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void addLote(Lote lote) {
        lotes.add(lote);
    }

    public ArrayList<Puja> getPujas() {
        return pujas;
    }

    public void addPuja(Puja puja) {
        this.pujas.add(puja);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre;
    }
}