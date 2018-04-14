/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdsistema;

/**
 * Usuarios del AVALON.
 * @author AMD
 */
public class Sys10005 {

    private int codemp;
    private String codusr;
    private String denusr;
    private String clave;
    private String agencia;
    private String oficina;
    private int imprime;
    private int actualiza;
    private int elimina;
    private int agrega;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private String correo;
    private String clavecorreo;

    public Sys10005() {
    }

    public Sys10005(int codemp, String codusr, String denusr, String clave, String agencia, String oficina, int imprime, int actualiza, int elimina, int agrega, String usrcod, String usrdate, String usrtime, String correo, String clavecorreo) {
        this.codemp = codemp;
        this.codusr = codusr;
        this.denusr = denusr;
        this.clave = clave;
        this.agencia = agencia;
        this.oficina = oficina;
        this.imprime = imprime;
        this.actualiza = actualiza;
        this.elimina = elimina;
        this.agrega = agrega;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.correo = correo;
        this.clavecorreo = clavecorreo;
    }

    
    public String getClavecorreo() {
        return clavecorreo;
    }

    public void setClavecorreo(String clavecorreo) {
        this.clavecorreo = clavecorreo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getActualiza() {
        return actualiza;
    }

    public void setActualiza(int actualiza) {
        this.actualiza = actualiza;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getAgrega() {
        return agrega;
    }

    public void setAgrega(int agrega) {
        this.agrega = agrega;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getCodusr() {
        return codusr;
    }

    public void setCodusr(String codusr) {
        this.codusr = codusr;
    }

    public String getDenusr() {
        return denusr;
    }

    public void setDenusr(String denusr) {
        this.denusr = denusr;
    }

    public int getElimina() {
        return elimina;
    }

    public void setElimina(int elimina) {
        this.elimina = elimina;
    }

    public int getImprime() {
        return imprime;
    }

    public void setImprime(int imprime) {
        this.imprime = imprime;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
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
