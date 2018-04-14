/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcostos;

/**
 * PERIODO
 * @author AMD
 */
public class Cct0001 implements java.io.Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -6852763575580565823L;
	private int codemp;
    private String cos_suc;
    private String periodo;
    private String estado;
    private String usrcod;
    private String usrdate;
    private String usrtime;

    public Cct0001() {
    }

    public Cct0001(int codemp, String cos_suc, String periodo) {
        this.codemp = codemp;
        this.cos_suc = cos_suc;
        this.periodo = periodo;
    }

    public Cct0001(int codemp, String cos_suc, String periodo, String estado, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.cos_suc = cos_suc;
        this.periodo = periodo;
        this.estado = estado;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getCos_suc() {
        return cos_suc;
    }

    public void setCos_suc(String cos_suc) {
        this.cos_suc = cos_suc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
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
