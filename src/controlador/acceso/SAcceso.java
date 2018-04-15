/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.acceso;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.bdsistema.Sys10001;
import modelo.bdsistema.Sys10002;
import modelo.bdsistema.Sys10005;
import modelo.bdsistema.Sys10007;
import servicio_entidad.SE_SQL_bdsistema;
import util.DesEncrypter;

/**
 *
 * @author AMD
 */
public class SAcceso extends SE_SQL_bdsistema {

    /*** Sys10001 */
    public Sys10001 listOneSys10001(int codemp) {

        ResultSet rs = listAllSimpleWhereOrderBy("sys10001", "codemp", "" + codemp, "codemp");
        Sys10001 c = new Sys10001();
        try {
            while (rs.next()) {

                c = asignaCamposSys10001(c, rs);

            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }

    /*** Sys10002 */
    public ArrayList<Sys10002> listAllSys10002() {
        System.out.println("Listando Sys002");

        ArrayList<Sys10002> tmp = new ArrayList<>();
        ResultSet rs = listAllSimpleOrderBy("sys10002", "codapli");
        try {
            while (rs.next()) {
                Sys10002 sum = new Sys10002();
                sum = asignaCamposSys10002(sum, rs);
                tmp.add(sum);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tmp;
    }

    public ArrayList<Sys10002> listModuloxUsuario(String usu, String codemp) {
        System.out.println("Listando Modulos");

        ArrayList<Sys10002> tmp = new ArrayList<>();
        String select = "s2.codapli,denapli, s2.usrcod, s2.usrdate, s2.usrtime";
        String order = "defecto desc";
        String[] nameEntidad = {"sys10002", "sys10004"};
        String[] alias = {"s2", "s4"};
        String[] onEqual = {"s4.codapli= s2.codapli"};
        String[] campo = {"s4.codemp", "codusr"};
        String[] relacion = {"=", "="};
        String[] value = {codemp, "'" + usu + "'"};


        ResultSet rs = queryInnerJoin(nameEntidad, alias, onEqual, select, campo, relacion, value, order);
        try {
            while (rs.next()) {
                Sys10002 sum = new Sys10002();
                sum = asignaCamposSys10002(sum, rs);
                tmp.add(sum);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tmp;
    }

    /*** Sys10005 */
    public boolean validaAcceso(String usu, String pass, String codemp) {
        boolean flag = false;
        try {
        	
        	
            DesEncrypter encrypter = new DesEncrypter();
            String claveBD = getPass(usu).trim();
            String encrypted = encrypter.encrypt(pass);

            String[] campo = {"codusr", "codemp"};
            String[] relacion = {"=", "="};
            String[] value = {"'" + usu + "'", "" + codemp + ""};
            
            System.out.println("DATOS....");
            System.out.println("USUARIO->"+usu);
            System.out.println("CODIGO->"+codemp);
            System.out.println("PASS -> " + pass + ":"+encrypted);
            System.out.println("PASS_BD->" + claveBD);

            ResultSet rs = listAllComplexWhereOrderBy("sys10005", campo, relacion, value, "codusr");

            while (rs.next()) {

                if (encrypted.equals(claveBD)) {
                    flag = true;
                    System.out.println("PASOOOO");
                }
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SAcceso.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
        }
        return flag;
    }

    public Sys10005 listOneSys10005(String codusu) {

        ResultSet rs = listAllSimpleWhereOrderBy("sys10005", "codusr", "'" + codusu + "'", "codusr");
        Sys10005 u = new Sys10005();
        try {
            while (rs.next()) {

                u = asignaCamposSys10005(u, rs);

            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    }
    
    public ArrayList<Sys10005> listAllSys10005() {

        ArrayList<Sys10005> users = new ArrayList<>();
        try (ResultSet rs = listAllSimpleOrderBy("sys10005", "codusr")){
            while (rs.next()) {
            	Sys10005 u = new Sys10005();
            	users.add( this.asignaCamposSys10005(u, rs));
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }
    public boolean validaUsuario(String codusu) {
        boolean flag = false;
        ResultSet rs = listAllSimpleWhereOrderBy("sys10005", "codusr", "'" + codusu + "'", "codusr");
        try {
            while (rs.next()) {

                flag = true;

            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public String getPass(String codusu) {
        String pass = "";
        ResultSet rs = listAllSimpleWhereOrderBy("sys10005", "codusr", "'" + codusu + "'", "codusr");
        try {
            while (rs.next()) {
                pass = rs.getString(4);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pass;
    }

    /*** Sys10007 */
    public ArrayList<Sys10007> listAllSys10007() {
        ArrayList<Sys10007> tmp = new ArrayList<>();
        ResultSet rs = listAllSimpleOrderBy("sys10007", "cidopcion");
        try {
            System.out.println("a punto de leer el RS");
            while (rs.next()) {
                Sys10007 sum = new Sys10007();
                sum = asignaCamposSys10007(sum, rs);
                tmp.add(sum);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tmp;
    }

    public ArrayList<Sys10007> listAllByCampo(String nameCampoWhere, String value, String nameCampoOrder) {
        ArrayList<Sys10007> tmp = new ArrayList<>();
        ResultSet rs = listAllSimpleWhereOrderBy("sys10007", nameCampoWhere, value, nameCampoOrder);
        try {
            System.out.println("a punto de leer el RS");
            while (rs.next()) {
                Sys10007 sum = new Sys10007();
                sum = asignaCamposSys10007(sum, rs);
                tmp.add(sum);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tmp;
    }
    
    public ArrayList<Sys10007> listAllComplexWhere(String[] nameCampoWhere, String[] relacion, String[] value, String nameCampoOrder) {
        ArrayList<Sys10007> tmp = new ArrayList<>();
        ResultSet rs = listAllComplexWhereOrderBy("sys10007", nameCampoWhere, relacion, value, nameCampoOrder);
        try {
            System.out.println("a punto de leer el RS");
            while (rs.next()) {
                Sys10007 sum = new Sys10007();
                sum = asignaCamposSys10007(sum, rs);
                tmp.add(sum);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tmp;
    }

    public ArrayList<Sys10007> listAllComplexWhereOpcMenu(String opcmenu, int codapli, String[] nameCampoWhere, String[] relacion, String[] value, String nameCampoOrder) {
        ArrayList<Sys10007> tmp = new ArrayList<>();
        ResultSet rs = listAllComplexWhereOrderBy("sys10007", nameCampoWhere, relacion, value, nameCampoOrder);
        String tmpdig = "";
        int indicador = 0;
        try {
            //System.out.println("Todo el rs:"+rs);
            System.out.println("llego a list all opcmenu:"+opcmenu+" y codapli:"+codapli);
            System.out.println("a punto de leer el RS");
            while (rs.next()) {
               Sys10007 sum = new Sys10007();
                sum = asignaCamposSys10007(sum, rs);
                
                if ((opcmenu.equals("1")) && (codapli == 8)) {
                    tmpdig = sum.getCidopcion().substring(0, 2);
                    System.out.println("Los dos primeros digitos en 1 Operativo: " + tmpdig);
                    indicador = Integer.parseInt(tmpdig);
                    if ((0 < indicador) && (indicador < 9)) {
                        System.out.println("Se mostrará en menu operativo:"+sum.getCidopcion());
                        sum = asignaCamposSys10007(sum, rs);
                        tmp.add(sum);
                    }
                }

                if ((opcmenu.equals("2")) && (codapli == 8)) {
                    tmpdig = sum.getCidopcion().substring(0, 2);
                    System.out.println("Los dos primeros digitos en 2 Formulación: " + tmpdig);
                    indicador = Integer.parseInt(tmpdig);
                    if ((8 < indicador) && (indicador < 16)) {
                        sum = asignaCamposSys10007(sum, rs);
                        tmp.add(sum);
                    }
                }
                
                if ((opcmenu.equals("3")) && (codapli == 8)) {
                    tmpdig = sum.getCidopcion().substring(0, 2);
                    System.out.println("Los dos primeros digitos en 3 Reformulación: " + tmpdig);
                    indicador = Integer.parseInt(tmpdig);
                    if ((15 < indicador) && (indicador < 22)) {
                        sum = asignaCamposSys10007(sum, rs);
                        tmp.add(sum);
                    }
                }
                
                if ((opcmenu.equals("4")) && (codapli == 8)) {
                    tmpdig = sum.getCidopcion().substring(0, 2);
                    System.out.println("Los dos primeros digitos en 4 Historial: " + tmpdig);
                    indicador = Integer.parseInt(tmpdig);
                    if ((21 < indicador) && (indicador < 27)) {
                        sum = asignaCamposSys10007(sum, rs);
                        tmp.add(sum);
                    }
                }                               
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(SAcceso.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tmp;
    }

    /*** ASIGNA CAMPOS ***/
    public Sys10001 asignaCamposSys10001(Sys10001 s, ResultSet rs) throws SQLException {
        s.setCodemp(rs.getInt(1));
        s.setDenemp(rs.getString(2));
        s.setNrolicencia(rs.getString(3));
        s.setUsrcod(rs.getString(4));
        s.setUsrdate(rs.getString(5));
        s.setUsrtime(rs.getString(6));
        return s;
    }

    public Sys10002 asignaCamposSys10002(Sys10002 s, ResultSet rs) throws SQLException {
        s.setCodapli(rs.getInt(1));
        s.setDenapli(rs.getString(2));
        s.setUsrcod(rs.getString(3));
        s.setUsrdate(rs.getString(4));
        s.setUsrtime(rs.getString(5));
        return s;
    }

    public Sys10005 asignaCamposSys10005(Sys10005 s, ResultSet rs) throws SQLException {
        s.setCodemp(rs.getInt(1));
        s.setCodusr(rs.getString(2));
        s.setDenusr(rs.getString(3));
        s.setClave(rs.getString(4));
        s.setAgencia(rs.getString(5));
        s.setOficina(rs.getString(6));
        s.setImprime(rs.getInt(7));
        s.setActualiza(rs.getInt(8));
        s.setElimina(rs.getInt(9));
        s.setAgrega(rs.getInt(10));
        s.setUsrcod(rs.getString(11));
        s.setUsrdate(rs.getString(12));
        s.setUsrtime(rs.getString(13));
        s.setCorreo(rs.getString(14));
        s.setClavecorreo(rs.getString(15));
        return s;
    }

    public Sys10007 asignaCamposSys10007(Sys10007 s, ResultSet rs) throws SQLException {
        s.setCidopcion(rs.getString(1));
        s.setCodapli(rs.getInt(2));
        s.setDesopcion(rs.getString(3));
        s.setLprincipal(rs.getInt(4));
        s.setLdespliega(rs.getInt(5));
        s.setCpopup(rs.getString(6));
        s.setTextopc(rs.getString(7));
        s.setDespagina(rs.getString(8));
        s.setModulo(rs.getString(9));
        s.setPerfiles(rs.getString(10));
        s.setNivel(rs.getString(11));
        s.setUsrcod(rs.getString(12));
        s.setUsrdate(rs.getString(13));
        s.setUsrtime(rs.getString(14));
        return s;
    }
}
