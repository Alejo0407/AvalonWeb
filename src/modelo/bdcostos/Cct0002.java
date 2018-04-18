/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 *
 * @author INTEL
 */
public class Cct0002 implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5897379580687977666L;
	private int codemp;
    private String area;
    private String respon;
    private String pempres;
    private String codserap;
    private String codseral;
    private String codsercx;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Cct0002() {
    }

    public Cct0002(int codemp) {
        this.codemp = codemp;
    }

    public Cct0002(int codemp, String area, String respon, String pempres, String codserap, String codseral, String codsercx, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.area = area;
        this.respon = respon;
        this.pempres = pempres;
        this.codserap = codserap;
        this.codseral = codseral;
        this.codsercx = codsercx;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Cct0002(int codemp, String area, String respon, String pempres, String codserap, String codseral, String codsercx, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.area = area;
        this.respon = respon;
        this.pempres = pempres;
        this.codserap = codserap;
        this.codseral = codseral;
        this.codsercx = codsercx;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.selected = selected;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getCodseral() {
        return codseral;
    }

    public void setCodseral(String codseral) {
        this.codseral = codseral;
    }

    public String getCodserap() {
        return codserap;
    }

    public void setCodserap(String codserap) {
        this.codserap = codserap;
    }

    public String getCodsercx() {
        return codsercx;
    }

    public void setCodsercx(String codsercx) {
        this.codsercx = codsercx;
    }

    public String getPempres() {
        return pempres;
    }

    public void setPempres(String pempres) {
        this.pempres = pempres;
    }

    public String getRespon() {
        return respon;
    }

    public void setRespon(String respon) {
        this.respon = respon;
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
