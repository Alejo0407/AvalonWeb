package servicio_entidad;

import conexion.SQL_Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase Servicio Entidad de BDSISTEMA para SQL SERVER
 * @author AMD
 */
public class SE_SQL_bdnomina extends SQL_Conexion {

    public SE_SQL_bdnomina() {
        System.out.println("BDNOMINA");
        super.SQL_ConexionGeneral("bdnomina");
    }

    public ResultSet listAll(String nameEntidad) {
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad;
        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdnomina.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void callSP(String nameSP, String parametros) {
        try {
            stmt = conn.prepareCall("{call " + nameSP + " " + parametros + "}");
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdnomina.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public ResultSet callSPwithRS(String nameSP, String parametros) {
        ResultSet rs = null;        
        try { openConection();
            stmt = conn.prepareCall("{call " + nameSP + " " + parametros + "}");
            

            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdnomina.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(SE_SQL_bdnomina.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet listAllSimpleWhereOrderBy(String nameEntidad, String nameCampoWhere, String value, String nameColumnOrder) {
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad + " WHERE " + nameCampoWhere + " = " + value + " ORDER BY " + nameColumnOrder + " ASC";
        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdnomina.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet listAllSimpleWhereTipOrderBy(String nameEntidad, String nameCampoWhere, String value, String nameColumnOrder, String tiporder) {
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad + " WHERE " + nameCampoWhere + " = " + value + " ORDER BY " + nameColumnOrder + " " + tiporder;
        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdnomina.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(SE_SQL_bdnomina.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet listAllComplexWhereTipOrderBy(String nameEntidad, String[] nameCampoWhere, String[] relacion, String[] values, String nameColumnOrder,
            String tiporder) {
        ResultSet rs = null;

        String consWhere = "";

        for (int i = 0; i < nameCampoWhere.length; i++) {
            if (i == nameCampoWhere.length - 1) {
                consWhere = consWhere + nameCampoWhere[i] + " " + relacion[i] + " " + values[i];
            } else {
                consWhere = consWhere + nameCampoWhere[i] + " " + relacion[i] + " " + values[i] + " AND ";
            }
        }

        String consulta = "SELECT * FROM " + nameEntidad + " WHERE " + consWhere + " ORDER BY " + nameColumnOrder + " " + tiporder;
        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdnomina.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet queryInnerJoin(String[] nameEntidad, String[] alias, String[] onEqual, String select,
            String[] nameCampoWhere, String[] relacion, String[] values, String nameColumnOrder) {
        ResultSet rs = null;

        String consJoin = "";
        for (int i = 0; i < nameEntidad.length; i++) {
            if (i == 0) {
                consJoin = nameEntidad[i] + " " + alias[i];
            } else {
                consJoin = consJoin + " INNER JOIN " + nameEntidad[i] + " " + alias[i] + " ON " + onEqual[i - 1];
            }
        }

        String consWhere = "";
        for (int i = 0; i < nameCampoWhere.length; i++) {
            if (i == nameCampoWhere.length - 1) {
                consWhere = consWhere + nameCampoWhere[i] + " " + relacion[i] + " " + values[i];
            } else {
                consWhere = consWhere + nameCampoWhere[i] + " " + relacion[i] + " " + values[i] + " AND ";
            }
        }

        String consulta = "SELECT " + select + " FROM " + consJoin + " WHERE " + consWhere + " ORDER BY " + nameColumnOrder;

        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdnomina.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
   public ResultSet listAllSimpleTipOrderBy(String nameEntidad, String columnOrder, String tiporder) {
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad + " ORDER BY " + columnOrder + " " + tiporder;
        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcontabilidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }          
   
   public ResultSet queryDiferent(String consulta) {
        ResultSet rs = null;
       
        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
            System.out.println("CONSULTA EN BDNOMINA:"+consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcontabilidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }          
}
