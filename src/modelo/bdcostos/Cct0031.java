/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 *
 * @author INTEL
 */
public class Cct0031 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -1390333258616472984L;
	private int codemp;
    private String cos_suc;
    private String periodo;
    private String sec;
    private String sucursal;
    //private String fec_proces;
    private int ltivo;
    private String ldoc1;
    private String fect;
    private int lorig;
    private String fcta;
    private String elemcost;
    private double impo;
    private String flagdh;
    private String metodo;
    private String tipcosto;
    private String flagkt;
    private int distribuida;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private String ccta;
    private boolean selected;

    public Cct0031() {
    }

    public Cct0031(int codemp, String cos_suc, String periodo, String sec) {
        this.codemp = codemp;
        this.cos_suc = cos_suc;
        this.periodo = periodo;
        this.sec = sec;
    }

    public Cct0031(int codemp, String cos_suc, String periodo, String sec, String sucursal, int ltivo, String ldoc1, String fect, int lorig, String fcta, String elemcost, int impo, String flagdh, String metodo, String tipcosto, String flagkt, int distribuida, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.cos_suc = cos_suc;
        this.periodo = periodo;
        this.sec = sec;
        this.sucursal = sucursal;
        //this.fec_proces = fec_proces;
        this.ltivo = ltivo;
        this.ldoc1 = ldoc1;
        this.fect = fect;
        this.lorig = lorig;
        this.fcta = fcta;
        this.elemcost = elemcost;
        this.impo = impo;
        this.flagdh = flagdh;
        this.metodo = metodo;
        this.tipcosto = tipcosto;
        this.flagkt = flagkt;
        this.distribuida = distribuida;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Cct0031(int codemp, String cos_suc, String periodo, String sec, String sucursal, int ltivo, String ldoc1, String fect, int lorig, String fcta, String elemcost, int impo, String flagdh, String metodo, String tipcosto, String flagkt, int distribuida, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.cos_suc = cos_suc;
        this.periodo = periodo;
        this.sec = sec;
        this.sucursal = sucursal;
        //this.fec_proces = fec_proces;
        this.ltivo = ltivo;
        this.ldoc1 = ldoc1;
        this.fect = fect;
        this.lorig = lorig;
        this.fcta = fcta;
        this.elemcost = elemcost;
        this.impo = impo;
        this.flagdh = flagdh;
        this.metodo = metodo;
        this.tipcosto = tipcosto;
        this.flagkt = flagkt;
        this.distribuida = distribuida;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.selected = selected;
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

    public int getDistribuida() {
        return distribuida;
    }

    public void setDistribuida(int distribuida) {
        this.distribuida = distribuida;
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
//
//    public String getFec_proces() {
//        return fec_proces;
//    }
//
//    public void setFec_proces(String fec_proces) {
//        this.fec_proces = fec_proces;
//    }

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

    public String getFlagkt() {
        return flagkt;
    }

    public void setFlagkt(String flagkt) {
        this.flagkt = flagkt;
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

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
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

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getTipcosto() {
        return tipcosto;
    }

    public void setTipcosto(String tipcosto) {
        this.tipcosto = tipcosto;
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

    /**
     * @return the ccta
     */
    public String getCcta() {
        return ccta;
    }

    /**
     * @param ccta the ccta to set
     */
    public void setCcta(String ccta) {
        this.ccta = ccta;
    }
    
}
