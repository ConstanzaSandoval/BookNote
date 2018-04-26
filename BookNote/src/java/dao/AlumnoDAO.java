package dao;

import java.util.List;
import model.Alumno;

public interface AlumnoDAO {
    void create (Alumno a);
    List<Alumno> read();        
    void update (Alumno a);
    void delete (String id);
}
