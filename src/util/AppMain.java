/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author PC
 */
public class AppMain {
    private static String perido;
    private static int nquiebres;
    private static String sucursal;
    private static String codsucursal;
    private static String codaguapotable;
    private static String codalcantarillado;
    private static String codconexos;
    
    public AppMain(){
        }
    /**
     * @return the codaguapotable
     */
    public String getCodaguapotable() {
        return codaguapotable;
    }

    /**
     * @param aCodaguapotable the codaguapotable to set
     */
    public void setCodaguapotable(String aCodaguapotable) {
        codaguapotable = aCodaguapotable;
    }

    /**
     * @return the codalcantarillado
     */
    public String getCodalcantarillado() {
        return codalcantarillado;
    }

    /**
     * @param aCodalcantarillado the codalcantarillado to set
     */
    public void setCodalcantarillado(String aCodalcantarillado) {
        codalcantarillado = aCodalcantarillado;
    }

    /**
     * @return the codconexos
     */
    public String getCodconexos() {
        return codconexos;
    }

    /**
     * @param aCodconexos the codconexos to set
     */
    public void setCodconexos(String aCodconexos) {
        codconexos = aCodconexos;
    }
    

    /**
     * @return the sucursal
     */
    public String getSucursal() {
        return sucursal;
    }

    /**
     * @param aSucursal the sucursal to set
     */
    public void setSucursal(String aSucursal) {
        sucursal = aSucursal;
    }

    /**
     * @return the perido
     */
    public String getPerido() {
        return perido;
    }

    /**
     * @param perido the perido to set
     */
    public void setPerido(String perido) {
        System.out.println("Bien seteadoPerido"+perido);
        AppMain.perido = perido;
    }

    /**
     * @return the nquiebres
     */
    public int getNquiebres() {
        return nquiebres;
    }

    /**
     * @param nquiebres the nquiebres to set
     */
    public void setNquiebres(int nquiebres) {
        System.out.println("Bien seteado Nro Quiebres"+nquiebres);
        AppMain.nquiebres = nquiebres;
    }

    /**
     * @return the codsucursal
     */
    public String getCodsucursal() {
        return codsucursal;
    }

    /**
     * @param codsucursal the codsucursal to set
     */
    public void setCodsucursal(String codsucursal) {
        AppMain.codsucursal = codsucursal;
    }
}
