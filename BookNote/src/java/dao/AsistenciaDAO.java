package dao;

import java.util.List;
import model.Asistencia;

public interface AsistenciaDAO {
    
    void create (Asistencia asi);
    List<Asistencia> read();        
    void update (Asistencia asi);
    void delete (String id);
}
