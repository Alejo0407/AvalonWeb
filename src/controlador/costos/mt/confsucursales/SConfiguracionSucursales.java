
package controlador.costos.mt.confsucursales;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.bdcostos.Cct0003;
import servicio_entidad.SE_SQL_bdcostos;

public class SConfiguracionSucursales extends SE_SQL_bdcostos {

    public ArrayList<Cct0003> listarConfigSucursal(int codemp) {
        System.out.println("LISTANDO CCT0003");
        ArrayList<Cct0003> tbl = new ArrayList<Cct0003>();
        ResultSet rs = listAll("cct0003");
      
        try {
            while (rs.next()) {
               
                Cct0003 cct0003 = new Cct0003();
            if(rs.getString(9)!=null){
                if(rs.getString(9).equalsIgnoreCase("P") || rs.getString(9).equalsIgnoreCase("C")){
                 System.out.println("RESULTSET"+rs.getString(4));
                    cct0003 = asignaCamposCct0003(cct0003, rs);
                    System.out.println(cct0003.getCos_nom()+cct0003.getCos_fpr()+cct0003.getCos_suc()+"---->");
                tbl.add(cct0003);
              }}
              }
           rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(controlador.costos.mt.cencos.SCentrosDeCostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("---> TBL"+ tbl.get(0).getCos_nom());
        
        return tbl;

    }
    
    public String getTop1ConfigSucursal(int codemp) {
      
           String cos_suc="";
            ResultSet rs = listAllSimpleWhereTipOrderBy("cct0003","codemp",String.valueOf(codemp),"cos_suc","desc");

             try {
                while (rs.next()) { //Obtengo el codigo del ultimo resulset
                   cos_suc=rs.getString("cos_suc");
                    
                }
                rs.close();
             } catch (SQLException ex) {
            Logger.getLogger(SConfiguracionSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
            return cos_suc;
       
    } 

    public String getLastCCAxCCPxCOExCOG(int codemp, String codcog, String codcoe, String codccp) {

        String cca = "0";
        String[] campo = {"codcoe", "codemp", "codcog", "codccp"};
        String[] relacion = {"=", "=", "=", "="};
        String[] value = {codcoe, "" + codemp + "", codcog, codccp};

        ResultSet rs = listAllComplexWhereOrderBy("cct0003", campo, relacion, value, "cca");

        try {
            while (rs.next()) {
                cca = rs.getString("cca");
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(controlador.costos.mt.cencos.SCentrosDeCostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cca;

    }    
        public void nuevoConfigSucursales(Cct0003 c) {
            
        try {
            callSP("pa_mt_cct0003", "(?,?,?,?,?,?,?,?)");
            stmt.setInt(1, 1);
            stmt.setInt(2,10);
            stmt.setString(3, c.getCos_suc());
            stmt.setString(4, c.getCos_nom());
            stmt.setString(5, c.getCos_niv());
            stmt.setString(6, c.getCos_tip());
            stmt.setString(7, c.getCos_fpr());
            stmt.setInt(8, c.getCos_pva());
            stmt.execute();
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(SConfiguracionSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
        
        public void eliminaConfigSucursal(Cct0003 c) {
        try {
            callSP("pa_mt_cct0003", "(?,?,?,?,?,?,?,?)");
            stmt.setInt(1, 2);
            stmt.setInt(2,10);
            stmt.setString(3, c.getCos_suc());
            stmt.setString(4, c.getCos_nom());
            stmt.setString(5, "");
            stmt.setString(6, "");
            stmt.setString(7, "");
            stmt.setString(8, "");
            boolean i = stmt.execute();
            System.out.println("Entro con satisfaccion JJ: " + i);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(SConfiguracionSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
     public void actualizaConfigSucursal(Cct0003 c) {
        try {
          callSP("pa_mt_cct0003", "(?,?,?,?,?,?,?,?)");
            stmt.setInt(1, 3);
            stmt.setInt(2,10);
            stmt.setString(3, c.getCos_suc());
            stmt.setString(4, c.getCos_nom());
            stmt.setString(5, c.getCos_niv());
            stmt.setString(6, c.getCos_tip());
            stmt.setString(7, c.getCos_fpr());
            stmt.setInt(8, c.getCos_pva());

            boolean i = stmt.execute();
            System.out.println("i: " + i);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(SConfiguracionSucursales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*** ASIGNA CAMPOS ***/
    public Cct0003 asignaCamposCct0003(Cct0003 s, ResultSet rs) throws SQLException {
        s.setCodemp(rs.getInt(1));
        s.setCos_suc(rs.getString(2));
//        s.setCos_sts(rs.getString(3));
        s.setCos_nom(rs.getString(4));
//        s.setCos_are(rs.getString(5));
//        s.setCos_res(rs.getString(6));
//        s.setCos_inf(rs.getInt(7));
        s.setCos_niv(rs.getString(8));
        s.setCos_tip(rs.getString(9));
        //periodo
        s.setCos_fpr(rs.getString(10));
//        s.setCos_fba(rs.getString(11));
        //%aguas servidas
        s.setCos_pva(rs.getInt(12));
//        s.setCos_p01(rs.getInt(13));
//        s.setCos_p02(rs.getInt(14));
//        s.setCos_p03(rs.getInt(15));
//        s.setCos_p04(rs.getInt(16));
//        s.setCos_p05(rs.getInt(17));
//        s.setCos_p06(rs.getInt(18));
//        s.setCos_p07(rs.getInt(19));
//        s.setCos_p08(rs.getInt(20));
//        s.setCos_p09(rs.getInt(21));
//        s.setCos_p10(rs.getInt(22));
//        s.setCos_p11(rs.getInt(23));
//        s.setCos_p12(rs.getInt(24));
//        s.setCos_rec_ag(rs.getString(25));
//        s.setCos_rec_al(rs.getString(26));        
      //  s.setSelected(false);

        return s;
    }
}

