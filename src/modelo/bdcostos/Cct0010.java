/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 *
 * @author INTEL
 */
public class Cct0010 {
    
    private int codemp;
    private String locacion;
    private String kav_fac;
    private String kav_den;
    private int md1_fac;
    private int md2_fac;
    private int md3_fac;
    private int vax_fac;
    private int vay_fac;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private String sucursal;
    private String per_fac;
    private String ctu_nom;
    private boolean selected;

    public Cct0010() {
    }
    
    public Cct0010(int codemp,String per_fac,String locacion, String ctu_nom, String kav_fac,String kav_den,String sucursal) {
    this.codemp=codemp;
    this.per_fac=per_fac;
    this.locacion=locacion;
    this.ctu_nom=ctu_nom;
    this.kav_fac=kav_fac;
    this.kav_den=kav_den;
    this.ctu_nom=ctu_nom;
    this.sucursal=sucursal;
    }

    public Cct0010(int codemp, String locacion, String kav_fac) {
        this.codemp = codemp;
        this.locacion = locacion;
        this.kav_fac = kav_fac;
    }

    public Cct0010(int codemp, String locacion, String kav_fac, String kav_den, int md1_fac, int md2_fac, int md3_fac, int vax_fac, int vay_fac, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.locacion = locacion;
        this.kav_fac = kav_fac;
        this.kav_den = kav_den;
        this.md1_fac = md1_fac;
        this.md2_fac = md2_fac;
        this.md3_fac = md3_fac;
        this.vax_fac = vax_fac;
        this.vay_fac = vay_fac;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Cct0010(int codemp, String locacion, String kav_fac, String kav_den, int md1_fac, int md2_fac, int md3_fac, int vax_fac, int vay_fac, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.locacion = locacion;
        this.kav_fac = kav_fac;
        this.kav_den = kav_den;
        this.md1_fac = md1_fac;
        this.md2_fac = md2_fac;
        this.md3_fac = md3_fac;
        this.vax_fac = vax_fac;
        this.vay_fac = vay_fac;
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

    public String getKav_den() {
        return kav_den;
    }

    public void setKav_den(String kav_den) {
        this.kav_den = kav_den;
    }

    public String getKav_fac() {
        return kav_fac;
    }

    public void setKav_fac(String kav_fac) {
        this.kav_fac = kav_fac;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public int getMd1_fac() {
        return md1_fac;
    }

    public void setMd1_fac(int md1_fac) {
        this.md1_fac = md1_fac;
    }

    public int getMd2_fac() {
        return md2_fac;
    }

    public void setMd2_fac(int md2_fac) {
        this.md2_fac = md2_fac;
    }

    public int getMd3_fac() {
        return md3_fac;
    }

    public void setMd3_fac(int md3_fac) {
        this.md3_fac = md3_fac;
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

    public int getVax_fac() {
        return vax_fac;
    }

    public void setVax_fac(int vax_fac) {
        this.vax_fac = vax_fac;
    }

    public int getVay_fac() {
        return vay_fac;
    }

    public void setVay_fac(int vay_fac) {
        this.vay_fac = vay_fac;
    }

    /**
     * @return the sucursal
     */
    public String getSucursal() {
        return sucursal;
    }

    /**
     * @param sucursal the sucursal to set
     */
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    /**
     * @return the per_fac
     */
    public String getPer_fac() {
        return per_fac;
    }

    /**
     * @param per_fac the per_fac to set
     */
    public void setPer_fac(String per_fac) {
        this.per_fac = per_fac;
    }

    /**
     * @return the ctu_nom
     */
    public String getCtu_nom() {
        return ctu_nom;
    }

    /**
     * @param ctu_nom the ctu_nom to set
     */
    public void setCtu_nom(String ctu_nom) {
        this.ctu_nom = ctu_nom;
    }

}
