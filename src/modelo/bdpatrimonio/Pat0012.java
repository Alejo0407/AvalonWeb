/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdpatrimonio;

/**
 *
 * @author INTEL
 */
public class Pat0012 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -4393567748170453174L;
	private int codemp;
    private int codcla;
    private String descla;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Pat0012() {
    }

    public Pat0012(int codemp, int codcla) {
        this.codemp = codemp;
        this.codcla = codcla;
    }

    public Pat0012(int codemp, int codcla, String descla, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.codcla = codcla;
        this.descla = descla;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Pat0012(int codemp, int codcla, String descla, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.codcla = codcla;
        this.descla = descla;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.selected = selected;
    }

    public int getCodcla() {
        return codcla;
    }

    public void setCodcla(int codcla) {
        this.codcla = codcla;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getDescla() {
        return descla;
    }

    public void setDescla(String descla) {
        this.descla = descla;
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
