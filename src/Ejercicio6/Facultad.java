package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private int faculID;
    private String nombre;
    private List<Catedra> catedras;

    public Facultad(int faculID, String nombre) {
        this.faculID = faculID;
        this.nombre = nombre;
        this.catedras = new ArrayList<>();
    }

    public int getFaculID() {
        return faculID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void addCatedra(Catedra catedra) {
        catedras.add(catedra);
    }

    @Override
    public String toString() {
        return "ID facultad: " + this.faculID + ", Nombre facultad: " + this.nombre;
    }
}
