/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 * LOCACIONES
 * @author INTEL
 */
public class Cct0012 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -6448082204734647236L;
	private int codemp;
    private String locacion;
    private String cos_suc;
    private String des_geo;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Cct0012() {
    }

    public Cct0012(int codemp, String locacion, String cos_suc) {
        this.codemp = codemp;
        this.locacion = locacion;
        this.cos_suc = cos_suc;
    }

    public Cct0012(int codemp, String locacion, String cos_suc, String des_geo, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.locacion = locacion;
        this.cos_suc = cos_suc;
        this.des_geo = des_geo;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }
    
    public Cct0012(int codemp, String locacion, String cos_suc, String des_geo, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.locacion = locacion;
        this.cos_suc = cos_suc;
        this.des_geo = des_geo;
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

    public String getDes_geo() {
        return des_geo;
    }

    public void setDes_geo(String des_geo) {
        this.des_geo = des_geo;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
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
