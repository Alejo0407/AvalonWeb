/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdpatrimonio;

/**
 *
 * @author INTEL
 */
public class Pat0031 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -2266774635818136405L;
	private int codemp;
    private String cod_lge;
    private String des_lge;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Pat0031() {
    }

    public Pat0031(int codemp, String cod_lge) {
        this.codemp = codemp;
        this.cod_lge = cod_lge;
    }

    public Pat0031(int codemp, String cod_lge, String des_lge, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.cod_lge = cod_lge;
        this.des_lge = des_lge;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Pat0031(int codemp, String cod_lge, String des_lge, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.cod_lge = cod_lge;
        this.des_lge = des_lge;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.selected = selected;
    }

    public String getCod_lge() {
        return cod_lge;
    }

    public void setCod_lge(String cod_lge) {
        this.cod_lge = cod_lge;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getDes_lge() {
        return des_lge;
    }

    public void setDes_lge(String des_lge) {
        this.des_lge = des_lge;
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
