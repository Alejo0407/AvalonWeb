/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.acceso;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import servicio_entidad.SE_FP_bdcontable;

/**
 *
 * @author PC
 */
public class sAppMain extends SE_FP_bdcontable{
    public int obtenerdigitos(){
    ResultSet rs;
        int ndigitos=0;
    rs=listndigitos("fcon0001");
        try {
            while(rs.next()){
                ndigitos=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(sAppMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    return ndigitos;
    }
    
}
