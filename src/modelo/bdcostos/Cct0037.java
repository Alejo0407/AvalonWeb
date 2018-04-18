/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 * TIPO DE COSTOS SUNAT.
 * @autor AMD
 */
public class Cct0037 implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1758245027939244927L;
	private int codemp;
    private String codsunat;
    private String dessunat;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Cct0037() {
    }

    public Cct0037(int codemp, String codsunat) {
        this.codemp = codemp;
        this.codsunat = codsunat;
    }

    public Cct0037(int codemp, String codsunat, String dessunat, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.codsunat = codsunat;
        this.dessunat = dessunat;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Cct0037(int codemp, String codsunat, String dessunat, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.codsunat = codsunat;
        this.dessunat = dessunat;
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

    public String getCodsunat() {
        return codsunat;
    }

    public void setCodsunat(String codsunat) {
        this.codsunat = codsunat;
    }

    public String getDessunat() {
        return dessunat;
    }

    public void setDessunat(String dessunat) {
        this.dessunat = dessunat;
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
