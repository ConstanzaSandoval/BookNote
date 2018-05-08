package dao;

import java.sql.SQLException;
import java.util.List;
import model.Docente;

public interface DocenteDAO {
    
    void create (Docente d)throws SQLException;
    List<Docente> read()throws SQLException;        
    void update (Docente d)throws SQLException;
    void delete (String id)throws SQLException;
}
