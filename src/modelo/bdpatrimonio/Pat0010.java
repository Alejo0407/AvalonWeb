/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdpatrimonio;

/**
 *
 * @author INTEL
 */
public class Pat0010 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 2592506563148633385L;
	private int codemp;
    private String cod_grp;
    private String des_grp;
    private int vut_grp;
    private int fdp_grp;
    private String ctd_grp;
    private String cth_grp;
    private String cod_clase;
    private String acd_grp;
    private String ach_grp;
    private String tipo;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Pat0010() {
    }

    public Pat0010(int codemp, String cod_grp) {
        this.codemp = codemp;
        this.cod_grp = cod_grp;
    }

    public Pat0010(int codemp, String cod_grp, String des_grp, int vut_grp, int fdp_grp, String ctd_grp, String cth_grp, String cod_clase, String acd_grp, String ach_grp, String tipo, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.cod_grp = cod_grp;
        this.des_grp = des_grp;
        this.vut_grp = vut_grp;
        this.fdp_grp = fdp_grp;
        this.ctd_grp = ctd_grp;
        this.cth_grp = cth_grp;
        this.cod_clase = cod_clase;
        this.acd_grp = acd_grp;
        this.ach_grp = ach_grp;
        this.tipo = tipo;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Pat0010(int codemp, String cod_grp, String des_grp, int vut_grp, int fdp_grp, String ctd_grp, String cth_grp, String cod_clase, String acd_grp, String ach_grp, String tipo, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.cod_grp = cod_grp;
        this.des_grp = des_grp;
        this.vut_grp = vut_grp;
        this.fdp_grp = fdp_grp;
        this.ctd_grp = ctd_grp;
        this.cth_grp = cth_grp;
        this.cod_clase = cod_clase;
        this.acd_grp = acd_grp;
        this.ach_grp = ach_grp;
        this.tipo = tipo;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.selected = selected;
    }
    
    public String getAcd_grp() {
        return acd_grp;
    }

    public void setAcd_grp(String acd_grp) {
        this.acd_grp = acd_grp;
    }

    public String getAch_grp() {
        return ach_grp;
    }

    public void setAch_grp(String ach_grp) {
        this.ach_grp = ach_grp;
    }

    public String getCod_clase() {
        return cod_clase;
    }

    public void setCod_clase(String cod_clase) {
        this.cod_clase = cod_clase;
    }

    public String getCod_grp() {
        return cod_grp;
    }

    public void setCod_grp(String cod_grp) {
        this.cod_grp = cod_grp;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getCtd_grp() {
        return ctd_grp;
    }

    public void setCtd_grp(String ctd_grp) {
        this.ctd_grp = ctd_grp;
    }

    public String getCth_grp() {
        return cth_grp;
    }

    public void setCth_grp(String cth_grp) {
        this.cth_grp = cth_grp;
    }

    public String getDes_grp() {
        return des_grp;
    }

    public void setDes_grp(String des_grp) {
        this.des_grp = des_grp;
    }

    public int getFdp_grp() {
        return fdp_grp;
    }

    public void setFdp_grp(int fdp_grp) {
        this.fdp_grp = fdp_grp;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public int getVut_grp() {
        return vut_grp;
    }

    public void setVut_grp(int vut_grp) {
        this.vut_grp = vut_grp;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    
}
