package controlador.acceso;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "cAcceso")
@SessionScoped	
public class CAcceso implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8598913851605690413L;
	
	@PostConstruct
	public void init() {
		this.header = "/WEB-INF/vista/configuracion/contenido/header.xhtml";
		//this.content = "/WEB-INF/vista/configuracion/acceso/login.xhtml";
		this.content = "/WEB-INF/vista/test/default.xhtml";
		this.footer = "/WEB-INF/vista/configuracion/contenido/footer.xhtml";
		this.title = "ERP - AVALON";
	}
	
	
	private String header,content,footer;
	private String title,leftMenu;
	
	//Setter == GETTER
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFooter() {
		return footer;
	}
	public void setFooter(String footer) {
		this.footer = footer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLeftMenu() {
		return leftMenu;
	}
	public void setLeftMenu(String leftMenu) {
		this.leftMenu = leftMenu;
	}
}
