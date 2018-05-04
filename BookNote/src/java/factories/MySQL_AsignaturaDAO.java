package factories;

import dao.AsignaturaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Asignatura;

public class MySQL_AsignaturaDAO implements AsignaturaDAO {

    private ResultSet rs;
    private String sql;
    private List<Asignatura> asignatura;

    MySQL_ConexionDAO c;

    public MySQL_AsignaturaDAO() throws ClassNotFoundException, SQLException {
        c = new MySQL_ConexionDAO("localhost", "bd_book_note", "root", "");
    }

    @Override
    public void create(Asignatura as) {
        sql = "insert into asignatura value(null,'" + as.getNombre() + "'," + as.getId_docente() + "," + as.getAsistencia() + ")";
        c.ejecutar(sql);
    }

    @Override
    public List<Asignatura> read() {
        sql = "select * from asignatura";

        asignatura = new ArrayList<>();

        Asignatura as;

        rs = c.ejecutarSelec(sql);

        try {
            while (rs.next()) {
                as = new Asignatura();
                
                as.setId(rs.getInt(1));
                as.setNombre(rs.getString(2));
                as.setId_docente(rs.getInt(3));
                as.setAsistencia(rs.getInt(4));
                
                asignatura.add(as);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_AsignaturaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        c.close();

        return asignatura;
    }

    @Override
    public void update(Asignatura as) {
        sql = "update asignatura set nombre = '" + as.getNombre() + "', id_docente = " + as.getId_docente() + ", asistencia = " + as.getAsistencia() + " where id = " + as.getId() + "";
        c.ejecutar(sql);
    }

    @Override
    public void delete(String id) {
        sql = "delete from asignatura where id=" + id;
        c.ejecutar(sql);
    }

}
