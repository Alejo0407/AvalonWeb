/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio_entidad;

import conexion.FoxPro_Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class SE_FP_bdppto extends FoxPro_Conexion{
    public SE_FP_bdppto() {
        super.FP_ConexionGeneral("bdppto");
    }
    
    public ResultSet listaunidad(String nameEntidad){
    ResultSet rs=null;
    String consulta="SELECT * from "+nameEntidad+" where origen='O' order by cod_unidad";
    try{
        openConection();
        rs=conn.createStatement().executeQuery(consulta);
    }catch(SQLException ex){
    Logger.getLogger(SE_FP_bdcontable.class.getName()).log(Level.SEVERE, null, ex);
    }
    return rs;
    }
    
    public ResultSet listazona(String nameEntidad){
    ResultSet rs=null;
    String consulta="SELECT * from "+nameEntidad+" where origen='O'";
    try{
        openConection();
        rs=conn.createStatement().executeQuery(consulta);
    }catch(SQLException ex){
    Logger.getLogger(SE_FP_bdcontable.class.getName()).log(Level.SEVERE, null, ex);
    }
    return rs;
    }
    
    public ResultSet listaloca(String nameEntidad){
    ResultSet rs=null;
    String consulta="SELECT * from "+nameEntidad +" where origen='O'";
    try{
        openConection();
        rs=conn.createStatement().executeQuery(consulta);
    }catch(SQLException ex){
    Logger.getLogger(SE_FP_bdcontable.class.getName()).log(Level.SEVERE, null, ex);
    }
    return rs;
    }
    
}
