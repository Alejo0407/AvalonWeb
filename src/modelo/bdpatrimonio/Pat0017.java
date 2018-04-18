/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdpatrimonio;

/**
 *
 * @author INTEL
 */
public class Pat0017 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 7284886496020439594L;
	private int codemp;
    private String codtra;
    private String dentra;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Pat0017() {
    }

    public Pat0017(int codemp, String codtra) {
        this.codemp = codemp;
        this.codtra = codtra;
    }

    public Pat0017(int codemp, String codtra, String dentra, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.codtra = codtra;
        this.dentra = dentra;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Pat0017(int codemp, String codtra, String dentra, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.codtra = codtra;
        this.dentra = dentra;
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

    public String getDentra() {
        return dentra;
    }

    public void setDentra(String dentra) {
        this.dentra = dentra;
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
