package dao;

import java.sql.SQLException;
import java.util.List;
import model.Asignatura;

public interface AsignaturaDAO {
    void create (Asignatura as)throws SQLException;
    List<Asignatura> read()throws SQLException;        
    void update (Asignatura as)throws SQLException;
    void delete (String id)throws SQLException;
}
