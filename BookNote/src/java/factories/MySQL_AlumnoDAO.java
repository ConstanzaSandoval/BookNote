package factories;

import dao.AlumnoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public void create(Alumno a) throws SQLException {
        sql = "insert into alumno value(null,'" + a.getNombre() + "','" + a.getApellido() + "'," + a.getId_apoderado() + "," + a.getId_usuario() + ")";
        c.ejecutar(sql);
    }

    @Override
    public List<Alumno> read() throws SQLException{
        sql = "select * from alumno";
        
        alumno = new ArrayList<>();
        
        Alumno a;
        
        rs = c.ejecutarSelec(sql);
        
        
            while (rs.next()) {
                a = new Alumno();
                
                a.setId(rs.getInt(1));
                a.setNombre(rs.getString(2));
                a.setApellido(rs.getString(3));
                a.setId_apoderado(rs.getInt(4));
                a.setId_usuario(rs.getInt(5));
                
                alumno.add(a);
            }
        
        c.close();
        
        return alumno;
    }

    @Override
    public void update(Alumno a) throws SQLException {
        sql = "update alumno set nombre = '" + a.getNombre() + "', apellido = '" + a.getApellido() + "', id_apoderado = " + a.getId_apoderado() + ", id_usuario = " + a.getId_usuario() + " where id = " + a.getId() + "";
        c.ejecutar(sql);
    }

    @Override
    public void delete(String id) throws SQLException {
        sql = "delete from alumno where id=" + id;
        c.ejecutar(sql);
    }

}
