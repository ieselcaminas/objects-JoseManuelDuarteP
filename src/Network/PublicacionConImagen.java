package Network;

public class PublicacionConImagen extends Publicacion {
    private String imagen;
    private String titulo;

    public PublicacionConImagen(String nombreUsuario,String titulo,String imagen) {
        super(nombreUsuario);
        this.titulo = titulo;
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Usuario: " + getNombreUsuario()
                + "\nTitulo: " + this.titulo
                + "\nImagen: " + this.imagen
                + "\nFecha: " + getFechaPublicacion() + "\n";
    }
}
