package factories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dao.PersonaDAO;
import model.Persona;

public class MySQL_PersonaDAO implements PersonaDAO {

    private ResultSet rs;
    private String sql;
    private List<Persona> personas;

    MySQL_ConexionDAO c;

    public MySQL_PersonaDAO() throws ClassNotFoundException, SQLException {
        c = new MySQL_ConexionDAO("localhost", "bd_book_note", "root", "");
    }

    @Override
    public void create(Persona a) throws SQLException {
        sql = "insert into persona value(null,'" + a.getNombre() + "', '" + a.getApellido()+ "', " + a.getId_usuario() + ")";
        c.ejecutar(sql);
    }

    @Override
    public List<Persona> read() throws SQLException{
        sql = "select * from persona";
        
        personas = new ArrayList<>();
        
        Persona p;
        
        rs = c.ejecutarSelec(sql);
                
            while (rs.next()) {
                p = new Persona();
                
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setApellido(rs.getString(3));
                p.setId_usuario(rs.getInt(4));
                
                personas.add(p);
            }
        
        c.close();
        
        return personas;
    }

    @Override
    public void update(Persona a) throws SQLException {
        sql = "update persona set "
                + "nombre = '" + a.getNombre() + "', "
                + "apellido = '" + a.getApellido() + "', "
                + "id_usuario = " + a.getId_usuario() + " "
                + "where id = " + a.getId();
        c.ejecutar(sql);
    }

    @Override
    public void delete(String id) throws SQLException {
        sql = "delete from persona where id=" + id;
        c.ejecutar(sql);
    }

}