/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 * CATEGORIAS ORGANIZACIONALES GENERICAS.
 * @autor AMD
 */
public class Cct0006 implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 659942641699606545L;
	private int codemp;
    private String codcog;
    private String descog;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Cct0006() {
    }

    public Cct0006(int codemp, String codcog) {
        this.codemp = codemp;
        this.codcog = codcog;
    }

    public Cct0006(int codemp, String codcog, String descog, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.codcog = codcog;
        this.descog = descog;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Cct0006(int codemp, String codcog, String descog, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.codcog = codcog;
        this.descog = descog;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.selected = selected;
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

    public String getDescog() {
        return descog;
    }

    public void setDescog(String descog) {
        this.descog = descog;
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
