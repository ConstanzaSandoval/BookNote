package model;

public class Docente {
    
    private int id;
    private String nombre;
    private String apelido;
    private int id_usuario;

    public Docente() {
    }

    public Docente(int id, String nombre, String apelido, int id_usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apelido = apelido;
        this.id_usuario = id_usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "Docente{" + "id=" + id + ", nombre=" + nombre + ", apelido=" + apelido + ", id_usuario=" + id_usuario + '}';
    }
    
}
