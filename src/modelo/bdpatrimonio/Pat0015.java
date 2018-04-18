/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdpatrimonio;

/**
 *
 * @author INTEL
 */
public class Pat0015 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 9201203951921879138L;
	private int codemp;
    private String cod_sgr;
    private String cod_grp;
    private String des_sgr;
    private String cod_tipo;
    private String cod_clase;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;
    
    public Pat0015() {
    }
    
    public Pat0015(int codemp, String cod_sgr, String cod_grp) {
        this.codemp = codemp;
        this.cod_sgr = cod_sgr;
        this.cod_grp = cod_grp;
    }

    public Pat0015(int codemp, String cod_sgr, String cod_grp, String des_sgr, String cod_tipo, String cod_clase, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.cod_sgr = cod_sgr;
        this.cod_grp = cod_grp;
        this.des_sgr = des_sgr;
        this.cod_tipo = cod_tipo;
        this.cod_clase = cod_clase;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Pat0015(int codemp, String cod_sgr, String cod_grp, String des_sgr, String cod_tipo, String cod_clase, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.cod_sgr = cod_sgr;
        this.cod_grp = cod_grp;
        this.des_sgr = des_sgr;
        this.cod_tipo = cod_tipo;
        this.cod_clase = cod_clase;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.selected = selected;
    } 
    
    public String getCod_clase() {
        return cod_clase;
    }

    public void setCod_clase(String cod_clase) {
        this.cod_clase = cod_clase;
    }

    public String getCod_grp() {
        return cod_grp;
    }

    public void setCod_grp(String cod_grp) {
        this.cod_grp = cod_grp;
    }

    public String getCod_sgr() {
        return cod_sgr;
    }

    public void setCod_sgr(String cod_sgr) {
        this.cod_sgr = cod_sgr;
    }

    public String getCod_tipo() {
        return cod_tipo;
    }

    public void setCod_tipo(String cod_tipo) {
        this.cod_tipo = cod_tipo;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getDes_sgr() {
        return des_sgr;
    }

    public void setDes_sgr(String des_sgr) {
        this.des_sgr = des_sgr;
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

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
      
}
