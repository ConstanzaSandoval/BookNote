package dao;

import java.sql.SQLException;
import java.util.List;
import model.Apoderado;

public interface ApoderadoDAO {
    void create (Apoderado ap)throws SQLException;
    List<Apoderado> read()throws SQLException;        
    void update (Apoderado ap)throws SQLException;
    void delete (String id)throws SQLException;
}
