/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 * CODIGO DE COSTOS RECEPTORES
 * @author INTEL
 */
public class Cct0014 implements java.io.Serializable {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 7092183192803258340L;
	private int codemp;
    private String cod;
    private String cod_desc;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Cct0014() {
    }

    public Cct0014(int codemp, String cod) {
        this.codemp = codemp;
        this.cod = cod;
    }

    public Cct0014(int codemp, String cod, String cod_desc, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.cod = cod;
        this.cod_desc = cod_desc;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Cct0014(int codemp, String cod, String cod_desc, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.cod = cod;
        this.cod_desc = cod_desc;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.selected = selected;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getCod_desc() {
        return cod_desc;
    }

    public void setCod_desc(String cod_desc) {
        this.cod_desc = cod_desc;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
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
