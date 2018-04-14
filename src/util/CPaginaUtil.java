package util;

import javax.faces.event.ActionEvent;

/**
 * Esta clase extiende de FacesCurrentInstance y permite realizar diversos 
 * métodos (refrescar contenidos) aplicados a la pagina utilizada.
 * @author AMD
 */

public class CPaginaUtil extends FacesCurrentInstance {

    public CPaginaUtil(){
        setToContextSessionMap("cPaginaUtil", this);
    }

    public void refrescarPagina(ActionEvent event) {
        String rutaCabecera = FacesUtils.getRequestParameter("param");
        this.paginaContenido = "";
        this.paginaMenu = rutaCabecera;
    }

    public void refrescarMenu(String rutaMenu) {
        this.paginaMenu = rutaMenu;
    }

    public void refrescarContenido(String rutaContenido) {
        
        this.paginaContenido = "../"+rutaContenido;
//        this.paginaContenido = rutaContenido;
        System.out.println("pagina cont "+paginaContenido);
    }

    public void refrescarMenuYContenido(ActionEvent actionEvent) {
        this.paginaMenu = FacesUtils.getRequestParameter("menu");
        this.paginaContenido = FacesUtils.getRequestParameter("contenido");
    }

    public void refrescarMenuYContenido(String menu, String contenido) {
        this.paginaMenu = menu;
        this.paginaContenido = contenido;
    }

    public void refrescarCabecera(String rutaCabecera) {
        this.paginaCabecera = "/"+rutaCabecera;
    }

    // Métodos de Acceso:
    public String getPaginaMenu() {
        return paginaMenu;
    }

    public void setPaginaMenu(String paginaMenu) {
        this.paginaMenu = paginaMenu;
    }

    public String getPaginaContenido() {
        return paginaContenido;
    }

    public void setPaginaContenido(String paginaContenido) {
        this.paginaContenido = paginaContenido;
    }

    public void setPaginaCabecera(String paginaCabecera) {
        this.paginaCabecera = paginaCabecera;
    }

    public String getPaginaCabecera() {
        return paginaCabecera;
    }
    // Campos:
    private String paginaMenu = "";
    private String paginaCabecera = "";
    private String paginaContenido = "../../default.html";
}
