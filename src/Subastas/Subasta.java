package Subastas;

import java.util.ArrayList;
import java.util.List;

public class Subasta {
    private int id;
    private String diaSubasta;
    private List<Lote> lotes;

    public Subasta(int id, String diaSubasta) {
        this.id = id;
        this.diaSubasta = diaSubasta;
        this.lotes = new ArrayList<Lote>();
    }

    public int getId() {
        return id;
    }

    public String getDiaSubasta() {
        return diaSubasta;
    }

    public void setDiaSubasta(String diaSubasta) {
        this.diaSubasta = diaSubasta;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void addLotes(Lote lote) {
        lotes.add(lote);
    }

    @Override
    public String toString() {
        return "ID subasta: " + this.id + ", Dia subasta: " + diaSubasta;
    }
}