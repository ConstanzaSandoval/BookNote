package dao;

import java.util.List;
import model.Prueba;

public interface PruebaDAO {
    
    void create (Prueba p);
    List<Prueba> read();        
    void update (Prueba p);
    void delete (String id);
}
