package Ejercicio5;

import java.util.ArrayList;

public class Sucursal {
    private int id;
    private String localizacion;
    private Banco banco;
    private ArrayList<Prestec> prestecs;
    private ArrayList<Cuenta> cuentas;

    public Sucursal(int id, String localizacion, Banco banco) {
        this.id = id;
        this.localizacion = localizacion;
        this.banco = banco;
        this.prestecs = new ArrayList<>();
        this.cuentas = new ArrayList<>();
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

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void addCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    @Override
    public String toString() {
        return "ID Sucursal: " + this.id + " - " + "Lugar: " + this.localizacion;
    }
}
