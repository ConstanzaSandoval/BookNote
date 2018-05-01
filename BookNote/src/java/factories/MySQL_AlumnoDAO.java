package factories;

import dao.AlumnoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Alumno;

public class MySQL_AlumnoDAO implements AlumnoDAO {
    private ResultSet rs;
    private String sql;
    private List<Alumno> alumno;

    MySQL_ConexionDAO c;
    
    public MySQL_AlumnoDAO() throws ClassNotFoundException, SQLException {
        c = new MySQL_ConexionDAO("localhost", "bd_book_note", "root", "");
    }

    @Override
    public void create(Alumno a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Alumno> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Alumno a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
