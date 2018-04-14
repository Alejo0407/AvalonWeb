/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.fp.bdcontable;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class Fcon0001 implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 6691032311199942028L;
	private String ndigitos;

    public Fcon0001() {
    }

    /**
     * @return the ndigitos
     */
    public String getNdigitos() {
        return ndigitos;
    }

    /**
     * @param ndigitos the ndigitos to set
     */
    public void setNdigitos(String ndigitos) {
        this.ndigitos = ndigitos;
    }
}
