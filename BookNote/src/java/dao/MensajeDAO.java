package dao;

import java.util.List;
import model.Mensaje;

public interface MensajeDAO {
    
    void create (Mensaje m);
    List<Mensaje> read();        
    void update (Mensaje m);
    void delete (String id);
}
