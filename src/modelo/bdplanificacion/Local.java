/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdplanificacion;

/**
 * LOCAL
 * @author AMD
 */
public class Local {
    private String cod_loca;
    private String des_local;
    private String rol_org;
    private String abreviado;
    private String cod_zona;
    private String origen;
    private String usrcod;
    private String usrdate;
    private String usrtime;

    public Local() {
    }

    public Local(String cod_loca, String des_local, String rol_org, String abreviado, String cod_zona, String origen, String usrcod, String usrdate, String usrtime) {
        this.cod_loca = cod_loca;
        this.des_local = des_local;
        this.rol_org = rol_org;
        this.abreviado = abreviado;
        this.cod_zona = cod_zona;
        this.origen = origen;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Local(String cod_loca, String cod_zona, String origen) {
        this.cod_loca = cod_loca;
        this.cod_zona = cod_zona;
        this.origen = origen;
    }

    public String getAbreviado() {
        return abreviado;
    }

    public void setAbreviado(String abreviado) {
        this.abreviado = abreviado;
    }

    public String getCod_loca() {
        return cod_loca;
    }

    public void setCod_loca(String cod_loca) {
        this.cod_loca = cod_loca;
    }

    public String getCod_zona() {
        return cod_zona;
    }

    public void setCod_zona(String cod_zona) {
        this.cod_zona = cod_zona;
    }

    public String getDes_local() {
        return des_local;
    }

    public void setDes_local(String des_local) {
        this.des_local = des_local;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getRol_org() {
        return rol_org;
    }

    public void setRol_org(String rol_org) {
        this.rol_org = rol_org;
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
