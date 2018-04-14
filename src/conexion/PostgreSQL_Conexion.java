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
public class PostgreSQL_Conexion {

    private String url = "";
    private String username = "";
    private String password = "";
    private String className = "";
    public static Connection conn;
    public CallableStatement stmt;

    /**
     *  Permite establecer conexion con diferentes base de datos del SQL SERVER
     */
    public void PostgreSQL_ConexionGeneral(String bd) {

        this.url = "jdbc:postgresql://192.168.0.14:5432/" + bd;
        this.username = "postgres";
        this.password = "system";
        this.className = "org.postgresql.Driver";

    }

    public void openConection() {
        try {

            Class.forName(className);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("SE CREO CONEXION POSTGRESQL");
        } catch (SQLException ex) {
            Logger.getLogger(PostgreSQL_Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PostgreSQL_Conexion.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(PostgreSQL_Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
