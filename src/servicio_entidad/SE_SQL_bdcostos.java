package servicio_entidad;

import conexion.SQL_Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase Servicio Entidad de BDSISTEMA para SQL SERVER
 *
 * @author AMD
 */
public class SE_SQL_bdcostos extends SQL_Conexion {

    public SE_SQL_bdcostos() {
        System.out.println("BDCOSTOS");
        super.SQL_ConexionGeneral("bdcostosiqui");
    }

    
    public ResultSet buscacct0021(String campo1, String campo2, String campo3, String campo4,int codemp,String ano,String sucursal,String ccta){
	    ResultSet rs=null;
	    String Consulta="SELECT * FROM cct0021 WHERE "+campo1+" ='"+codemp+"' AND "+campo2+" ='"+ano+"' AND "+campo3+" ='"+sucursal+"' AND " +campo4+" ='"+ccta+"'" ;
	    try{
		    openConection();
		    rs=conn.createStatement().executeQuery(Consulta);
		        
	    }catch(SQLException ex){
	        
	        Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE,null,ex);
	    
	    }
	    
	    System.out.println("Retornando ResultSet cct0021");
	    return rs;
    }
    public ResultSet listallcct0012sucursal(int codemp, String cos_suc){
	    ResultSet rs=null;
	    String consulta="SELECT * FROM cct0012 where cos_suc= '"+cos_suc+"'" ;
	    try{
		    openConection();
		    rs=conn.createStatement().executeQuery(consulta);
		}catch(SQLException ex){
	       
	    Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null,ex);
	    }
	    
	    return rs;    
    }
    public boolean actualizacct0010(int codemp, String fecha,String locacion,String codserap ){
    //ResultSet rs=null;
        boolean v=false;
        int rows=0;
	    String Consulta="UPDATE cct0010 SET md1_fac=0,md2_fac=0,md3_fac=0,vax_fac=0"+ " WHERE codemp='"+codemp+"' AND per_fac='"+fecha+"' AND locacion='"+locacion+"' AND kav_fac='"+codserap+"'";
		try{
		    openConection();
		    rows=conn.createStatement().executeUpdate(Consulta);
	    }catch(SQLException ex){
	        Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE,null,ex);
	    }
	    if (rows>0) {
	    	v=true;
	    }
	    
	    return v;
    }
    
   public boolean actualizacct0010fact(String md,int codemp, String fecha,String locacion,String codserap,double factor ){
    //ResultSet rs=null;
        boolean v=false;
        int rows=0;
    String Consulta="UPDATE cct0010 SET "+md+"='"+factor+"' WHERE codemp='"+codemp+"' AND per_fac='"+fecha+"' AND locacion='"+locacion+"' AND kav_fac='"+codserap+"'";
    try{
    openConection();
    rows=conn.createStatement().executeUpdate(Consulta);
    }catch(SQLException ex){
        Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE,null,ex);
    }
        if (rows>0) {
            v=true;
        }
    
    return v;
    }
    
    public ResultSet buscacct0010(String campo1, String campo2, String campo3,String campo4,int codemp,String cos_fecpro,String locacion,String codserap){
    ResultSet rs=null;
    String Consulta="SELECT * FROM cct0010 WHERE "+campo1+" ='"+codemp+"' AND "+campo2+" ='"+cos_fecpro+"' AND "+campo3+" ='"+locacion+"' AND "+campo4+" ='"+codserap+"'";
    try{
    openConection();
    rs=conn.createStatement().executeQuery(Consulta);
    }catch(SQLException ex){
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE,null,ex);
    }
    return rs;
    }
    
    public ResultSet buscacct0015(String campo1, String campo2, String campo3,String campo4,int codemp,String cos_fecpro,String metodo,String ccta){
    ResultSet rs=null;
    String Consulta="SELECT * FROM cct0015 WHERE "+campo1+" ='"+codemp+"' AND "+campo2+" ='"+cos_fecpro+"' AND "+campo3+" ='"+metodo+"' AND cctaemp='"+ccta+"'";
    try{
    openConection();
    rs=conn.createStatement().executeQuery(Consulta);
    }catch(SQLException ex){
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE,null,ex);
    }
    return rs;
    }
    
    
    
    
    
    public ResultSet buscacct0034(String campo1, String campo2, String campo3,int codemp,String locacion,String fec_proces){
    ResultSet rs=null;
    String Consulta="SELECT * FROM cct0034 WHERE "+campo1+" ='"+codemp+"' AND "+campo2+" ='"+locacion+"' AND "+campo3+" ='"+fec_proces+"'" ;
    try{
    openConection();
    rs=conn.createStatement().executeQuery(Consulta);
    }catch(SQLException ex){
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE,null,ex);
    }
    return rs;
    }
    
    
    
    public boolean actualizacct0021(String campoac,String campo1, String campo2, String campo3, String campo4,int codemp,String ano,String sucursal,String ccta,double camposac1){
    boolean v=false;
    int rows=0;    
    String Consulta="UPDATE cct0021 SET "+ campoac+"='"+camposac1+"'  WHERE "+campo1+" ='"+codemp+"' AND "+campo2+" ='"+ano+"' AND "+campo3+" ='"+sucursal+"' AND " +campo4+" ='"+ccta+"'" ;
        System.out.println("-------CONSULTA CCT0021------>"+Consulta);
    try{
    openConection();
    rows=conn.createStatement().executeUpdate(Consulta);
    }catch(SQLException ex){
        
        Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE,null,ex);
    
    }
        if (rows>0) {
           v=true;
        }
    return v;
    
    }
    
    public ResultSet buscacct0022(String campocodemp, int codemp,String campo1,String campo2,String registro1, String registro2){
    ResultSet rs=null;
    String consulta="SELECT * FROM cct0022 WHERE " +campocodemp+"='"+codemp+"' AND "+campo1+" ='"+registro1+"' AND "+campo2+ " =' "+registro2+"'";
    try {
            openConection();
            rs = conn.createStatement().executeQuery(consulta);
            
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return rs;
    }
    public boolean actualizacct0022(String campoac,String campo1, String campo2, String campo3,int codemp,String ano,String locacion,double camposac1){
    boolean v=false;
    int ok=0;
    String consulta="UPDATE cct0022 SET "+ campoac+"='"+camposac1+"'  WHERE "+campo1+" ='"+codemp+"' AND "+campo2+" ='"+ano+"' AND "+campo3+" ='"+locacion ;
    
    try {
           openConection();
           ok = conn.createStatement().executeUpdate(consulta);
            
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (ok>0) {
            v=true;
        }
    return v;
    }
     public boolean actualizacct00221(String ncampoac1,String ncampoac2, String ncampoac3,String ncampoac4,String ncampoac5,String ncampoac6,double campoac1,double campoac2, double campoac3,double campoac4,double campoac5,double campoac6, int codemp,String ano,String locacion){
    boolean v=false;
    int ok=0;
    String consulta="UPDATE cct0022 SET "+ ncampoac1+"='"+campoac1+"', "+ ncampoac2+"='"+campoac2+"', "+ncampoac3+"='"+campoac3+"', "+ncampoac4+"='"+campoac4+"', "+ncampoac5+"='"+campoac5+"', "+ncampoac6+"='"+campoac6+"' WHERE codemp='"+codemp+"' AND ano='"+ano+"' AND locacion='"+ locacion +"'" ;
    try {
           openConection();
           ok = conn.createStatement().executeUpdate(consulta);
            
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (ok>0) {
            v=true;
        }
    return v;
    }
    
    
    
    public boolean updatecct0021(String campo, String c) {
        boolean v=false;
        int rc = 0;
        
        String consulta = "UPDATE cct0021 SET " + campo + "='" + c + "'";

        try {
            openConection();
            rc = conn.createStatement().executeUpdate(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rc>0) {
            v=true;
        }
        return v;
    }

    public boolean deletetable(String nameEntidad,String periodo,String cos_suc) {
        boolean v=false;
        int rows=0;
        String consulta = "DELETE " + nameEntidad +" WHERE cos_suc='"+cos_suc+"' and periodo='"+periodo+"'" ;

        try {
            openConection();
            rows=conn.createStatement().executeUpdate(consulta);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rows>=0) {
            v=true;
        }
        return v;
    }
    public boolean deletetablecct0009(String nameEntidad,String periodo,String cos_suc) {
        boolean v=false;
        int rows=0;
        String consulta = "DELETE " + nameEntidad +" WHERE sucursal='"+cos_suc+"' and periodo='"+periodo+"'" ;

        try {
            openConection();
            rows=conn.createStatement().executeUpdate(consulta);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (rows>=0) {
            v=true;
        }
        return v;
    }

    public ResultSet buscalocacion(String nameEntidad, String clave, String valor) {
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad + " WHERE " + clave + "='" + valor + "'";
        try {
            openConection();
            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }

    public ResultSet busca(String nameEntidad, String clave, String valor) {
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad + " WHERE " + clave + "='" + valor + "'";
        try {
            openConection();
            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet buscaactivo(String nameEntidad, String clave, String valor) {
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad + " WHERE " + clave + "='" + valor + "'" + " AND estado='A'";

        try {
            openConection();
            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet buscareceptor(String nameEntidad, String clave, String valor) {
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad + " WHERE " + clave + "='" + valor + "'" + " AND tipcosto<>'R'";

        try {
            openConection();
            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet listAllcct0006(String nameEntidad){
        
        ResultSet rs = null;
        String consulta = "SELECT codcog,descog FROM " + nameEntidad;
        
        try {
            openConection();
            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
     public ResultSet listAllcct0002empresa(String nameEntidad){
        
        ResultSet rs = null;
        String consulta = "SELECT pempres FROM " + nameEntidad;
        
        try {
            openConection();
            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
     public ResultSet listAllcct0030(int codemp,String fecha,String sucursal, String locacion, String codseral, String codserap){
     ResultSet rs = null;
     String consulta="SELECT * FROM CCT0030 WHERE codemp='"+codemp+"' AND cod_suc='"+sucursal+"' AND periodo='"+fecha+"' AND SUBSTRING(ccta,2, 2)='"+locacion+"' AND SUBSTRING(ccta,4, 1)='"+codseral+"' OR SUBSTRING(ccta,4, 1)='"+codseral+"'";
     try {
            openConection();
            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
     
     
     
     }
     public ResultSet listcct0030(int codemp,String fecha,String sucursal ){
     ResultSet rs = null;
     String consulta="SELECT * FROM CCT0030 WHERE codemp='"+codemp+"' AND cod_suc='"+sucursal+"' AND periodo='"+fecha+"'" ;
     try {
            openConection();
            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
     
     
     
     }
     
     
     
     public ResultSet sumaimpocct0030(int codemp, String sucursal, double numero,String fec_proces, String codserap, String codseral){
        ResultSet rs=null;
        String consulta="SELECT SUM("+numero+") FROM CCT0030 WHERE codemp='"+codemp+"' AND cos_suc='"+sucursal+"' AND periodo='"+fec_proces+"' AND SUBSTRING(ccta,4,1)='"+codserap+"' OR SUBSTRING(ccta,4,1)='"+codseral+"'";
        try {
            openConection();
            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
     }
    public ResultSet listAll(String nameEntidad) {
        
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad;

        try {
            
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
            
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    public ResultSet listAllcct0020(String nameEntidad, String periodo, String cos_suc) {
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad + " WHERE periodo ='" + periodo + "' AND cos_suc='"+cos_suc+"'";

        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet buscarcct0034(String nameEntidad, int codemp,String fecha, String sucursal) {
    
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad + " WHERE codemp='"+codemp+"' AND fec_proces ='" + fecha + "' AND sucursal= '"+sucursal+"'";
        try {
            openConection();
            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    public ResultSet buscarcct0035(String nameEntidad, int codemp,String fecha, String sucursal) {
    
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad + " WHERE codemp='"+codemp+"' AND periodo ='" + fecha + "' AND sucursal= '"+sucursal+"'";
        try {
            openConection();
            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    
    
    
    
    public ResultSet listAllcct0034(String nameEntidad, String loca) {
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad + " WHERE locacion ='" + loca + "'";

        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet listAllcct0035(String nameEntidad, String loca) {
        ResultSet rs = null;
        String consulta = "SELECT * FROM " + nameEntidad + " WHERE locacion ='" + loca + "'";

        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public void callSP(String nameSP, String parametros) {
        try {
            stmt = conn.prepareCall("{call " + nameSP + " " + parametros + "}");
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet callSPwithRS(String nameSP, String parametros) {
        ResultSet rs = null;
        try {
            openConection();
            System.out.println("----------------------->" + nameSP + "---->" + parametros);
            stmt = conn.prepareCall("{call " + nameSP + " " + parametros + "}");


            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
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
        System.out.println("Consulta :D !------------------>" + consulta);
        try {
            openConection();

            rs = conn.createStatement().executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(SE_SQL_bdcostos.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (SQLException ex) {
            Logger.getLogger(SE_SQL_bdcontabilidad.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
