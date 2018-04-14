/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.bdcontabilidad;

/**
 *
 * @author AMD
 */
public class Fcon0016 {

    private int qui_pos;
    private String qui_det;
    private String usrcod;
    private String usrdate;
    private String usrtime;

    public Fcon0016() {
    }

    public Fcon0016(int qui_pos, String qui_det, String usrcod, String usrdate, String usrtime) {
        this.qui_pos = qui_pos;
        this.qui_det = qui_det;
        this.usrcod = usrcod;
        this.usrdate = usrdate;
        this.usrtime = usrtime;
    }

    public String getQui_det() {
        return qui_det;
    }

    public void setQui_det(String qui_det) {
        this.qui_det = qui_det;
    }

    public int getQui_pos() {
        return qui_pos;
    }

    public void setQui_pos(int qui_pos) {
        this.qui_pos = qui_pos;
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
