package MaquinaEx;

import java.util.ArrayList;
import java.util.List;

public class Tique {
    private int idTique;
    private Maquina maquina;
    private List<Importe> importes = new ArrayList<>();
    private Cliente cliente;

    public Tique(int idTique, Maquina maquina, Cliente cliente) {
        this.idTique = idTique;
        this.maquina = maquina;
        this.cliente = cliente;
    }

    public int getIdTique() {
        return idTique;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public List<Importe> getImportes() {
        return importes;
    }

    public void addImporte(Importe importe) {
        this.importes.add(importe);
    }

    @Override
    public String toString() {
        return "ID tique: " + this.idTique;
    }
}