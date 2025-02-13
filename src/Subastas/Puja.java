package Subastas;

public class Puja {
    private double dinero;
    private Pujador pujador;
    private Lote lote;

    public Puja(double dinero, Pujador pujador, Lote lote) {
        this.dinero = dinero;
        this.pujador = pujador;
        this.lote = lote;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Cantidad: " + this.dinero;
    }
}
