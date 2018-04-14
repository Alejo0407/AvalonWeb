/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdpatrimonio;

/**
 *
 * @author INTEL
 */
public class Pat0014 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = -2440885087230739620L;
	private int codemp;
    private int codser;
    private String desser;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Pat0014() {
    }

    public Pat0014(int codemp, int codser) {
        this.codemp = codemp;
        this.codser = codser;
    }

    public Pat0014(int codemp, int codser, String desser, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.codser = codser;
        this.desser = desser;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Pat0014(int codemp, int codser, String desser, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.codser = codser;
        this.desser = desser;
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

    public int getCodser() {
        return codser;
    }

    public void setCodser(int codser) {
        this.codser = codser;
    }

    public String getDesser() {
        return desser;
    }

    public void setDesser(String desser) {
        this.desser = desser;
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
