package factories;

import dao.ApoderadoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Apoderado;

public class MySQL_ApoderadoDAO implements ApoderadoDAO {

    private ResultSet rs;
    private String sql;
    private List<Apoderado> apoderado;

    MySQL_ConexionDAO c;

    public MySQL_ApoderadoDAO() throws ClassNotFoundException, SQLException {
        c = new MySQL_ConexionDAO("localhost", "bd_book_note", "root", "");
    }

    @Override
    public void create(Apoderado ap) {
        sql = "insert into apoderado value(null,'" + ap.getNombre() + "','" + ap.getApellido() + "'," + ap.getId_usuario() + ")";
        c.ejecutar(sql);
    }

    @Override
    public List<Apoderado> read() {
        sql = "select * from apoderado";

        apoderado = new ArrayList<>();

        Apoderado ap;

        rs = c.ejecutarSelec(sql);

        try {
            while (rs.next()) {
                ap = new Apoderado();
                
                ap.setId(rs.getInt(1));
                ap.setNombre(rs.getString(2));
                ap.setApellido(rs.getString(3));
                ap.setId_usuario(rs.getInt(4));
                
                apoderado.add(ap);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_ApoderadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        c.close();

        return apoderado;
    }

    @Override
    public void update(Apoderado ap) {
        sql = "update apoderado set nombre = '" + ap.getNombre() + "', apellido = '" + ap.getApellido() + "', id_usuario = " + ap.getId_usuario() + " where id = " + ap.getId() + "";
        c.ejecutar(sql);
    }

    @Override
    public void delete(String id) {
        sql = "delete from apoderado where id=" + id;
        c.ejecutar(sql);
    }

}
