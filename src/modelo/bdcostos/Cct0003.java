/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

import util.CUtil;

/**
 * SUCURSALES
 * @author INTEL
 */
public class Cct0003 implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -5887216894404005567L;
	private char asterisco;
    private int codemp;
    private String cos_suc;
    private String cos_sts;
    private String cos_nom;
    private String cos_are;
    private String cos_res;
    private int cos_inf;
    private String cos_niv;
    private String cos_tip;
    private String cos_fpr;
    private String cos_fba;
    private int cos_pva;
    private int cos_p01;
    private int cos_p02;
    private int cos_p03;
    private int cos_p04;
    private int cos_p05;
    private int cos_p06;
    private int cos_p07;
    private int cos_p08;
    private int cos_p09;
    private int cos_p10;
    private int cos_p11;
    private int cos_p12;
    private String cos_rec_ag;
    private String cos_rec_al;
    private String usrcod;
    private String usrdate;
    private String usrtime;
    private boolean selected;

    public Cct0003() {
    }

    public Cct0003(int codemp, String cos_suc) {
        this.codemp = codemp;
        this.cos_suc = cos_suc;
    }

    public Cct0003(int codemp, String cos_suc, String cos_sts, String cos_nom, String cos_are, String cos_res, int cos_inf, String cos_niv, String cos_tip, String cos_fpr, String cos_fba, int cos_pva, int cos_p01, int cos_p02, int cos_p03, int cos_p04, int cos_p05, int cos_p06, int cos_p07, int cos_p08, int cos_p09, int cos_p10, int cos_p11, int cos_p12, String cos_rec_ag, String cos_rec_al, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.cos_suc = cos_suc;
        this.cos_sts = cos_sts;
        this.cos_nom = cos_nom;
        this.cos_are = cos_are;
        this.cos_res = cos_res;
        this.cos_inf = cos_inf;
        this.cos_niv = cos_niv;
        this.cos_tip = cos_tip;
        this.cos_fpr = cos_fpr;
        this.cos_fba = cos_fba;
        this.cos_pva = cos_pva;
        this.cos_p01 = cos_p01;
        this.cos_p02 = cos_p02;
        this.cos_p03 = cos_p03;
        this.cos_p04 = cos_p04;
        this.cos_p05 = cos_p05;
        this.cos_p06 = cos_p06;
        this.cos_p07 = cos_p07;
        this.cos_p08 = cos_p08;
        this.cos_p09 = cos_p09;
        this.cos_p10 = cos_p10;
        this.cos_p11 = cos_p11;
        this.cos_p12 = cos_p12;
        this.cos_rec_ag = cos_rec_ag;
        this.cos_rec_al = cos_rec_al;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public Cct0003(int codemp, String cos_suc, String cos_sts, String cos_nom, String cos_are, String cos_res, int cos_inf, String cos_niv, String cos_tip, String cos_fpr, String cos_fba, int cos_pva, int cos_p01, int cos_p02, int cos_p03, int cos_p04, int cos_p05, int cos_p06, int cos_p07, int cos_p08, int cos_p09, int cos_p10, int cos_p11, int cos_p12, String cos_rec_ag, String cos_rec_al, String usrcod, String usrdate, String usrtime, boolean selected) {
        this.codemp = codemp;
        this.cos_suc = cos_suc;
        this.cos_sts = cos_sts;
        this.cos_nom = cos_nom;
        this.cos_are = cos_are;
        this.cos_res = cos_res;
        this.cos_inf = cos_inf;
        this.cos_niv = cos_niv;
        this.cos_tip = cos_tip;
        this.cos_fpr = cos_fpr;
        this.cos_fba = cos_fba;
        this.cos_pva = cos_pva;
        this.cos_p01 = cos_p01;
        this.cos_p02 = cos_p02;
        this.cos_p03 = cos_p03;
        this.cos_p04 = cos_p04;
        this.cos_p05 = cos_p05;
        this.cos_p06 = cos_p06;
        this.cos_p07 = cos_p07;
        this.cos_p08 = cos_p08;
        this.cos_p09 = cos_p09;
        this.cos_p10 = cos_p10;
        this.cos_p11 = cos_p11;
        this.cos_p12 = cos_p12;
        this.cos_rec_ag = cos_rec_ag;
        this.cos_rec_al = cos_rec_al;
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

    public String getCos_are() {
        return cos_are;
    }

    public void setCos_are(String cos_are) {
        this.cos_are = cos_are;
    }

    public String getCos_fba() {
        return cos_fba;
    }

    public void setCos_fba(String cos_fba) {
        this.cos_fba = cos_fba;
    }

    public String getCos_fpr() {
        return cos_fpr;
    }

    public void setCos_fpr(String cos_fpr) {
          cos_fpr=CUtil.getFechaDMA(cos_fpr);
        this.cos_fpr = cos_fpr;
    }

    public int getCos_inf() {
        return cos_inf;
    }

    public void setCos_inf(int cos_inf) {
        this.cos_inf = cos_inf;
    }

    public String getCos_niv() {
        return cos_niv;
    }

    public void setCos_niv(String cos_niv) {
        this.cos_niv = cos_niv;
    }

    public String getCos_nom() {
        return cos_nom;
    }

    public void setCos_nom(String cos_nom) {
        this.cos_nom = cos_nom;
    }

    public int getCos_p01() {
        return cos_p01;
    }

    public void setCos_p01(int cos_p01) {
        this.cos_p01 = cos_p01;
    }

    public int getCos_p02() {
        return cos_p02;
    }

    public void setCos_p02(int cos_p02) {
        this.cos_p02 = cos_p02;
    }

    public int getCos_p03() {
        return cos_p03;
    }

    public void setCos_p03(int cos_p03) {
        this.cos_p03 = cos_p03;
    }

    public int getCos_p04() {
        return cos_p04;
    }

    public void setCos_p04(int cos_p04) {
        this.cos_p04 = cos_p04;
    }

    public int getCos_p05() {
        return cos_p05;
    }

    public void setCos_p05(int cos_p05) {
        this.cos_p05 = cos_p05;
    }

    public int getCos_p06() {
        return cos_p06;
    }

    public void setCos_p06(int cos_p06) {
        this.cos_p06 = cos_p06;
    }

    public int getCos_p07() {
        return cos_p07;
    }

    public void setCos_p07(int cos_p07) {
        this.cos_p07 = cos_p07;
    }

    public int getCos_p08() {
        return cos_p08;
    }

    public void setCos_p08(int cos_p08) {
        this.cos_p08 = cos_p08;
    }

    public int getCos_p09() {
        return cos_p09;
    }

    public void setCos_p09(int cos_p09) {
        this.cos_p09 = cos_p09;
    }

    public int getCos_p10() {
        return cos_p10;
    }

    public void setCos_p10(int cos_p10) {
        this.cos_p10 = cos_p10;
    }

    public int getCos_p11() {
        return cos_p11;
    }

    public void setCos_p11(int cos_p11) {
        this.cos_p11 = cos_p11;
    }

    public int getCos_p12() {
        return cos_p12;
    }

    public void setCos_p12(int cos_p12) {
        this.cos_p12 = cos_p12;
    }

    public int getCos_pva() {
        return cos_pva;
    }

    public void setCos_pva(int cos_pva) {
        this.cos_pva = cos_pva;
    }

    public String getCos_rec_ag() {
        return cos_rec_ag;
    }

    public void setCos_rec_ag(String cos_rec_ag) {
        this.cos_rec_ag = cos_rec_ag;
    }

    public String getCos_rec_al() {
        return cos_rec_al;
    }

    public void setCos_rec_al(String cos_rec_al) {
        this.cos_rec_al = cos_rec_al;
    }

    public String getCos_res() {
        return cos_res;
    }

    public void setCos_res(String cos_res) {
        this.cos_res = cos_res;
    }

    public String getCos_sts() {
        return cos_sts;
    }

    public void setCos_sts(String cos_sts) {
        this.cos_sts = cos_sts;
    }

    public String getCos_suc() {
        return cos_suc;
    }

    public void setCos_suc(String cos_suc) {
        this.cos_suc = cos_suc;
    }

    public String getCos_tip() {
        return cos_tip;
    }

    public void setCos_tip(String cos_tip) {
        this.cos_tip = cos_tip;
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

    /**
     * @return the asterisco
     */
    public char getAsterisco() {
        return asterisco;
    }

    /**
     * @param asterisco the asterisco to set
     */
    public void setAsterisco(char asterisco) {
        this.asterisco = asterisco;
    }
    
}
