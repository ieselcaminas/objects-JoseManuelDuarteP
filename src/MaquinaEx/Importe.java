package MaquinaEx;

public class Importe {
    private double cuantia;
    private Tique tique;

    public Importe(double cuantia, Tique tique) {
        this.cuantia = cuantia;
        this.tique = tique;
    }

    public double getCuantia() {
        return cuantia;
    }

    public void setCuantia(double cuantia) {
        this.cuantia = cuantia;
    }

    public Tique getTique() {
        return tique;
    }

    public void setTique(Tique tique) {
        this.tique = tique;
    }

    @Override
    public String toString() {
        return "Cuantia: " + this.cuantia;
    }
}
