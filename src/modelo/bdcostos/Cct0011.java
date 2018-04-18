/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 * METODOS DE DISTRIBUCION DE COSTOS.
 * @autor AMD
 */
public class Cct0011 implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6465105373207493020L;
	private int codemp;
    private String codmet;
    private String desmet;
    private String edomet;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Cct0011() {
    }

    public Cct0011(int codemp, String codmet, String desmet, String edomet, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.codmet = codmet;
        this.desmet = desmet;
        this.edomet = edomet;
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

    public String getCodmet() {
        return codmet;
    }

    public void setCodmet(String codmet) {
        this.codmet = codmet;
    }

    public String getDesmet() {
        return desmet;
    }

    public void setDesmet(String desmet) {
        this.desmet = desmet;
    }

    public String getEdomet() {
        return edomet;
    }

    public void setEdomet(String edomet) {
        this.edomet = edomet;
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
