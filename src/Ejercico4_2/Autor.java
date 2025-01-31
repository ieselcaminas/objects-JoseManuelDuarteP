package Ejercico4_2;

public class Autor {
    private String nombre;
    private String fechaNacimiento;

    public Autor(String nombreAutor, String fechaNacimiento) {
        this.nombre = nombreAutor;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreAutor() {
        return nombre;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombre = nombreAutor;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombreAutor='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
