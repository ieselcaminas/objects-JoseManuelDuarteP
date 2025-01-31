package Network;

public class Usuario {
    private String nick;
    private String nombre;
    private int id;

    public Usuario(String nick, String nombre, int id) {
        this.nick = nick;
        this.nombre = nombre;
        this.id = Service.randomID();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\n[ IDU: " + this.id
                + "\nNick: " + this.nick
                + "\nNombre: " + this.nombre + "\n ]";
    }
}
