package dao;

import java.util.List;
import model.Apoderado;

public interface ApoderadoDAO {
    void create (Apoderado ap);
    List<Apoderado> read();        
    void update (Apoderado ap);
    void delete (String id);
}
