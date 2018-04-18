/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

//import controlador.acceso.CAcceso;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import util.FacesCurrentInstance;
//import util.FacesUtils;

/**
 * Clase conexion a la Base de Datos SQL Server
 * @author AMD
 */
public class SQL_Conexion {
//public class SQL_Conexion extends FacesCurrentInstance {

    private String url = "";
    private String username = "";
    private String password = "";
    private String className = "";
    public static Connection conn;
    public CallableStatement stmt;
    //private static CAcceso cAcceso;

    /*public SQL_Conexion() {
        setToContextSessionMap("cSQL_Conexion", this);
        cAcceso = (CAcceso) FacesUtils.getExternalContext().getSessionMap().get("cAcceso");
    }*/

    /**
     *  Permite establecer conexion con diferentes base de datos del SQL SERVER
     */
    public void SQL_ConexionGeneral(String bd) {

        //this.url = "jdbc:sqlserver://192.168.0.14:1433;databaseName=" + bd;
        //this.url = "jdbc:sqlserver://192.168.1.33:1433;databaseName=" + bd;
        this.url = "jdbc:sqlserver://localhost:1433;databaseName=" + bd;
        this.username = "usuario_java";
        this.password = "1";
        //this.password = "7895123";
        this.className = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    }

    public void openConection() {
        try {
            Class.forName(className);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("SE CREO CONEXION SQL");
        } catch (SQLException ex) {
            Logger.getLogger(SQL_Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SQL_Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnectionBD() {
        return conn;
    }

    public void closeConnection() {
        try {
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQL_Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
