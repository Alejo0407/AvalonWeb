/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.costos.mt.cencos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.bdcostos.Cct0004;
import servicio_entidad.SE_SQL_bdcostos;

/**
 * SERVICIO ENTIDAD DE CENTROS DE COSTOS
 * @autor AMD
 */
public class SCentrosDeCostos extends SE_SQL_bdcostos {

    public ArrayList<Cct0004> listarCenCos(int codemp) {

        ArrayList<Cct0004> tbl = new ArrayList<Cct0004>();
        ResultSet rs = listAllSimpleWhereOrderBy("cct0004", "codemp", String.valueOf(codemp), "ccta");

        try {
            while (rs.next()) {
                Cct0004 cct0004 = new Cct0004();
                cct0004 = asignaCamposCct0004(cct0004, rs);
                tbl.add(cct0004);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SCentrosDeCostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tbl;

    }

    public String getLastCCAxCCPxCOExCOG(int codemp, String codcog, String codcoe, String codccp) {
        System.out.println("dentro :D!!!!");
        String cca = "0";
        String[] campo = {"codcoe", "codemp", "codcog", "codccp"};
        String[] relacion = {"=", "=", "=", "="};
        String[] value = {codcoe, "" + codemp + "", codcog, codccp};

        ResultSet rs = listAllComplexWhereOrderBy("cct0004", campo, relacion, value, "cca");

        try {
            while (rs.next()) {
                cca = rs.getString("cca");
                
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SCentrosDeCostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cca;

    }

    public void actualizaCenCos(Cct0004 c) {
        try {
            callSP("pa_mt_cct0004", "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setInt(1, 3);
            stmt.setInt(2, c.getCodemp());
            stmt.setString(3, c.getCcta());
            stmt.setString(4, c.getCod());
            stmt.setString(5, c.getCodsunat());
            stmt.setString(6, c.getLocacion());
            stmt.setString(7, c.getCodcoe());
            stmt.setString(8, c.getCodccp());
            stmt.setString(9, c.getCodcog());
            stmt.setString(10, c.getCca());
            stmt.setString(11, c.getDescr());
            stmt.setString(12, c.getEstado());
            stmt.setString(13, c.getTipcosto());
            stmt.setString(14, c.getDetalle());
            stmt.setString(15, c.getFctadebe());
            stmt.setString(16, c.getFctahaber());
            stmt.setString(17, c.getUsrcod());
            stmt.setString(18, c.getUsrdate());
            stmt.setString(19, c.getUsrtime());

            boolean i = stmt.execute();
            System.out.println("i: " + i);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(SCentrosDeCostos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminaCenCos(Cct0004 c) {
        try {
            callSP("pa_mt_cct0004", "(?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, 2);
            stmt.setInt(2, c.getCodemp());
            stmt.setString(3, c.getCcta().trim());
            stmt.setString(4, c.getCod());
            stmt.setString(5, c.getCodsunat());
            stmt.setString(6, c.getLocacion());
            stmt.setString(7, c.getCodcoe());
            stmt.setString(8, c.getCodccp());
            stmt.setString(9, c.getCodcog());


            boolean i = stmt.execute();
            System.out.println("i: " + i);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(SCentrosDeCostos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void nuevoCenCos(Cct0004 c) {
        try {
            callSP("pa_mt_cct0004", "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            stmt.setInt(1, 1);
            stmt.setInt(2, c.getCodemp());
            stmt.setString(3, c.getCcta());
            stmt.setString(4, c.getCod());
            stmt.setString(5, c.getCodsunat());
            stmt.setString(6, c.getLocacion());
            stmt.setString(7, c.getCodcoe());
            stmt.setString(8, c.getCodccp());
            stmt.setString(9, c.getCodcog());
            stmt.setString(10, c.getCca());
            stmt.setString(11, c.getDescr());
            stmt.setString(12, c.getEstado());
            stmt.setString(13, c.getTipcosto());
            stmt.setString(14, c.getDetalle());
            stmt.setString(15, c.getFctadebe());
            stmt.setString(16, c.getFctahaber());
            stmt.setString(17, c.getUsrcod());
            stmt.setString(18, c.getUsrdate());
            stmt.setString(19, c.getUsrtime());

            boolean i = stmt.execute();
            System.out.println("i: " + i);
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(SCentrosDeCostos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*** ASIGNA CAMPOS ***/
    public Cct0004 asignaCamposCct0004(Cct0004 s, ResultSet rs) throws SQLException {
        s.setCodemp(rs.getInt(1));
        s.setCcta(rs.getString(2));
        s.setCod(rs.getString(3));
        s.setCodsunat(rs.getString(4));
        s.setLocacion(rs.getString(5));
        s.setCodcoe(rs.getString(6));
        s.setCodccp(rs.getString(7));
        s.setCodcog(rs.getString(8));
        s.setCca(rs.getString(9));
        s.setDescr(rs.getString(10));
        s.setEstado(rs.getString(11));
        s.setTipcosto(rs.getString(12));
        s.setDetalle(rs.getString(13));
        s.setFctadebe(rs.getString(14));
        s.setFctahaber(rs.getString(15));
        s.setUsrcod(rs.getString(16));
        s.setUsrdate(rs.getString(17));
        s.setUsrtime(rs.getString(18));
        s.setSelected(false);

        return s;
    }
}
