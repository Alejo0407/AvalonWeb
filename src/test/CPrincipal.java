package test;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "indiceBean")
@SessionScoped
public class CPrincipal implements Serializable {

	//===========SERIAL==============
	/**
	 * 
	 */
	private static final long serialVersionUID = 9215803288566955817L;
	//======CONSTRUCTOR
	public CPrincipal() {
		this.header = "/WEB-INF/vista/configuracion/contenido/header.xhtml";
		this.centro = "/WEB-INF/vista/configuracion/acceso/login.xhtml";
		this.footer = "/WEB-INF/vista/configuracion/contenido/footer.xhtml";
		this.title = "ERP - AVALON";
	}
	
	//======METODOS EVENTOS
	public void accionCambio() {
		this.centro = "/WEB-INF/vista/test/cambio_contenido.xhtml";
		this.title = "EL titulo ha sido modificado";
	}
	
	
	//======METODOS INTERNOS
	
	
	//========= SETTER Y GETTER
	public String getCentro() {
		return centro;
	}
	public void setCentro(String centro) {
		this.centro = centro;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	//=====ATRIBUTOS=======
	private String header,centro,footer;
	private String title;
}
