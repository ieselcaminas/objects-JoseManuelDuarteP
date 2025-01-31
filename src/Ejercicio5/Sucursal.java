package Ejercicio5;

import java.util.ArrayList;

public class Sucursal {
    private int id;
    private String localizacion;
    private Banco banco;
    private ArrayList<Prestec> prestecs;

    public Sucursal(int id, String localizacion, Banco banco) {
        this.id = id;
        this.localizacion = localizacion;
        this.banco = banco;
        this.prestecs = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public ArrayList<Prestec> getPrestecs() {
        return prestecs;
    }

    public void addPrestec(Prestec prestec) {
        prestecs.add(prestec);
    }

    @Override
    public String toString() {
        return this.id + " - " + this.localizacion;
    }
}
