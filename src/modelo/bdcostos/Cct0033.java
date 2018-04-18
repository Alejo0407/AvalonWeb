/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 *
 * @author INTEL
 */
public class Cct0033 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -7100258023141617893L;
	private int codemp;
    private String cos_suc;
    private String periodo;
    private String sec;
    //private String fec_proces;
    private String cctaem;
    private String cctare;
    private double porcdist;
    private double monto;
    private String flagdh;
    private String usrcod;
    private String usrdate;
    private String usrtime;

    public Cct0033() {
    }

    public Cct0033(int codemp, String cos_suc, String periodo, String sec) {
        this.codemp = codemp;
        this.cos_suc = cos_suc;
        this.periodo = periodo;
        this.sec = sec;
    }

    public Cct0033(int codemp, String cos_suc, String periodo, String sec, String cctaem, String cctare, int porcdist, int monto, String flagdh, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.cos_suc = cos_suc;
        this.periodo = periodo;
        this.sec = sec;
        //this.fec_proces = fec_proces;
        this.cctaem = cctaem;
        this.cctare = cctare;
        this.porcdist = porcdist;
        this.monto = monto;
        this.flagdh = flagdh;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public String getCctaem() {
        return cctaem;
    }

    public void setCctaem(String cctaem) {
        this.cctaem = cctaem;
    }

    public String getCctare() {
        return cctare;
    }

    public void setCctare(String cctare) {
        this.cctare = cctare;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getCos_suc() {
        return cos_suc;
    }

    public void setCos_suc(String cos_suc) {
        this.cos_suc = cos_suc;
    }


    public String getFlagdh() {
        return flagdh;
    }

    public void setFlagdh(String flagdh) {
        this.flagdh = flagdh;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getPorcdist() {
        return porcdist;
    }

    public void setPorcdist(double porcdist) {
        this.porcdist = porcdist;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
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
