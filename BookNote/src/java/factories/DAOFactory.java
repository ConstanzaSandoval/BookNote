package factories;

import dao.AlumnoDAO;
import dao.ApoderadoDAO;
import dao.AsignaturaDAO;
import dao.Asignatura_alumnoDAO;
import dao.AsistenciaDAO;
import dao.ConexionDAO;
import dao.DocenteDAO;
import dao.MensajeDAO;
import dao.PruebaDAO;
import dao.UsuarioDAO;
import exception.MotorNoSoportadoException;



public class DAOFactory {
    private static DAOFactory daofactory;

    private DAOFactory() {
    }
    
    public enum Motor{
        MY_SQL, 
    }
    
    public AlumnoDAO getAlumnoDAO(Motor motor) throws MotorNoSoportadoException{
        switch(motor){
            case MY_SQL:
                return new MySQL_AlumnoDAO();           
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    
    public ApoderadoDAO getApoderadoDAO(Motor motor) throws MotorNoSoportadoException{
        switch(motor){
            case MY_SQL:
                return new MySQL_ApoderadoDAO();           
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    
    public AsignaturaDAO getAsignaturaDAO(Motor motor) throws MotorNoSoportadoException{
        switch(motor){
            case MY_SQL:
                return new MySQL_AsignaturaDAO();           
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    
    public Asignatura_alumnoDAO getAsignatura_alumnoDAO(Motor motor) throws MotorNoSoportadoException{
        switch(motor){
            case MY_SQL:
                return new MySQL_Asignatura_alumnoDAO();           
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    
    public AsistenciaDAO getAsistenciaDAO(Motor motor) throws MotorNoSoportadoException{
        switch(motor){
            case MY_SQL:
                return new MySQL_AsistenciaDAO();           
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    
    public ConexionDAO getConexionDAO(Motor motor) throws MotorNoSoportadoException{
        switch(motor){
            case MY_SQL:
                return new MySQL_ConexionDAO();           
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    
    public DocenteDAO getDocenteDAO(Motor motor) throws MotorNoSoportadoException{
        switch(motor){
            case MY_SQL:
                return new MySQL_DocenteDAO();           
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    
    public MensajeDAO getMensajeDAO(Motor motor) throws MotorNoSoportadoException{
        switch(motor){
            case MY_SQL:
                return new MySQL_MensajeDAO();           
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    
    public PruebaDAO getPruebaDAO(Motor motor) throws MotorNoSoportadoException{
        switch(motor){
            case MY_SQL:
                return new MySQL_PruebaDAO();           
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    
    public UsuarioDAO getUsuarioDAO(Motor motor) throws MotorNoSoportadoException{
        switch(motor){
            case MY_SQL:
                return new MySQL_UsuarioDAO();           
            default:
                throw new MotorNoSoportadoException(motor+" no soportado");
        }
    }
    
}
