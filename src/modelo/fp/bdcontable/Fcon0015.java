/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.fp.bdcontable;

import java.io.Serializable;

/**
 * Plan 
 * @author AMD
 */
public class Fcon0015 implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -9047387184386024364L;
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
