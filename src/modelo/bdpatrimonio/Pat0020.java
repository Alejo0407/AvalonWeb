/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdpatrimonio;

/**
 *
 * @author INTEL
 */
public class Pat0020 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 3674114055758373156L;
	private int codemp;
    private String cod_cte;
    private String cod_grp;
    private String des_cte;
    private String val_cte;
    private String edo_cte;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Pat0020() {
    }

    public Pat0020(int codemp, String cod_cte, String cod_grp) {
        this.codemp = codemp;
        this.cod_cte = cod_cte;
        this.cod_grp = cod_grp;
    }

    public Pat0020(int codemp, String cod_cte, String cod_grp, String des_cte, String val_cte, String edo_cte, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.cod_cte = cod_cte;
        this.cod_grp = cod_grp;
        this.des_cte = des_cte;
        this.val_cte = val_cte;
        this.edo_cte = edo_cte;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Pat0020(int codemp, String cod_cte, String cod_grp, String des_cte, String val_cte, String edo_cte, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.cod_cte = cod_cte;
        this.cod_grp = cod_grp;
        this.des_cte = des_cte;
        this.val_cte = val_cte;
        this.edo_cte = edo_cte;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.selected = selected;
    }  
    
    public String getCod_cte() {
        return cod_cte;
    }

    public void setCod_cte(String cod_cte) {
        this.cod_cte = cod_cte;
    }

    public String getCod_grp() {
        return cod_grp;
    }

    public void setCod_grp(String cod_grp) {
        this.cod_grp = cod_grp;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getDes_cte() {
        return des_cte;
    }

    public void setDes_cte(String des_cte) {
        this.des_cte = des_cte;
    }

    public String getEdo_cte() {
        return edo_cte;
    }

    public void setEdo_cte(String edo_cte) {
        this.edo_cte = edo_cte;
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

    public String getVal_cte() {
        return val_cte;
    }

    public void setVal_cte(String val_cte) {
        this.val_cte = val_cte;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    
}
