package MaquinaEx;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private List<Tique> tiques = new ArrayList<>();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tique> getTiques() {
        return tiques;
    }

    public void addTique(Tique tique) {
        this.tiques.add(tique);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre;
    }
}