package factories;

import dao.AsistenciaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Asistencia;

public class MySQL_AsistenciaDAO implements AsistenciaDAO {

    private ResultSet rs;
    private String sql;
    private List<Asistencia> asistencia;

    MySQL_ConexionDAO c;

    public MySQL_AsistenciaDAO() throws ClassNotFoundException, SQLException {
        c = new MySQL_ConexionDAO("localhost", "bd_book_note", "root", "");
    }

    @Override
    public void create(Asistencia asi) {
        sql = "insert into asistencia value(null,'" + asi.getFecha() + "','" + asi.isAsistio() + "')";
        c.ejecutar(sql);
    }

    @Override
    public List<Asistencia> read() {
        sql = "select * from asistencia";

        asistencia = new ArrayList<>();

        Asistencia asi;

        rs = c.ejecutarSelec(sql);

        try {
            while (rs.next()) {
                asi = new Asistencia();
                
                asi.setId(rs.getInt(1));
                asi.setFecha(rs.getString(2));
                asi.setAsistio(rs.getBoolean(3));
                
                asistencia.add(asi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_AsistenciaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        c.close();

        return asistencia;
    }

    @Override
    public void update(Asistencia asi) {
        sql = "update asistencia set fecha = '" + asi.getFecha() + "', asistio = " + asi.isAsistio() + " where id = " + asi.getId() + "";
        c.ejecutar(sql);
    }

    @Override
    public void delete(String id) {
        sql = "delete from asistencia where id=" + id;
        c.ejecutar(sql);
    }

}
