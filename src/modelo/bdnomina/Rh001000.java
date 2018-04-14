/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdnomina;

/**
 * EMPLEADOS DE LA EPS
 * @author AMD
 */
public class Rh001000 {

    private int codemp;
    private String codtrabaj;
    private String apepattra;
    private String apemattra;
    private String nomtrabaj;
    private String esttrabaj;
    private String cod_suc;
    private String codregimen;
    private String codcencos;
    private String codpptal;
    private String codinver;
    private String codcopcap;
    private String coduniorg;
    private String codcargo;
    private String codocupac;
    private String codclase;
    private String codtippue;
    private String codnivel;
    private String codarea;
    private String codafp;
    private String carnetafp;
    private String codbanpag;
    private String tipcueban;
    private String codmonpag;
    private String cuentapag;
    private String codbancts;
    private String codmoncts;
    private String cuentacts;
    private String codtazint;
    private String codcontra;
    private String fecinicio;
    private String feccese;
    private int flgsindic;
    private String situacion;
    private String foto;
    private String dni;
    private String militar;
    private String nit;
    private String direccion;
    private String telefono;
    private String carnetips;
    private String tipseguro;
    private String codpais;
    private String coddpto;
    private String codprov;
    private String coddist;
    private String codprof;
    private String codcateg;
    private String codgrains;
    private double gratvac1;
    private double gratvac2;
    private double gratjdc1;
    private double gratjdc2;
    private double remunera;
    private double sbase;
    private String cta_con;
    private double ocupdt;
    private String usrcod;
    private String usrdate;
    private String usrtime;

    public Rh001000() {
    }

    public Rh001000(int codemp, String codtrabaj) {
        this.codemp = codemp;
        this.codtrabaj = codtrabaj;
    }

    public Rh001000(int codemp, String codtrabaj, String apepattra, String apemattra, String nomtrabaj, String esttrabaj, String cod_suc, String codregimen, String codcencos, String codpptal, String codinver, String codcopcap, String coduniorg, String codcargo, String codocupac, String codclase, String codtippue, String codnivel, String codarea, String codafp, String carnetafp, String codbanpag, String tipcueban, String codmonpag, String cuentapag, String codbancts, String codmoncts, String cuentacts, String codtazint, String codcontra, String fecinicio, String feccese, int flgsindic, String situacion, String foto, String dni, String militar, String nit, String direccion, String telefono, String carnetips, String tipseguro, String codpais, String coddpto, String codprov, String coddist, String codprof, String codcateg, String codgrains, double gratvac1, double gratvac2, double gratjdc1, double gratjdc2, double remunera, double sbase, String cta_con, double ocupdt, String usrcod, String usrdate, String usrtime) {
        this.codemp = codemp;
        this.codtrabaj = codtrabaj;
        this.apepattra = apepattra;
        this.apemattra = apemattra;
        this.nomtrabaj = nomtrabaj;
        this.esttrabaj = esttrabaj;
        this.cod_suc = cod_suc;
        this.codregimen = codregimen;
        this.codcencos = codcencos;
        this.codpptal = codpptal;
        this.codinver = codinver;
        this.codcopcap = codcopcap;
        this.coduniorg = coduniorg;
        this.codcargo = codcargo;
        this.codocupac = codocupac;
        this.codclase = codclase;
        this.codtippue = codtippue;
        this.codnivel = codnivel;
        this.codarea = codarea;
        this.codafp = codafp;
        this.carnetafp = carnetafp;
        this.codbanpag = codbanpag;
        this.tipcueban = tipcueban;
        this.codmonpag = codmonpag;
        this.cuentapag = cuentapag;
        this.codbancts = codbancts;
        this.codmoncts = codmoncts;
        this.cuentacts = cuentacts;
        this.codtazint = codtazint;
        this.codcontra = codcontra;
        this.fecinicio = fecinicio;
        this.feccese = feccese;
        this.flgsindic = flgsindic;
        this.situacion = situacion;
        this.foto = foto;
        this.dni = dni;
        this.militar = militar;
        this.nit = nit;
        this.direccion = direccion;
        this.telefono = telefono;
        this.carnetips = carnetips;
        this.tipseguro = tipseguro;
        this.codpais = codpais;
        this.coddpto = coddpto;
        this.codprov = codprov;
        this.coddist = coddist;
        this.codprof = codprof;
        this.codcateg = codcateg;
        this.codgrains = codgrains;
        this.gratvac1 = gratvac1;
        this.gratvac2 = gratvac2;
        this.gratjdc1 = gratjdc1;
        this.gratjdc2 = gratjdc2;
        this.remunera = remunera;
        this.sbase = sbase;
        this.cta_con = cta_con;
        this.ocupdt = ocupdt;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public String getApemattra() {
        return apemattra;
    }

    public void setApemattra(String apemattra) {
        this.apemattra = apemattra;
    }

    public String getApepattra() {
        return apepattra;
    }

    public void setApepattra(String apepattra) {
        this.apepattra = apepattra;
    }

    public String getCarnetafp() {
        return carnetafp;
    }

    public void setCarnetafp(String carnetafp) {
        this.carnetafp = carnetafp;
    }

    public String getCarnetips() {
        return carnetips;
    }

    public void setCarnetips(String carnetips) {
        this.carnetips = carnetips;
    }

    public String getCod_suc() {
        return cod_suc;
    }

    public void setCod_suc(String cod_suc) {
        this.cod_suc = cod_suc;
    }

    public String getCodafp() {
        return codafp;
    }

    public void setCodafp(String codafp) {
        this.codafp = codafp;
    }

    public String getCodarea() {
        return codarea;
    }

    public void setCodarea(String codarea) {
        this.codarea = codarea;
    }

    public String getCodbancts() {
        return codbancts;
    }

    public void setCodbancts(String codbancts) {
        this.codbancts = codbancts;
    }

    public String getCodbanpag() {
        return codbanpag;
    }

    public void setCodbanpag(String codbanpag) {
        this.codbanpag = codbanpag;
    }

    public String getCodcargo() {
        return codcargo;
    }

    public void setCodcargo(String codcargo) {
        this.codcargo = codcargo;
    }

    public String getCodcateg() {
        return codcateg;
    }

    public void setCodcateg(String codcateg) {
        this.codcateg = codcateg;
    }

    public String getCodcencos() {
        return codcencos;
    }

    public void setCodcencos(String codcencos) {
        this.codcencos = codcencos;
    }

    public String getCodclase() {
        return codclase;
    }

    public void setCodclase(String codclase) {
        this.codclase = codclase;
    }

    public String getCodcontra() {
        return codcontra;
    }

    public void setCodcontra(String codcontra) {
        this.codcontra = codcontra;
    }

    public String getCodcopcap() {
        return codcopcap;
    }

    public void setCodcopcap(String codcopcap) {
        this.codcopcap = codcopcap;
    }

    public String getCoddist() {
        return coddist;
    }

    public void setCoddist(String coddist) {
        this.coddist = coddist;
    }

    public String getCoddpto() {
        return coddpto;
    }

    public void setCoddpto(String coddpto) {
        this.coddpto = coddpto;
    }

    public int getCodemp() {
        return codemp;
    }

    public void setCodemp(int codemp) {
        this.codemp = codemp;
    }

    public String getCodgrains() {
        return codgrains;
    }

    public void setCodgrains(String codgrains) {
        this.codgrains = codgrains;
    }

    public String getCodinver() {
        return codinver;
    }

    public void setCodinver(String codinver) {
        this.codinver = codinver;
    }

    public String getCodmoncts() {
        return codmoncts;
    }

    public void setCodmoncts(String codmoncts) {
        this.codmoncts = codmoncts;
    }

    public String getCodmonpag() {
        return codmonpag;
    }

    public void setCodmonpag(String codmonpag) {
        this.codmonpag = codmonpag;
    }

    public String getCodnivel() {
        return codnivel;
    }

    public void setCodnivel(String codnivel) {
        this.codnivel = codnivel;
    }

    public String getCodocupac() {
        return codocupac;
    }

    public void setCodocupac(String codocupac) {
        this.codocupac = codocupac;
    }

    public String getCodpais() {
        return codpais;
    }

    public void setCodpais(String codpais) {
        this.codpais = codpais;
    }

    public String getCodpptal() {
        return codpptal;
    }

    public void setCodpptal(String codpptal) {
        this.codpptal = codpptal;
    }

    public String getCodprof() {
        return codprof;
    }

    public void setCodprof(String codprof) {
        this.codprof = codprof;
    }

    public String getCodprov() {
        return codprov;
    }

    public void setCodprov(String codprov) {
        this.codprov = codprov;
    }

    public String getCodregimen() {
        return codregimen;
    }

    public void setCodregimen(String codregimen) {
        this.codregimen = codregimen;
    }

    public String getCodtazint() {
        return codtazint;
    }

    public void setCodtazint(String codtazint) {
        this.codtazint = codtazint;
    }

    public String getCodtippue() {
        return codtippue;
    }

    public void setCodtippue(String codtippue) {
        this.codtippue = codtippue;
    }

    public String getCodtrabaj() {
        return codtrabaj;
    }

    public void setCodtrabaj(String codtrabaj) {
        this.codtrabaj = codtrabaj;
    }

    public String getCoduniorg() {
        return coduniorg;
    }

    public void setCoduniorg(String coduniorg) {
        this.coduniorg = coduniorg;
    }

    public String getCta_con() {
        return cta_con;
    }

    public void setCta_con(String cta_con) {
        this.cta_con = cta_con;
    }

    public String getCuentacts() {
        return cuentacts;
    }

    public void setCuentacts(String cuentacts) {
        this.cuentacts = cuentacts;
    }

    public String getCuentapag() {
        return cuentapag;
    }

    public void setCuentapag(String cuentapag) {
        this.cuentapag = cuentapag;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEsttrabaj() {
        return esttrabaj;
    }

    public void setEsttrabaj(String esttrabaj) {
        this.esttrabaj = esttrabaj;
    }

    public String getFeccese() {
        return feccese;
    }

    public void setFeccese(String feccese) {
        this.feccese = feccese;
    }

    public String getFecinicio() {
        return fecinicio;
    }

    public void setFecinicio(String fecinicio) {
        this.fecinicio = fecinicio;
    }

    public int getFlgsindic() {
        return flgsindic;
    }

    public void setFlgsindic(int flgsindic) {
        this.flgsindic = flgsindic;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public double getGratjdc1() {
        return gratjdc1;
    }

    public void setGratjdc1(double gratjdc1) {
        this.gratjdc1 = gratjdc1;
    }

    public double getGratjdc2() {
        return gratjdc2;
    }

    public void setGratjdc2(double gratjdc2) {
        this.gratjdc2 = gratjdc2;
    }

    public double getGratvac1() {
        return gratvac1;
    }

    public void setGratvac1(double gratvac1) {
        this.gratvac1 = gratvac1;
    }

    public double getGratvac2() {
        return gratvac2;
    }

    public void setGratvac2(double gratvac2) {
        this.gratvac2 = gratvac2;
    }

    public String getMilitar() {
        return militar;
    }

    public void setMilitar(String militar) {
        this.militar = militar;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNomtrabaj() {
        return nomtrabaj;
    }

    public void setNomtrabaj(String nomtrabaj) {
        this.nomtrabaj = nomtrabaj;
    }

    public double getOcupdt() {
        return ocupdt;
    }

    public void setOcupdt(double ocupdt) {
        this.ocupdt = ocupdt;
    }

    public double getRemunera() {
        return remunera;
    }

    public void setRemunera(double remunera) {
        this.remunera = remunera;
    }

    public double getSbase() {
        return sbase;
    }

    public void setSbase(double sbase) {
        this.sbase = sbase;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipcueban() {
        return tipcueban;
    }

    public void setTipcueban(String tipcueban) {
        this.tipcueban = tipcueban;
    }

    public String getTipseguro() {
        return tipseguro;
    }

    public void setTipseguro(String tipseguro) {
        this.tipseguro = tipseguro;
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
