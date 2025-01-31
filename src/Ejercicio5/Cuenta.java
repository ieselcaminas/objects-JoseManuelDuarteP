package Ejercicio5;

import java.util.ArrayList;

public class Cuenta {
    private int id;
    private Sucursal sucursal;
    private ArrayList<Domiciliacion> domiciliaciones;
    private ArrayList<Cliente> clientes;

    public Cuenta(int id, Sucursal sucursal) {
        this.id = id;
        this.sucursal = sucursal;
        this.domiciliaciones = new ArrayList<>();
        this.clientes = new ArrayList<>();
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

    public ArrayList<Domiciliacion> getDomiciliaciones() {
        return domiciliaciones;
    }

    public void addDomiciliacion(Domiciliacion domiciliacion) {
        this.domiciliaciones.add(domiciliacion);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    @Override
    public String toString() {
        return "ID Cuenta: " + this.id + " - " + "Propietarios (DNI / Nombre): " + this.clientes;
    }
}
