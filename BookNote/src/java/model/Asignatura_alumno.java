package model;

public class Asignatura_alumno {
    
    private int id;
    private int id_asignatura;
    private int id_alumno;
    private int id_asistencia;

    public Asignatura_alumno() {
    }

    public Asignatura_alumno(int id, int id_asignatura, int id_alumno, int id_asistencia) {
        this.id = id;
        this.id_asignatura = id_asignatura;
        this.id_alumno = id_alumno;
        this.id_asistencia = id_asistencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(int id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getId_asistencia() {
        return id_asistencia;
    }

    public void setId_asistencia(int id_asistencia) {
        this.id_asistencia = id_asistencia;
    }

    @Override
    public String toString() {
        return "Asignatura_alumno{" + "id=" + id + ", id_asignatura=" + id_asignatura + ", id_alumno=" + id_alumno + ", id_asistencia=" + id_asistencia + '}';
    }
    
}
