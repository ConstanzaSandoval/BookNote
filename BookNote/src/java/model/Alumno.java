package model;

public class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private int id_apoderado;
    private int id_usuario;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, int id_apoderado, int id_usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_apoderado = id_apoderado;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId_apoderado() {
        return id_apoderado;
    }

    public void setId_apoderado(int id_apoderado) {
        this.id_apoderado = id_apoderado;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", id_apoderado=" + id_apoderado + ", id_usuario=" + id_usuario + '}';
    }
    
}
