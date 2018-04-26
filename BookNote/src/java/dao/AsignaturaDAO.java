package dao;

import java.util.List;
import model.Asignatura;

public interface AsignaturaDAO {
    void create (Asignatura as);
    List<Asignatura> read();        
    void update (Asignatura as);
    void delete (String id);
}
