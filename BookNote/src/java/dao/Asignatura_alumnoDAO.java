package dao;

import java.sql.SQLException;
import java.util.List;
import model.Asignatura_alumno;

public interface Asignatura_alumnoDAO {
    
    void create (Asignatura_alumno asa)throws SQLException;
    List<Asignatura_alumno> read()throws SQLException;        
    void update (Asignatura_alumno asa)throws SQLException;
    void delete (String id)throws SQLException;
}
