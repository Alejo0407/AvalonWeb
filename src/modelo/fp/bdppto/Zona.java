/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.fp.bdppto;

/**
 *
 * @author PC
 */
public class Zona {
private String cod_zona;
private String des_zona;
private String cod_unidad;
private String abreviado;
private String origen;
private String cod_usuario;
private boolean selected;

    /**
     * @return the cod_zona
     */
    public String getCod_zona() {
        return cod_zona;
    }

    /**
     * @param cod_zona the cod_zona to set
     */
    public void setCod_zona(String cod_zona) {
        this.cod_zona = cod_zona;
    }

    /**
     * @return the des_zona
     */
    public String getDes_zona() {
        return des_zona;
    }

    /**
     * @param des_zona the des_zona to set
     */
    public void setDes_zona(String des_zona) {
        this.des_zona = des_zona;
    }

    /**
     * @return the cod_unidad
     */
    public String getCod_unidad() {
        return cod_unidad;
    }

    /**
     * @param cod_unidad the cod_unidad to set
     */
    public void setCod_unidad(String cod_unidad) {
        this.cod_unidad = cod_unidad;
    }

    /**
     * @return the abreviado
     */
    public String getAbreviado() {
        return abreviado;
    }

    /**
     * @param abreviado the abreviado to set
     */
    public void setAbreviado(String abreviado) {
        this.abreviado = abreviado;
    }

    /**
     * @return the origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * @return the cod_usuario
     */
    public String getCod_usuario() {
        return cod_usuario;
    }

    /**
     * @param cod_usuario the cod_usuario to set
     */
    public void setCod_usuario(String cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    /**
     * @return the selected
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }



}
