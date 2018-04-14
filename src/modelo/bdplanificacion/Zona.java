/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdplanificacion;

/**
 * ZONA
 * @author AMD
 */
public class Zona {
    
    private String cod_zona;
    private String des_zona;
    private String cod_unidad;
    private String abreviado;
    private String origen;
    private String usrcod;
    private String usrdate;
    private String usrtime;

    public Zona() {
    }

    public Zona(String cod_zona, String origen) {
        this.cod_zona = cod_zona;
        this.origen = origen;
    }

    public Zona(String cod_zona, String des_zona, String cod_unidad, String abreviado, String origen, String usrcod, String usrdate, String usrtime) {
        this.cod_zona = cod_zona;
        this.des_zona = des_zona;
        this.cod_unidad = cod_unidad;
        this.abreviado = abreviado;
        this.origen = origen;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public String getAbreviado() {
        return abreviado;
    }

    public void setAbreviado(String abreviado) {
        this.abreviado = abreviado;
    }

    public String getCod_unidad() {
        return cod_unidad;
    }

    public void setCod_unidad(String cod_unidad) {
        this.cod_unidad = cod_unidad;
    }

    public String getCod_zona() {
        return cod_zona;
    }

    public void setCod_zona(String cod_zona) {
        this.cod_zona = cod_zona;
    }

    public String getDes_zona() {
        return des_zona;
    }

    public void setDes_zona(String des_zona) {
        this.des_zona = des_zona;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
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
