/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 * CENTROS DE COSTO PRINCIPAL
 * @author INTEL
 */
public class Cct0008 implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 110153373542714685L;
	private int codemp;
    private String codcoe;
    private String codccp;
    private String codcog;
    private String des_tab;
    private String abr_tab;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Cct0008() {
    }

    public Cct0008(int codemp, String codcoe, String codccp, String codcog) {
        this.codemp = codemp;
        this.codcoe = codcoe;
        this.codccp = codccp;
        this.codcog = codcog;
    }

    public Cct0008(int codemp, String codcoe, String codccp, String codcog, String des_tab, String abr_tab, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.codcoe = codcoe;
        this.codccp = codccp;
        this.codcog = codcog;
        this.des_tab = des_tab;
        this.abr_tab = abr_tab;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Cct0008(int codemp, String codcoe, String codccp, String codcog, String des_tab, String abr_tab, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.codcoe = codcoe;
        this.codccp = codccp;
        this.codcog = codcog;
        this.des_tab = des_tab;
        this.abr_tab = abr_tab;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.selected = selected;
    }

    public String getAbr_tab() {
        return abr_tab;
    }

    public void setAbr_tab(String abr_tab) {
        this.abr_tab = abr_tab;
    }

    public String getCodccp() {
        return codccp;
    }

    public void setCodccp(String codccp) {
        this.codccp = codccp;
    }

    public String getCodcoe() {
        return codcoe;
    }

    public void setCodcoe(String codcoe) {
        this.codcoe = codcoe;
    }

    public String getCodcog() {
        return codcog;
    }

    public void setCodcog(String codcog) {
        this.codcog = codcog;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getDes_tab() {
        return des_tab;
    }

    public void setDes_tab(String des_tab) {
        this.des_tab = des_tab;
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
