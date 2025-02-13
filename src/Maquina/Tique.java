package Maquina;

public class Tique {
    private int idTique;
    private double cuantia;

    public Tique(int idTique, double cuantia) {
        this.idTique = idTique;
        this.cuantia = cuantia;
    }

    public int getIdTique() {
        return idTique;
    }

    public double getCuantia() {
        return cuantia;
    }

    public void setCuantia(double cuantia) {
        this.cuantia = cuantia;
    }

    @Override
    public String toString() {
        return "ID tique: " + this.idTique + ", Cuantia: " + this.cuantia;
    }
}
