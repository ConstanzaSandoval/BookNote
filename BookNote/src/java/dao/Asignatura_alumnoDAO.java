package dao;

import java.util.List;
import model.Asignatura_alumno;

public interface Asignatura_alumnoDAO {
    
    void create (Asignatura_alumno asa);
    List<Asignatura_alumno> read();        
    void update (Asignatura_alumno asa);
    void delete (String id);
}
