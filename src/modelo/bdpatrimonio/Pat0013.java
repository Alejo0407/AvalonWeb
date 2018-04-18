/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdpatrimonio;

/**
 *
 * @author INTEL
 */
public class Pat0013 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 8693543130101649477L;
	private int codemp;
    private int codest;
    private String denest;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Pat0013() {
    }

    public Pat0013(int codemp, int codest) {
        this.codemp = codemp;
        this.codest = codest;
    }

    public Pat0013(int codemp, int codest, String denest, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.codest = codest;
        this.denest = denest;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Pat0013(int codemp, int codest, String denest, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.codest = codest;
        this.denest = denest;
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

    public int getCodest() {
        return codest;
    }

    public void setCodest(int codest) {
        this.codest = codest;
    }

    public String getDenest() {
        return denest;
    }

    public void setDenest(String denest) {
        this.denest = denest;
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
