package Ejercicio4;

public class Autor {
    private String nombreAutor;
    private String fechaNacimiento;

    public Autor(String nombreAutor, String fechaNacimiento) {
        this.nombreAutor = nombreAutor;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
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
                "nombreAutor='" + nombreAutor + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
