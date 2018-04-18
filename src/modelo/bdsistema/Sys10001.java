/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdsistema;

/**
 * Empresas.
 * @author AMD
 */
public class Sys10001 implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3826136116930578257L;
	private int codemp;
    private String denemp;
    private String nrolicencia;
    private String usrcod;
    private String usrdate;
    private String usrtime;

    public Sys10001() {
    }

    public Sys10001(int codemp, String denemp, String nrolicencia, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.denemp = denemp;
        this.nrolicencia = nrolicencia;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getDenemp() {
        return denemp;
    }

    public void setDenemp(String denemp) {
        this.denemp = denemp;
    }

    public String getNrolicencia() {
        return nrolicencia;
    }

    public void setNrolicencia(String nrolicencia) {
        this.nrolicencia = nrolicencia;
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
