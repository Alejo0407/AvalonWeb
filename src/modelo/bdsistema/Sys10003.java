/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdsistema;

/**
 * Módulos por Empresa 
 * @author AMD
 */
public class Sys10003 {

    private int codemp;
    private int codapli;
    private String usrcod;
    private String usrdate;
    private String usrtime;

    public Sys10003() {
    }

    public Sys10003(int codemp, int codapli, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.codapli = codapli;
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
