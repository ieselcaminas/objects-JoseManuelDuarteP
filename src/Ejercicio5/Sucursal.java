package Ejercicio5;

public class Sucursal {
    private int id;
    private String localizacion;
    private Banco banco;

    public Sucursal(int id, String localizacion, Banco banco) {
        this.id = id;
        this.localizacion = localizacion;
        this.banco = banco;
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

    @Override
    public String toString() {
        return this.id + " - " + this.localizacion;
    }
}
