/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdsistema;

/**
 * Perfil del usuario en el módulo del AVALON.
 * @author AMD  
 */
public class Sys10009 {

    private int codemp;
    private int codapli;
    private int codperfil;
    private String codusr;
    private String usrcod;
    private String usrdate;
    private String usrtime;

    public Sys10009() {
    }

    public Sys10009(int codemp, int codapli, int codperfil, String codusr, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.codapli = codapli;
        this.codperfil = codperfil;
        this.codusr = codusr;
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

    public int getCodperfil() {
        return codperfil;
    }

    public void setCodperfil(int codperfil) {
        this.codperfil = codperfil;
    }

    public String getCodusr() {
        return codusr;
    }

    public void setCodusr(String codusr) {
        this.codusr = codusr;
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
