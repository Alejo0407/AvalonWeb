/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 *
 * @author INTEL
 */
public class Cct0009 implements java.io.Serializable{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 4672758148694800373L;
	private int codemp;
    private String sucursal;
    private String periodo;
    private String error;
    private String codigo;
    private int ltivo;
    private String ldoc1;
    private int lorig;
    private String ccta;
    private String fcta;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Cct0009() {
    }

    public Cct0009(int codemp) {
        this.codemp = codemp;
    }

    public Cct0009(int codemp, String sucursal, String periodo, String error, String codigo, int ltivo, String ldoc1, int lorig, String ccta, String fcta, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.sucursal = sucursal;
        this.periodo = periodo;
        this.error = error;
        this.codigo = codigo;
        this.ltivo = ltivo;
        this.ldoc1 = ldoc1;
        this.lorig = lorig;
        this.ccta = ccta;
        this.fcta = fcta;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Cct0009(int codemp, String sucursal, String periodo, String error, String codigo, int ltivo, String ldoc1, int lorig, String ccta, String fcta, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.sucursal = sucursal;
        this.periodo = periodo;
        this.error = error;
        this.codigo = codigo;
        this.ltivo = ltivo;
        this.ldoc1 = ldoc1;
        this.lorig = lorig;
        this.ccta = ccta;
        this.fcta = fcta;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.selected = selected;
    }

    public String getCcta() {
        return ccta;
    }

    public void setCcta(String ccta) {
        this.ccta = ccta;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getFcta() {
        return fcta;
    }

    public void setFcta(String fcta) {
        this.fcta = fcta;
    }

    public String getLdoc1() {
        return ldoc1;
    }

    public void setLdoc1(String ldoc1) {
        this.ldoc1 = ldoc1;
    }

    public int getLorig() {
        return lorig;
    }

    public void setLorig(int lorig) {
        this.lorig = lorig;
    }

    public int getLtivo() {
        return ltivo;
    }

    public void setLtivo(int ltivo) {
        this.ltivo = ltivo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
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
