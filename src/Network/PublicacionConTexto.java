package Network;

public class PublicacionConTexto extends Publicacion {
    private String texto;
    private int id;

    public PublicacionConTexto(Usuario nombreUsuario,String texto) {
        super(nombreUsuario);
        this.texto = texto;
        this.id = Service.randomID();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Info usuario: " + getNombreUsuario()
                + "\nID: " + this.id
                + "\nTexto: " + this.texto
                + "\nFecha: " + this.getFechaPublicacion()
                + "\nLikes: " + this.getLikes() + "\n";
    }




}
