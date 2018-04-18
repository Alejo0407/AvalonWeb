/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdsistema;

/**
 * Log de movimientos realizados en el sistema AVALON.
 * @author AMD
 */
public class Sys10008 {
    
    private String idtransac;
    private int codemp;
    private int codapli;
    private String codusr;
    private int codtransac;
    private String destransac;
    private int opctransac;
    private int nivel;
    private String usrcod;
    private String usrdate;
    private String usrtime;

    public Sys10008() {
    }

    public Sys10008(String idtransac, int codemp, int codapli, String codusr, int codtransac, String destransac, int opctransac, int nivel, String usrcod, String usrdate, String usrtime) {
        this.idtransac = idtransac;
        this.codemp = codemp;
        this.codapli = codapli;
        this.codusr = codusr;
        this.codtransac = codtransac;
        this.destransac = destransac;
        this.opctransac = opctransac;
        this.nivel = nivel;
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

    public int getCodtransac() {
        return codtransac;
    }

    public void setCodtransac(int codtransac) {
        this.codtransac = codtransac;
    }

    public String getCodusr() {
        return codusr;
    }

    public void setCodusr(String codusr) {
        this.codusr = codusr;
    }

    public String getDestransac() {
        return destransac;
    }

    public void setDestransac(String destransac) {
        this.destransac = destransac;
    }

    public String getIdtransac() {
        return idtransac;
    }

    public void setIdtransac(String idtransac) {
        this.idtransac = idtransac;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getOpctransac() {
        return opctransac;
    }

    public void setOpctransac(int opctransac) {
        this.opctransac = opctransac;
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
