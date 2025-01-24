package Network;

import java.time.ZonedDateTime;

public abstract class Publicacion {
    private String nombreUsuario;
    private String fechaPublicacion;
    private int likes;

    public Publicacion(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.fechaPublicacion = generarFecha();
        this.likes = 0;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String generarFecha() {
        return this.fechaPublicacion = String.valueOf(ZonedDateTime.now());
    }

    public void darLike() {
        this.likes ++;
    }

}
