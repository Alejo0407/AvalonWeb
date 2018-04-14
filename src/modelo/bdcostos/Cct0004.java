/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 * CENTRO DE COSTOS
 * @author AMD
 */
public class Cct0004 implements java.io.Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -5975175316291364037L;
	private int codemp;
    private String ccta;   
    private String cod;
    private String codsunat;
    private String locacion;
    private String codcoe;
    private String codccp;
    private String codcog;
    private String cca;
    private String descr;
    private String estado;
    private String tipcosto;
    private String detalle;
    private String fctadebe;
    private String fctahaber;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Cct0004() {
    }

    public Cct0004(int codemp, String ccta) {
        this.codemp = codemp;
        this.ccta = ccta;        
    }

    public Cct0004(int codemp, String ccta, String cod, String codsunat, String locacion, String codcoe, String codccp, String codcog, String cca, String descr, String estado, String tipcosto, String detalle, String fctadebe, String fctahaber, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.ccta = ccta;       
        this.cod = cod;
        this.codsunat = codsunat;
        this.locacion = locacion;
        this.codcoe = codcoe;
        this.codccp = codccp;
        this.codcog = codcog;
        this.cca = cca;
        this.descr = descr;
        this.estado = estado;
        this.tipcosto = tipcosto;
        this.detalle = detalle;
        this.fctadebe = fctadebe;
        this.fctahaber = fctahaber;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Cct0004(int codemp, String ccta, String cod, String codsunat, String locacion, String codcoe, String codccp, String codcog, String cca, String descr, String estado, String tipcosto, String detalle, String fctadebe, String fctahaber, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.ccta = ccta;
        this.cod = cod;
        this.codsunat = codsunat;
        this.locacion = locacion;
        this.codcoe = codcoe;
        this.codccp = codccp;
        this.codcog = codcog;
        this.cca = cca;
        this.descr = descr;
        this.estado = estado;
        this.tipcosto = tipcosto;
        this.detalle = detalle;
        this.fctadebe = fctadebe;
        this.fctahaber = fctahaber;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.selected = selected;
    }

    public String getCca() {
        return cca;
    }

    public void setCca(String cca) {
        this.cca = cca;
    }

    public String getCcta() {
        return ccta;
    }

    public void setCcta(String ccta) {
        this.ccta = ccta;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getCodccp() {
        return codccp;
    }

    public void setCodccp(String codccp) {
        this.codccp = codccp;
    }

    public String getCodcoe() {
        return codcoe;
    }

    public void setCodcoe(String codcoe) {
        this.codcoe = codcoe;
    }

    public String getCodcog() {
        return codcog;
    }

    public void setCodcog(String codcog) {
        this.codcog = codcog;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getCodsunat() {
        return codsunat;
    }

    public void setCodsunat(String codsunat) {
        this.codsunat = codsunat;
    }
  
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFctadebe() {
        return fctadebe;
    }

    public void setFctadebe(String fctadebe) {
        this.fctadebe = fctadebe;
    }

    public String getFctahaber() {
        return fctahaber;
    }

    public void setFctahaber(String fctahaber) {
        this.fctahaber = fctahaber;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getTipcosto() {
        return tipcosto;
    }

    public void setTipcosto(String tipcosto) {
        this.tipcosto = tipcosto;
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
