package MaquinaEx;

import java.util.ArrayList;
import java.util.List;

public class Maquina {
    private int idMaquina;
    private List<Tique> tiques = new ArrayList<>();

    public Maquina(int idMaquina) {
        this.idMaquina = idMaquina;
    }

    public int getIdMaquina() {
        return idMaquina;
    }

    public List<Tique> getTiques() {
        return tiques;
    }

    public void addTique(Tique tique) {
        this.tiques.add(tique);
    }

    @Override
    public String toString() {
        return "ID máquina: " + this.idMaquina;
    }
}
