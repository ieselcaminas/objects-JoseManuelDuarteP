package Ejercicio5;

public class Cuenta {
    private int id;
    private Sucursal sucursal;

    public Cuenta(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public String toString() {
        return this.id + "";
    }
}
