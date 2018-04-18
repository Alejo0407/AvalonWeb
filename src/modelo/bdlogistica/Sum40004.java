/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdlogistica;

/**
 * 
 * @author AMD
 */
public class Sum40004 {

    private int codemp;
    private String idbien;
    private String tipofami;
    private String grupo;
    private String subgrupo;
    private String sec_bien;
    private String idtipstock;
    private String idtipomat;
    private String desc_mat;
    private String unimed;
    private String especifica;
    private double precmerc;
    private double precmercd;
    private String feulpreme;
    private String fecha_act;
    private String claseabc;
    private String estado;
    private String usrcod;
    private String codanter;
    private String feccrea;
    private double precmercacm;
    private String fecultmov;
    private String oricompra;
    private String serie;
    private double precvent;
    private String reqserie;
    private String prefijo1;
    private String prefijo2;
    private String prefijo3;
    private String prefijo4;
    private String impcarg;
    private String impcars;
    private String indoferta;
    private double porvene;
    private double porvenc;
    private String codpaso;
    private String usrdate;
    private String usrtime;

    public Sum40004() {
    }

    public Sum40004(int codemp, String idbien) {
        this.codemp = codemp;
        this.idbien = idbien;
    }

    public Sum40004(int codemp, String idbien, String tipofami, String grupo, String subgrupo, String sec_bien, String idtipstock, String idtipomat, String desc_mat, String unimed, String especifica, double precmerc, double precmercd, String feulpreme, String fecha_act, String claseabc, String estado, String usrcod, String codanter, String feccrea, double precmercacm, String fecultmov, String oricompra, String serie, double precvent, String reqserie, String prefijo1, String prefijo2, String prefijo3, String prefijo4, String impcarg, String impcars, String indoferta, double porvene, double porvenc, String codpaso, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.idbien = idbien;
        this.tipofami = tipofami;
        this.grupo = grupo;
        this.subgrupo = subgrupo;
        this.sec_bien = sec_bien;
        this.idtipstock = idtipstock;
        this.idtipomat = idtipomat;
        this.desc_mat = desc_mat;
        this.unimed = unimed;
        this.especifica = especifica;
        this.precmerc = precmerc;
        this.precmercd = precmercd;
        this.feulpreme = feulpreme;
        this.fecha_act = fecha_act;
        this.claseabc = claseabc;
        this.estado = estado;
        this.usrcod = usrcod;
        this.codanter = codanter;
        this.feccrea = feccrea;
        this.precmercacm = precmercacm;
        this.fecultmov = fecultmov;
        this.oricompra = oricompra;
        this.serie = serie;
        this.precvent = precvent;
        this.reqserie = reqserie;
        this.prefijo1 = prefijo1;
        this.prefijo2 = prefijo2;
        this.prefijo3 = prefijo3;
        this.prefijo4 = prefijo4;
        this.impcarg = impcarg;
        this.impcars = impcars;
        this.indoferta = indoferta;
        this.porvene = porvene;
        this.porvenc = porvenc;
        this.codpaso = codpaso;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public String getClaseabc() {
        return claseabc;
    }

    public void setClaseabc(String claseabc) {
        this.claseabc = claseabc;
    }

    public String getCodanter() {
        return codanter;
    }

    public void setCodanter(String codanter) {
        this.codanter = codanter;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getCodpaso() {
        return codpaso;
    }

    public void setCodpaso(String codpaso) {
        this.codpaso = codpaso;
    }

    public String getDesc_mat() {
        return desc_mat;
    }

    public void setDesc_mat(String desc_mat) {
        this.desc_mat = desc_mat;
    }

    public String getEspecifica() {
        return especifica;
    }

    public void setEspecifica(String especifica) {
        this.especifica = especifica;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFeccrea() {
        return feccrea;
    }

    public void setFeccrea(String feccrea) {
        this.feccrea = feccrea;
    }

    public String getFecha_act() {
        return fecha_act;
    }

    public void setFecha_act(String fecha_act) {
        this.fecha_act = fecha_act;
    }

    public String getFecultmov() {
        return fecultmov;
    }

    public void setFecultmov(String fecultmov) {
        this.fecultmov = fecultmov;
    }

    public String getFeulpreme() {
        return feulpreme;
    }

    public void setFeulpreme(String feulpreme) {
        this.feulpreme = feulpreme;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getIdbien() {
        return idbien;
    }

    public void setIdbien(String idbien) {
        this.idbien = idbien;
    }

    public String getIdtipomat() {
        return idtipomat;
    }

    public void setIdtipomat(String idtipomat) {
        this.idtipomat = idtipomat;
    }

    public String getIdtipstock() {
        return idtipstock;
    }

    public void setIdtipstock(String idtipstock) {
        this.idtipstock = idtipstock;
    }

    public String getImpcarg() {
        return impcarg;
    }

    public void setImpcarg(String impcarg) {
        this.impcarg = impcarg;
    }

    public String getImpcars() {
        return impcars;
    }

    public void setImpcars(String impcars) {
        this.impcars = impcars;
    }

    public String getIndoferta() {
        return indoferta;
    }

    public void setIndoferta(String indoferta) {
        this.indoferta = indoferta;
    }

    public String getOricompra() {
        return oricompra;
    }

    public void setOricompra(String oricompra) {
        this.oricompra = oricompra;
    }

    public double getPorvenc() {
        return porvenc;
    }

    public void setPorvenc(double porvenc) {
        this.porvenc = porvenc;
    }

    public double getPorvene() {
        return porvene;
    }

    public void setPorvene(double porvene) {
        this.porvene = porvene;
    }

    public double getPrecmerc() {
        return precmerc;
    }

    public void setPrecmerc(double precmerc) {
        this.precmerc = precmerc;
    }

    public double getPrecmercacm() {
        return precmercacm;
    }

    public void setPrecmercacm(double precmercacm) {
        this.precmercacm = precmercacm;
    }

    public double getPrecmercd() {
        return precmercd;
    }

    public void setPrecmercd(double precmercd) {
        this.precmercd = precmercd;
    }

    public double getPrecvent() {
        return precvent;
    }

    public void setPrecvent(double precvent) {
        this.precvent = precvent;
    }

    public String getPrefijo1() {
        return prefijo1;
    }

    public void setPrefijo1(String prefijo1) {
        this.prefijo1 = prefijo1;
    }

    public String getPrefijo2() {
        return prefijo2;
    }

    public void setPrefijo2(String prefijo2) {
        this.prefijo2 = prefijo2;
    }

    public String getPrefijo3() {
        return prefijo3;
    }

    public void setPrefijo3(String prefijo3) {
        this.prefijo3 = prefijo3;
    }

    public String getPrefijo4() {
        return prefijo4;
    }

    public void setPrefijo4(String prefijo4) {
        this.prefijo4 = prefijo4;
    }

    public String getReqserie() {
        return reqserie;
    }

    public void setReqserie(String reqserie) {
        this.reqserie = reqserie;
    }

    public String getSec_bien() {
        return sec_bien;
    }

    public void setSec_bien(String sec_bien) {
        this.sec_bien = sec_bien;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSubgrupo() {
        return subgrupo;
    }

    public void setSubgrupo(String subgrupo) {
        this.subgrupo = subgrupo;
    }

    public String getTipofami() {
        return tipofami;
    }

    public void setTipofami(String tipofami) {
        this.tipofami = tipofami;
    }

    public String getUnimed() {
        return unimed;
    }

    public void setUnimed(String unimed) {
        this.unimed = unimed;
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
