/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdsistema;

/**
 * Módulos del AVALON.
 * @author AMD
 */
public class Sys10002 {

    private int codapli;
    private String denapli;
    private String usrcod;
    private String usrdate;
    private String usrtime;

    public Sys10002() {
    }

    public Sys10002(int codapli, String denapli, String usrcod, String usrdate, String usrtime) {
        this.codapli = codapli;
        this.denapli = denapli;
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

    public String getDenapli() {
        return denapli;
    }

    public void setDenapli(String denapli) {
        this.denapli = denapli;
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
