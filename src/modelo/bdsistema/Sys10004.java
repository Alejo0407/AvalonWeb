/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdsistema;

/**
 * Usuarios por Módulo del AVALON dentro de la Empresa
 * @author AMD
 */
public class Sys10004 {

    private int codemp;
    private int codapli;
    private String codusr;
    private int defecto;
    private String usrcod;
    private String usrdate;
    private String usrtime;

    public Sys10004() {
    }

    public Sys10004(int codemp, int codapli, String codusr, int defecto, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.codapli = codapli;
        this.codusr = codusr;
        this.defecto = defecto;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public int getCodapli() {
        return codapli;
    }

    public void setCodapli(int codapli) {
        this.codapli = codapli;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getCodusr() {
        return codusr;
    }

    public void setCodusr(String codusr) {
        this.codusr = codusr;
    }

    public int getDefecto() {
        return defecto;
    }

    public void setDefecto(int defecto) {
        this.defecto = defecto;
    }

    public String getUsrcod() {
        return usrcod;
    }

    public void setUsrcod(String usrcod) {
        this.usrcod = usrcod;
    }

    public String getUsrdate() {
        return usrdate;
    }

    public void setUsrdate(String usrdate) {
        this.usrdate = usrdate;
    }

    public String getUsrtime() {
        return usrtime;
    }

    public void setUsrtime(String usrtime) {
        this.usrtime = usrtime;
    }
}
