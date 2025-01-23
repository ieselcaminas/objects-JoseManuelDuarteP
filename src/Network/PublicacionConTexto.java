package Network;

public class PublicacionConTexto extends Publicacion{
    private String texto;
    private int ID;

    public PublicacionConTexto(String nombreUsuario,String texto) {
        super(nombreUsuario);
        this.texto = texto;
        this.ID = this.randomID();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Usuario: " + getNombreUsuario()
                + "\nID: " + this.ID
                + "\nTexto: " + this.texto + "\n";
    }

    public int randomID() {
        return this.ID = (int) (Math.random() * Integer.MAX_VALUE);
    }

}