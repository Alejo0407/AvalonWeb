package servicio_entidad;

import conexion.FoxPro_Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase Servicio Entidad de BDSISTEMA para SQL SERVER
 * @author AMD
 */
public class SE_FP_bdcontable extends FoxPro_Conexion{

    public SE_FP_bdcontable() {
        super.FP_ConexionGeneral("bdcontable");
    }
    public ResultSet busca(String nameEntidad, String clave, String valor) {
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad + " WHERE " + clave + "like '" + valor + "'";
        try {
            openConection();
            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet listndigitos(String nameEntidad){
    ResultSet rs=null;
    String consulta="SELECT digitos from "+nameEntidad;
    try{
        openConection();
        rs=conn.createStatement().executeQuery(consulta);
    }catch(SQLException ex){
    Logger.getLogger(SE_FP_bdcontable.class.getName()).log(Level.SEVERE, null, ex);
    }
    return rs;
    }
    public ResultSet listAllTable(String nameEntidad){
        ResultSet rs=null;
        System.out.println("EN SE_FP_BDCONTABLE");
        String consulta="SELECT * FROM "+ nameEntidad;
        openConection();
       try{
        rs=conn.createStatement().executeQuery(consulta);
       
       }catch(SQLException ex){
            Logger.getLogger(SE_FP_bdcontable.class.getName()).log(Level.SEVERE, null, ex);
       }
        return rs;
    }
    
    public ResultSet listfcon0025(String mes, String año){
    
        ResultSet rs=null;
        String loca="01";
        String consulta="SELECT * FROM fcon0025 WHERE MONTH(fcontable)="+ mes+" AND YEAR(fcontable)="+año+" AND LEFT(lcta,1)=\"6\" AND zona=\""+10+"\" AND loca=\""+loca+"\" AND !EMPTY(nccos)"; 
      try{
        openConection();
          rs=conn.createStatement().executeQuery(consulta);
          System.out.println("REGRESANDO FCON0025");
       }catch(SQLException ex){
            Logger.getLogger(SE_FP_bdcontable.class.getName()).log(Level.SEVERE, null, ex);
       }
    return rs;
    }
    public ResultSet listAll(String nameEntidad) {
        ResultSet rs = null;
        String consulta = "SELECT ccta,desc  FROM " + nameEntidad;
        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_FP_bdcontable.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet listAllSucAgente(String nameEntidad) {
        ResultSet rs = null;
        String consulta = "SELECT *  FROM " + nameEntidad;
        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
            System.out.println("HIZO BIEN LA CONSULTA");
        } catch (SQLException ex) {
            Logger.getLogger(SE_FP_bdcontable.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet listAllSimpleOrderBy(String nameEntidad, String columnOrder) {
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad + " ORDER BY " + columnOrder;
        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_FP_bdcontable.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet listAllSimpleWhereOrderBy(String nameEntidad, String nameCampoWhere, String value, String nameColumnOrder) {
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad + " WHERE " + nameCampoWhere + " = " + value + " ORDER BY " + nameColumnOrder;
        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_FP_bdcontable.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet listAllComplexWhereOrderBy(String nameEntidad, String[] nameCampoWhere, String[] relacion, String[] values, String nameColumnOrder) {
        ResultSet rs = null;

        String consWhere = "";

        for (int i = 0; i < nameCampoWhere.length; i++) {
            if (i == nameCampoWhere.length - 1) {
                consWhere = consWhere + nameCampoWhere[i] + " " + relacion[i] + " " + values[i];
            } else {
                consWhere = consWhere + nameCampoWhere[i] + " " + relacion[i] + " " + values[i] + " AND ";
            }
        }

        String consulta = "SELECT * FROM " + nameEntidad + " WHERE " + consWhere + " ORDER BY " + nameColumnOrder;
        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_FP_bdcontable.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void callSP(String nameSP, String parametros) {
        try {
            stmt = conn.prepareCall("{call " + nameSP + " " + parametros + "}");
        } catch (SQLException ex) {
            Logger.getLogger(SE_FP_bdcontable.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
     
   public ResultSet queryInnerJoin(String[] nameEntidad, String[] alias, String[] onEqual, String select, 
           String[] nameCampoWhere, String[] relacion, String[] values, String nameColumnOrder) {
        ResultSet rs = null;     
        
        String consJoin = "";
        for (int i = 0; i < nameEntidad.length; i++) {
            if (i == 0) {
                consJoin = nameEntidad[i]+ " " + alias[i];
            } else {
                consJoin = consJoin +" INNER JOIN "+ nameEntidad[i] + " " + alias[i] + " ON " + onEqual[i-1];
            }
        }
        System.out.println("CONST JOIN "+consJoin);
        
        String consWhere = "";
        for (int i = 0; i < nameCampoWhere.length; i++) {
            if (i == nameCampoWhere.length - 1) {
                consWhere = consWhere + nameCampoWhere[i] + " " + relacion[i] + " " + values[i];
            } else {
                consWhere = consWhere + nameCampoWhere[i] + " " + relacion[i] + " " + values[i] + " AND ";
            }
        }
        System.out.println("CONST WHERE "+consWhere);

        String consulta = "SELECT "+select+" FROM " + consJoin + " WHERE " + consWhere + " ORDER BY " + nameColumnOrder;
        
        System.out.println("CONSULTA "+consulta);
        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_FP_bdcontable.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

}
