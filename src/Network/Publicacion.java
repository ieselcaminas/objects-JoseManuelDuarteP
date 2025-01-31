package Network;

import java.time.ZonedDateTime;

public abstract class Publicacion {
    private Usuario usuario;
    private String fechaPublicacion;
    private int likes;

    public Publicacion(Usuario usuario) {
        this.usuario = usuario;
        this.fechaPublicacion = generarFecha();
        this.likes = 0;
    }

    public Usuario getNombreUsuario() {
        return usuario;
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
