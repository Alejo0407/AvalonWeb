/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdpatrimonio;

/**
 *
 * @author INTEL
 */
public class Pat0030 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1263623364179398532L;
	private int codemp;
    private String codtra;
    private String rel_tab;
    private String des_tab;
    private int cor_tab;
    private String edo_tab;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Pat0030() {
    }

    public Pat0030(int codemp, String codtra, String rel_tab) {
        this.codemp = codemp;
        this.codtra = codtra;
        this.rel_tab = rel_tab;
    }

    public Pat0030(int codemp, String codtra, String rel_tab, String des_tab, int cor_tab, String edo_tab, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.codtra = codtra;
        this.rel_tab = rel_tab;
        this.des_tab = des_tab;
        this.cor_tab = cor_tab;
        this.edo_tab = edo_tab;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Pat0030(int codemp, String codtra, String rel_tab, String des_tab, int cor_tab, String edo_tab, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.codtra = codtra;
        this.rel_tab = rel_tab;
        this.des_tab = des_tab;
        this.cor_tab = cor_tab;
        this.edo_tab = edo_tab;
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

    public String getCodtra() {
        return codtra;
    }

    public void setCodtra(String codtra) {
        this.codtra = codtra;
    }

    public int getCor_tab() {
        return cor_tab;
    }

    public void setCor_tab(int cor_tab) {
        this.cor_tab = cor_tab;
    }

    public String getDes_tab() {
        return des_tab;
    }

    public void setDes_tab(String des_tab) {
        this.des_tab = des_tab;
    }

    public String getEdo_tab() {
        return edo_tab;
    }

    public void setEdo_tab(String edo_tab) {
        this.edo_tab = edo_tab;
    }

    public String getRel_tab() {
        return rel_tab;
    }

    public void setRel_tab(String rel_tab) {
        this.rel_tab = rel_tab;
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
