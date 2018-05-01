package factories;

import dao.ConexionDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MySQL_ConexionDAO implements ConexionDAO {
private Connection con; 
    private Statement sen;  
    private ResultSet rs;   

    public MySQL_ConexionDAO(String server, String bd, String user, String pass) {
        try {
            String protocolo = "jdbc:mysql://";
            String lineaUser = "user=" + user;
            String lineaPass = "password=" + pass;

            String url = protocolo
                    + server + "/"
                    + bd + "?"
                    + lineaUser + "&"
                    + lineaPass;

            System.out.println(url);

            Class.forName("com.mysql.jdbc.Driver"); 
            con = DriverManager.getConnection(url);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MySQL_ConexionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void close() {
        try {
            sen.close();
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_ConexionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void ejecutar(String query) {
        try {
            sen = con.createStatement();
            sen.executeUpdate(query);
            close();

        } catch (SQLException ex) {
            Logger.getLogger(MySQL_ConexionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void conectar() {
        try {
            sen = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_ConexionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ResultSet ejecutarSelec(String select) {
        try {
            System.out.println(select);
            sen = con.createStatement();
            rs = sen.executeQuery(select);
            
        } catch (SQLException ex) {
            Logger.getLogger(MySQL_ConexionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }



    
}
