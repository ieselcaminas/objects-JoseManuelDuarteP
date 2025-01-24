package Network;

public class PublicacionConImagen extends Publicacion {
    private String imagen;
    private String titulo;

    public PublicacionConImagen(Usuario nombreUsuario,String titulo,String imagen) {
        super(nombreUsuario);
        this.titulo = titulo;
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Info usuario: " + getNombreUsuario()
                + "\nTitulo: " + this.titulo
                + "\nImagen: " + this.imagen
                + "\nFecha: " + this.getFechaPublicacion()
                + "\nLikes: " + this.getLikes() + "\n";
    }
}
