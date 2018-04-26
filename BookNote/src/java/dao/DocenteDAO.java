package dao;

import java.util.List;
import model.Docente;

public interface DocenteDAO {
    
    void create (Docente d);
    List<Docente> read();        
    void update (Docente d);
    void delete (String id);
}
