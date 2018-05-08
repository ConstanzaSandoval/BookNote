package dao;

import java.sql.SQLException;
import java.util.List;
import model.Alumno;

public interface AlumnoDAO {
    void create (Alumno a)throws SQLException;
    List<Alumno> read()throws SQLException;        
    void update (Alumno a)throws SQLException;
    void delete (String id)throws SQLException;
}
