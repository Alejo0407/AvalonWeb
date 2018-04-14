package util;

import java.util.TimeZone;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;

public class FacesCurrentInstance {
    /**
     * Este método es usado para agregar una instancia de esta clase al sessionMap del FacesContext.
     * De esta manera cualquier otro BackingBean podrá acceder a esta clase usando este método:
     * FacesContext.getCurrentInstance().getExternalContext().getSessionMap().set(key); o desde un servlet
     * FacesUtils.FacesContextToServlet(HttpServletRequest request, HttpServletResponse response).
     *                          getCurrentInstance().getExternalContext().getSessionMap().set(key);
     * donde key será el nombre de la clase.
     * <p>No retorna ningún valor</p>
     * @param String nameClass
     * @param Object object
     */
    public void setToContextSessionMap(String nameClass, Object object) {
        FacesContext.getCurrentInstance().getExternalContext()
        	.getSessionMap().put(nameClass, object);
    }
    
    public TimeZone getTimeZone() {
        return java.util.TimeZone.getDefault();
    }
    
    public void showMessage(String title,String message) {
    	RequestContext.getCurrentInstance().showMessageInDialog(new FacesMessage(title,message));
    }
}
