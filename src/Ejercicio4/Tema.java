package Ejercicio4;

public class Tema {
    private String nombre;

    public Tema(String nombreTema) {
        this.nombre = nombreTema;
    }

    public String getNombreTema() {
        return nombre;
    }

    public void setNombreTema(String nombreTema) {
        this.nombre = nombreTema;
    }

    @Override
    public String toString() {
        return "Tema{" +
                "nombreTema='" + nombre + '\'' +
                '}';
    }
}
