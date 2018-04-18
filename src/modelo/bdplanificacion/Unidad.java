/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdplanificacion;

/**
 * UNIDADES ORGANICAS
 * @author AMD
 */
public class Unidad {
    
    private String cod_unidad;
    private String des_unidad;
    private String cencos;
    private String abrevia;
    private String cod_amb;
    private String tipo_amb;
    private String rol_org;
    private String dep_org;
    private String origen;
    private String partida;
    private String usr_cod;
    private String usr_date;
    private String usr_time;

    public Unidad() {
    }

    public Unidad(String cod_unidad, String origen) {
        this.cod_unidad = cod_unidad;
        this.origen = origen;
    }

    public Unidad(String cod_unidad, String des_unidad, String cencos, String abrevia, String cod_amb, String tipo_amb, String rol_org, String dep_org, String origen, String partida, String usr_cod, String usr_date, String usr_time) {
        this.cod_unidad = cod_unidad;
        this.des_unidad = des_unidad;
        this.cencos = cencos;
        this.abrevia = abrevia;
        this.cod_amb = cod_amb;
        this.tipo_amb = tipo_amb;
        this.rol_org = rol_org;
        this.dep_org = dep_org;
        this.origen = origen;
        this.partida = partida;
        this.usr_cod = usr_cod;
        this.usr_date = usr_date;
        this.usr_time = usr_time;
    }

    public String getAbrevia() {
        return abrevia;
    }

    public void setAbrevia(String abrevia) {
        this.abrevia = abrevia;
    }

    public String getCencos() {
        return cencos;
    }

    public void setCencos(String cencos) {
        this.cencos = cencos;
    }

    public String getCod_amb() {
        return cod_amb;
    }

    public void setCod_amb(String cod_amb) {
        this.cod_amb = cod_amb;
    }

    public String getCod_unidad() {
        return cod_unidad;
    }

    public void setCod_unidad(String cod_unidad) {
        this.cod_unidad = cod_unidad;
    }

    public String getDep_org() {
        return dep_org;
    }

    public void setDep_org(String dep_org) {
        this.dep_org = dep_org;
    }

    public String getDes_unidad() {
        return des_unidad;
    }

    public void setDes_unidad(String des_unidad) {
        this.des_unidad = des_unidad;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getRol_org() {
        return rol_org;
    }

    public void setRol_org(String rol_org) {
        this.rol_org = rol_org;
    }

    public String getTipo_amb() {
        return tipo_amb;
    }

    public void setTipo_amb(String tipo_amb) {
        this.tipo_amb = tipo_amb;
    }

    public String getUsr_cod() {
        return usr_cod;
    }

    public void setUsr_cod(String usr_cod) {
        this.usr_cod = usr_cod;
    }

    public String getUsr_date() {
        return usr_date;
    }

    public void setUsr_date(String usr_date) {
        this.usr_date = usr_date;
    }

    public String getUsr_time() {
        return usr_time;
    }

    public void setUsr_time(String usr_time) {
        this.usr_time = usr_time;
    }
    
}
