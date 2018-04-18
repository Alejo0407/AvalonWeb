/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 *
 * @author INTEL
 */
public class Cct0020 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 7578528225806504569L;
	private int codemp;
    private String cos_suc;
    private String periodo;
    //private String fec_proces;
    private String sec;
    private int ltivo;
    private String ldoc1;
    private String fect;
    private int lorig;
    private String ccta;
    private String fcta;
    private String elemcost;
    private double impo;
    private String flagdh;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Cct0020() {
    }

    public Cct0020(int codemp, String cos_suc, String periodo, String sec) {
        this.codemp = codemp;
        this.cos_suc = cos_suc;
        this.periodo = periodo;
        this.sec = sec;
    }

    public Cct0020(int codemp, String cos_suc, String periodo, String sec, int ltivo, String ldoc1, String fect, int lorig, String ccta, String fcta, String elemcost, double impo, String flagdh, String usrcod, String usrdate, String usrtime) {
        
        this.codemp = codemp;
        this.cos_suc = cos_suc;
        this.periodo = periodo;
        this.sec = sec;
        this.ltivo = ltivo;
        this.ldoc1 = ldoc1;
        this.fect = fect;
        this.lorig = lorig;
        this.ccta = ccta;
        this.fcta = fcta;
        this.elemcost = elemcost;
        this.impo = impo;
        this.flagdh = flagdh;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Cct0020(int codemp, String cos_suc, String periodo, String sec, int ltivo, String ldoc1, String fect, int lorig, String ccta, String fcta, String elemcost, int impo, String flagdh, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.cos_suc = cos_suc;
        this.periodo = periodo;
        this.sec = sec;

        this.ltivo = ltivo;
        this.ldoc1 = ldoc1;
        this.fect = fect;
        this.lorig = lorig;
        this.ccta = ccta;
        this.fcta = fcta;
        this.elemcost = elemcost;
        this.impo = impo;
        this.flagdh = flagdh;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.selected = selected;
    }

    public String getCcta() {
        return ccta;
    }

    public void setCcta(String ccta) {
        this.ccta = ccta;
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

    public String getElemcost() {
        return elemcost;
    }

    public void setElemcost(String elemcost) {
        this.elemcost = elemcost;
    }

    public String getFcta() {
        return fcta;
    }

    public void setFcta(String fcta) {
        this.fcta = fcta;
    }


    public String getFect() {
        return fect;
    }

    public void setFect(String fect) {
        this.fect = fect;
    }

    public String getFlagdh() {
        return flagdh;
    }

    public void setFlagdh(String flagdh) {
        this.flagdh = flagdh;
    }

    public double getImpo() {
        return impo;
    }

    public void setImpo(double impo) {
        this.impo = impo;
    }

    public String getLdoc1() {
        return ldoc1;
    }

    public void setLdoc1(String ldoc1) {
        this.ldoc1 = ldoc1;
    }

    public int getLorig() {
        return lorig;
    }

    public void setLorig(int lorig) {
        this.lorig = lorig;
    }

    public int getLtivo() {
        return ltivo;
    }

    public void setLtivo(int ltivo) {
        this.ltivo = ltivo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
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
