package Ejercicio4;

public class Tema {
    private String nombreTema;

    public Tema(String nombreTema) {
        this.nombreTema = nombreTema;
    }

    public String getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }

    @Override
    public String toString() {
        return "Tema{" +
                "nombreTema='" + nombreTema + '\'' +
                '}';
    }
}
