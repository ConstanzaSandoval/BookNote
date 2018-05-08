package factories;

import dao.UsuarioDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Usuario;

public class MySQL_UsuarioDAO implements UsuarioDAO {

    private ResultSet rs;
    private String sql;
    private List<Usuario> usuario;

    MySQL_ConexionDAO c;

    public MySQL_UsuarioDAO() throws ClassNotFoundException, SQLException {
        c = new MySQL_ConexionDAO("localhost", "bd_book_note", "root", "");
    }

    @Override
    public void create(Usuario u) throws SQLException {
        sql = "insert into usuario value(null, " + u.getNickname() + ", AES_ENCRYPT (" + u.getPass() + ", llave), " + u.getPerfil() + ");";
        c.ejecutar(sql);
    }

    @Override
    public List<Usuario> read() throws SQLException {
        sql = "select * from usuario";

        usuario = new ArrayList<>();

        Usuario u;

        rs = c.ejecutarSelec(sql);

        while (rs.next()) {
            u = new Usuario();

            u.setId(rs.getInt(1));
            u.setNickname(rs.getString(2));
            u.setPass(rs.getString(3));

            usuario.add(u);
        }

        c.close();

        return usuario;
    }

    @Override
    public void update(Usuario u) throws SQLException {
        sql = "update usuario set nickname = '" + u.getNickname() + "', pass = '" + u.getPass() + "' where id = " + u.getId() + "";
        c.ejecutar(sql);
    }

    @Override
    public void delete(String id) throws SQLException {
        sql = "delete from usuario where id=" + id;
        c.ejecutar(sql);
    }

    @Override
    public Usuario logIn(String nick, String pass, int perfil) throws SQLException { 
        sql = "select * from usuario where "
                + "usuario.pass = AES_ENCRYPT ("+pass+", llave) and "
                + "nickname = "+nick+" and "
                + "perfil = "+perfil;
        rs = c.ejecutarSelec(sql);

        Usuario u = new Usuario();

        if (rs.next()) {
            u.setId(rs.getInt(1));
            u.setNickname(rs.getString(2));
            u.setPass(rs.getString(3));
            u.setPerfil(rs.getInt(4));
        }

        c.close();

        return u;
    }

}
