package factories;

import dao.MensajeDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Mensaje;

public class MySQL_MensajeDAO implements MensajeDAO {

    private ResultSet rs;
    private String sql;
    private List<Mensaje> mensaje;

    MySQL_ConexionDAO c;

    public MySQL_MensajeDAO() throws ClassNotFoundException, SQLException {
        c = new MySQL_ConexionDAO("localhost", "bd_book_note", "root", "");
    }

    @Override
    public void create(Mensaje m) {
        sql = "insert into mensaje value(null,'" + m.getTexto() + "','" + m.getFecha() + "'," + m.getId_asignatura() + ")";
        c.ejecutar(sql);
    }

    @Override
    public List<Mensaje> read() {
        sql = "select * from mensaje";

        mensaje = new ArrayList<>();

        Mensaje m;

        rs = c.ejecutarSelec(sql);

        try {
            while (rs.next()) {
                m = new Mensaje();
                
                m.setId(rs.getInt(1));
                m.setTexto(rs.getString(2));
                m.setFecha(rs.getString(3));
                m.setId_asignatura(rs.getInt(4));
                
                mensaje.add(m);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_MensajeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        c.close();

        return mensaje;
    }

    @Override
    public void update(Mensaje m) {
        sql = "update mensaje set texto = '" + m.getTexto() + "', fecha = " + m.getFecha() + ", id_asignatura = " + m.getId_asignatura() + " where id = " + m.getId() + "";
        c.ejecutar(sql);
    }

    @Override
    public void delete(String id) {
        sql = "delete from mensaje where id=" + id;
        c.ejecutar(sql);
    }

}
