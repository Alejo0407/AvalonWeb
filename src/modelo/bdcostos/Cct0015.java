/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 *
 * @author INTEL
 */
public class Cct0015 {
    
    private int codemp;
    private String periodo;
    private String cctaem;
    private String cctare;
    private String codmet;
    private int porcdist;
    private String flagpv;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Cct0015() {
    }

    public Cct0015(int codemp, String periodo, String cctaem, String cctare) {
        this.codemp = codemp;
        this.periodo = periodo;
        this.cctaem = cctaem;
        this.cctare = cctare;
    }

    public Cct0015(int codemp, String periodo, String cctaem, String cctare, String codmet, int porcdist, String flagpv, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.periodo = periodo;
        this.cctaem = cctaem;
        this.cctare = cctare;
        this.codmet = codmet;
        this.porcdist = porcdist;
        this.flagpv = flagpv;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Cct0015(int codemp, String periodo, String cctaem, String cctare, String codmet, int porcdist, String flagpv, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.periodo = periodo;
        this.cctaem = cctaem;
        this.cctare = cctare;
        this.codmet = codmet;
        this.porcdist = porcdist;
        this.flagpv = flagpv;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
        this.selected = selected;
    }

    public String getCctaem() {
        return cctaem;
    }

    public void setCctaem(String cctaem) {
        this.cctaem = cctaem;
    }

    public String getCctare() {
        return cctare;
    }

    public void setCctare(String cctare) {
        this.cctare = cctare;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getCodmet() {
        return codmet;
    }

    public void setCodmet(String codmet) {
        this.codmet = codmet;
    }

    public String getFlagpv() {
        return flagpv;
    }

    public void setFlagpv(String flagpv) {
        this.flagpv = flagpv;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getPorcdist() {
        return porcdist;
    }

    public void setPorcdist(int porcdist) {
        this.porcdist = porcdist;
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
