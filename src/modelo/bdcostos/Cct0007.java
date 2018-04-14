/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 * CATEGORIAS ORGANIZACIONALES ESPECÍFICAS.
 * @autor AMD
 */
public class Cct0007 implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 807090638657323610L;
	private int codemp;
    private String codcoe;
    private String codcog;
    private String descoe;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Cct0007() {
    }

    public Cct0007(int codemp, String codcoe, String codcog) {
        this.codemp = codemp;
        this.codcoe = codcoe;
        this.codcog = codcog;
    }

    public Cct0007(int codemp, String codcoe, String codcog, String descoe, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.codcoe = codcoe;
        this.codcog = codcog;
        this.descoe = descoe;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Cct0007(int codemp, String codcoe, String codcog, String descoe, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.codcoe = codcoe;
        this.codcog = codcog;
        this.descoe = descoe;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.selected = selected;
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

    public String getDescoe() {
        return descoe;
    }

    public void setDescoe(String descoe) {
        this.descoe = descoe;
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
