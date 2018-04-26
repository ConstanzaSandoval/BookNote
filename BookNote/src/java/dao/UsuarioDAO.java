package dao;

import java.util.List;
import model.Usuario;

public interface UsuarioDAO {
    
    void create (Usuario u);
    List<Usuario> read();        
    void update (Usuario u);
    void delete (String id);
}
