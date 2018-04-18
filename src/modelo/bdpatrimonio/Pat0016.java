/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdpatrimonio;

/**
 *
 * @author INTEL
 */
public class Pat0016 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 6064184138247644086L;
	private int codemp;
    private int codmod;
    private String desmod;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Pat0016() {
    }

    public Pat0016(int codemp, int codmod) {
        this.codemp = codemp;
        this.codmod = codmod;
    }

    public Pat0016(int codemp, int codmod, String desmod, String usrdate) {
        this.codemp = codemp;
        this.codmod = codmod;
        this.desmod = desmod;
        this.usrdate = usrdate;
    }

    public Pat0016(int codemp, int codmod, String desmod, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.codmod = codmod;
        this.desmod = desmod;
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

    public int getCodmod() {
        return codmod;
    }

    public void setCodmod(int codmod) {
        this.codmod = codmod;
    }

    public String getDesmod() {
        return desmod;
    }

    public void setDesmod(String desmod) {
        this.desmod = desmod;
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
