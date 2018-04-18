/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdsistema;

/**
 * Perfiles por Módulo del AVALON.
 * @author AMD
 */
public class Sys10006 {

    private int codperfil;
    private int codapli;
    private String denperfil;
    private String usrcod;
    private String usrdate;
    private String usrtime;

    public Sys10006() {
    }

    public Sys10006(int codperfil, int codapli, String denperfil, String usrcod, String usrdate, String usrtime) {
        this.codperfil = codperfil;
        this.codapli = codapli;
        this.denperfil = denperfil;
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

    public int getCodperfil() {
        return codperfil;
    }

    public void setCodperfil(int codperfil) {
        this.codperfil = codperfil;
    }

    public String getDenperfil() {
        return denperfil;
    }

    public void setDenperfil(String denperfil) {
        this.denperfil = denperfil;
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
