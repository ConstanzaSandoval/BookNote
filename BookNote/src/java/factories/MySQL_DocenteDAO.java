package factories;

import dao.DocenteDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Docente;

public class MySQL_DocenteDAO implements DocenteDAO {

    private ResultSet rs;
    private String sql;
    private List<Docente> docente;

    MySQL_ConexionDAO c;

    public MySQL_DocenteDAO() throws ClassNotFoundException, SQLException {
        c = new MySQL_ConexionDAO("localhost", "bd_book_note", "root", "");
    }

    @Override
    public void create(Docente d) throws SQLException {
        sql = "insert into docente value(null,'" + d.getNombre() + "','" + d.getApelido() + "'," + d.getId_usuario() + ")";
        c.ejecutar(sql);
    }

    @Override
    public List<Docente> read() throws SQLException {
        sql = "select * from docente";

        docente = new ArrayList<>();

        Docente d;

        rs = c.ejecutarSelec(sql);

       
            while (rs.next()) {
                d = new Docente();
                
                d.setId(rs.getInt(1));
                d.setNombre(rs.getString(2));
                d.setApelido(rs.getString(3));
                d.setId_usuario(rs.getInt(4));
                
                docente.add(d);
            }
        

        c.close();

        return docente;
    }

    @Override
    public void update(Docente d) throws SQLException {
        sql = "update docente set nombre = '" + d.getNombre() + "', apellido = '" + d.getApelido() + "', id_usuario = " + d.getId_usuario() + " where id = " + d.getId() + "";
        c.ejecutar(sql);
    }

    @Override
    public void delete(String id) throws SQLException {
        sql = "delete from docente where id=" + id;
        c.ejecutar(sql);
    }

}
