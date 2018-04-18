/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.costos.mt.paramsist;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.bdcostos.Cct0002;
import modelo.bdcostos.Cct0006;
import servicio_entidad.SE_SQL_bdcostos;

/**
 *
 * @author AMD-Juan
 */
public class SParamSistemas extends SE_SQL_bdcostos{
     
    public ArrayList<Cct0006> listarParamSistemCog(int codemp) {
        ArrayList<Cct0006> tbl = new ArrayList<Cct0006>();
        ResultSet rs = listAllcct0006("cct0006");
        try {
            while (rs.next()) {
                Cct0006 cct0006 = new Cct0006();
                cct0006 = asignaCamposCct0006(cct0006, rs);
                tbl.add(cct0006);
              } 
              
           rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(controlador.costos.mt.cencos.SCentrosDeCostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tbl;

    }
    
      public ArrayList<Cct0002> listarcct0002NomEmpresa(int codemp) {

        ArrayList<Cct0002> tbl = new ArrayList<Cct0002>();
        ResultSet rs = listAllcct0002empresa("cct0002");
      
        try {
            while (rs.next()) {
                Cct0002 cct0002 = new Cct0002();
                cct0002 = asignaCamposCct0002emp(cct0002, rs);
                tbl.add(cct0002);              
              }
           rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(controlador.costos.mt.cencos.SCentrosDeCostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tbl;

    }
      
          
      public ArrayList<Cct0002> listarcct0002(int codemp) {

        ArrayList<Cct0002> tbl = new ArrayList<Cct0002>();
        ResultSet rs = listAll("cct0002");
      
        try {
            while (rs.next()) {
                Cct0002 cct0002 = new Cct0002();
                cct0002 = asignaCamposCct0002(cct0002, rs);
                tbl.add(cct0002);              
              }
           rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(controlador.costos.mt.cencos.SCentrosDeCostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tbl;

    }
    
     public void actualizaAguaPot(Cct0006 c) {
        try {
          callSP("pa_mt_cct0006", "(?,?,?,?,?,?,?)");
            stmt.setInt(1,5);
            stmt.setInt(2,10);
            stmt.setString(3, c.getCodcog());
            stmt.setString(4, "");
            stmt.setString(5, "");
            stmt.setString(6, "");
            stmt.setString(7, "");
            
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(SParamSistemas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
         public void actualizaAlcantarillado(Cct0006 c) {
        try {
          callSP("pa_mt_cct0006", "(?,?,?,?,?,?,?)");
            stmt.setInt(1,6);
            stmt.setInt(2,10);
            stmt.setString(3, c.getCodcog());
            stmt.setString(4, "");
            stmt.setString(5, "");
            stmt.setString(6, "");
            stmt.setString(7, "");
            
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(SParamSistemas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
         
             public void actualizaConexos(Cct0006 c) {
        try {
          callSP("pa_mt_cct0006", "(?,?,?,?,?,?,?)");
            stmt.setInt(1,7);
            stmt.setInt(2,10);
            stmt.setString(3, c.getCodcog());
            stmt.setString(4, "");
            stmt.setString(5, "");
            stmt.setString(6, "");
            stmt.setString(7, "");
            
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(SParamSistemas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
             
    public void actualizaNomEmpresa(Cct0002 c) {
        try {
          callSP("pa_mt_cct0002", "(?,?,?,?,?,?,?,?)");
            stmt.setInt(1,1);
            stmt.setInt(2,10);
            stmt.setString(3,"");
            stmt.setString(4, "");
            stmt.setString(5, c.getPempres());
            stmt.setString(6, "");
            stmt.setString(7, "");
            stmt.setString(8, "");
            
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(SParamSistemas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       /*** ASIGNA CAMPOS ***/
    public Cct0006 asignaCamposCct0006(Cct0006 s, ResultSet rs) throws SQLException {
        s.setCodcog(rs.getString(1));
        s.setDescog(rs.getString(2));
        return s;
    }
    
    public Cct0002 asignaCamposCct0002emp(Cct0002 s,ResultSet rs) throws SQLException{
        s.setPempres(rs.getString(1));      

        return s;
    }
    public Cct0002 asignaCamposCct0002(Cct0002 s,ResultSet rs) throws SQLException{
        s.setCodemp(rs.getInt(1));
        
 
        s.setArea(rs.getString(2));
        
        s.setRespon(rs.getString(3));
        s.setPempres(rs.getString(4));      
        s.setCodserap(rs.getString(5));
        s.setCodseral(rs.getString(6));
        s.setCodsercx(rs.getString(7));
        s.setUsrcod(rs.getString(8));
        s.setUsrdate(rs.getString(9));
        s.setUsrtime(rs.getString(10));
    return s;
    }
    
}
