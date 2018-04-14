/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcontabilidad;


/**
 * CUENTAS CONTABLES
 * @author AMD
 */
public class Fcon0015 {

    private String cta;
    private String descta;

    public Fcon0015() {
    }

    public Fcon0015(String cta, String descta) {
        this.cta = cta;
        this.descta = descta;
    }

    public String getCta() {
        return cta;
    }

    public void setCta(String cta) {
        this.cta = cta;
    }

    public String getDescta() {
        return descta;
    }

    public void setDescta(String descta) {
        this.descta = descta;
    }
}
