/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase conexion a la Base de Datos SQL Server
 * @author AMD
 */
public class FoxPro_Conexion {

    private String url = "";
    private String className = "";
    public static Connection conn;
    public CallableStatement stmt;

    /**
     *  Permite establecer conexion con diferentes base de datos del SQL SERVER
     */
    public void FP_ConexionGeneral(String bd) {

        this.url = "jdbc:odbc:" + bd;              
        this.className = "sun.jdbc.odbc.JdbcOdbcDriver";

    }

    public void openConection() {
        try {
            Class.forName(className).newInstance();
            
            conn = DriverManager.getConnection(url);
            
            System.out.println("BASE DE DATOS "+url+" DE VFP CONECTADA");

        } catch (InstantiationException ex) {
            Logger.getLogger(FoxPro_Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(FoxPro_Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FoxPro_Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FoxPro_Conexion.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(FoxPro_Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
