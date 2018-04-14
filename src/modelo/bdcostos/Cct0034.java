/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 *
 * @author INTEL
 */
public class Cct0034 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 2087265858966110540L;
	private int codemp;
    private String locacion;
    private String fec_proces;
    private double vagpro;
    private String usrcod;
    private String usrdate;
    private String usrtime;

    public Cct0034() {
    }

    public Cct0034(int codemp, String locacion) {
        this.codemp = codemp;
        this.locacion = locacion;
    }

    public Cct0034(int codemp, String locacion, String fec_proces, double vagpro, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.locacion = locacion;
        this.fec_proces = fec_proces;
        this.vagpro = vagpro;
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

    public String getFec_proces() {
        return fec_proces;
    }

    public void setFec_proces(String fec_proces) {
        this.fec_proces = fec_proces;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
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

    public double getVagpro() {
        return vagpro;
    }

    public void setVagpro(double vagpro) {
        this.vagpro = vagpro;
    }
    
}
