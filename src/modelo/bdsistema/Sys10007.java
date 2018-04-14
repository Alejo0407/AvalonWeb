/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdsistema;

/**
 * Menu de un Módulo del AVALON.
 * @author AMD
 */
public class Sys10007 {

    private String cidopcion;
    private int codapli;
    private String desopcion;
    private int lprincipal;
    private int ldespliega;
    private String cpopup;
    private String textopc;
    private String despagina;
    private String modulo;
    private String perfiles;
    private String nivel;
    private String usrcod;
    private String usrdate;
    private String usrtime;

    public Sys10007() {
    }

    public Sys10007(String cidopcion, int codapli, String desopcion, int lprincipal, int ldespliega, String cpopup, String textopc, String despagina, String modulo, String perfiles, String nivel, String usrcod, String usrdate, String usrtime) {
        this.cidopcion = cidopcion;
        this.codapli = codapli;
        this.desopcion = desopcion;
        this.lprincipal = lprincipal;
        this.ldespliega = ldespliega;
        this.cpopup = cpopup;
        this.textopc = textopc;
        this.despagina = despagina;
        this.modulo = modulo;
        this.perfiles = perfiles;
        this.nivel = nivel;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public String getCidopcion() {
        return cidopcion;
    }

    public void setCidopcion(String cidopcion) {
        this.cidopcion = cidopcion;
    }

    public int getCodapli() {
        return codapli;
    }

    public void setCodapli(int codapli) {
        this.codapli = codapli;
    }

    public String getCpopup() {
        return cpopup;
    }

    public void setCpopup(String cpopup) {
        this.cpopup = cpopup;
    }

    public String getDesopcion() {
        return desopcion;
    }

    public void setDesopcion(String desopcion) {
        this.desopcion = desopcion;
    }

    public String getDespagina() {
        return despagina;
    }

    public void setDespagina(String despagina) {
        this.despagina = despagina;
    }

    public int getLdespliega() {
        return ldespliega;
    }

    public void setLdespliega(int ldespliega) {
        this.ldespliega = ldespliega;
    }

    public int getLprincipal() {
        return lprincipal;
    }

    public void setLprincipal(int lprincipal) {
        this.lprincipal = lprincipal;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(String perfiles) {
        this.perfiles = perfiles;
    }

    public String getTextopc() {
        return textopc;
    }

    public void setTextopc(String textopc) {
        this.textopc = textopc;
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
