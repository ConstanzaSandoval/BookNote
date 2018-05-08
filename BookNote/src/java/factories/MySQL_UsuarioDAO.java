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
        sql = "select crear_usuario(" + u.getNickname() + "," + u.getPass() + ")";//crear usuario es una funcion sql que hace el insert con la contraseña encriptada usando AES
        rs = c.ejecutarSelec(sql);

        
            if(rs.next()) {// Ahora podemos comprobar si se creo el usuario o no ya que el la funcion del script retorna boolean
               if(rs.getBoolean(1)){
                   System.out.println("Usuario creado");
               }else{
                   System.out.println("el nickname ya existe");
               }
            }
        

        c.close();
        
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
    public Usuario logIn(String nick, String pass) throws SQLException { // Destinado a obtener usuario dados nickname y password comparando los password encriptados en AES
        sql = "call obtener_usuario(" + nick + "','" + pass + ")";
        rs = c.ejecutarSelec(sql);
        
        Usuario u= new Usuario();
        
       
            if (rs.next()) {
                u.setId(rs.getInt(1));
                u.setNickname(rs.getString(2));
                u.setPass(rs.getString(3));
            }
        

        c.close();

        return u;
    }

}
