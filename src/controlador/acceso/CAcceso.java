package controlador.acceso;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

import modelo.bdsistema.Sys10001;
import modelo.bdsistema.Sys10002;
import modelo.bdsistema.Sys10005;


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
		this.content = "/WEB-INF/vista/configuracion/acceso/login.xhtml";
		//this.content = "/WEB-INF/vista/test/default.xhtml";
		this.footer = "/WEB-INF/vista/configuracion/contenido/footer.xhtml";
		this.title = "ERP - AVALON";
	}
	/**
	 * Listener del combo de Usuarios
	 * Carga el Sys10005 para el Usuario determinado
	 */
	public void effectChangeListenerComboUser() {
		/*if(this.idxUser != -5 ) {
			this.user = this.listUsers.get(this.idxUser-1);
			this.user.setClave("");
			this.fillModulos();
			//this.showMessage("INFO", "USUARIO SELECCIONADO " 
				//	+ this.user.getCodusr()+"\t"+ this.user.getDenusr());
		}else {
			this.showMessage("INFO", "USUARIO SIN SELECCIONAR");
			this.user = new Sys10005();
			this.listItemModulos = new ArrayList<>();
			this.listModulos = new ArrayList<>();
			this.idxModulo = - 5;
		}
		*/
	}
	/**
     * Listener del Combo de Modulos <br/> 
     * Carga en selsys10002 el bean del Modulo seleccionado.      
     */
    public void effectChangeListenerCombo() {
        /*if(this.idxModulo != -5) {
        	this.selsys10002 = this.listModulos.get(idxModulo-1);	
        	//this.showMessage("INFO", "MÓDULO SELECCIONADO " 
				//	+ this.selsys10002.getDenapli());
        }
        */
    }
    
    public void validarAcceso() {
   	 /*if (sAcceso.validaAcceso(user.getCodusr(), user.getClave(), String.valueOf(empresa.getCodemp()))) {
            
            paginaContenido = "vista/configuracion/contenido/panelPrincipal.xhtml";

            //Permite mostrar opciones especiales de menu en planeamiento
            if (selsys10002.getCodapli() == 8) {
                mostrarOpcionesEspecialesMenu = true;
            }

            fillMenu();
            actualizaCabecera();
            System.out.println("-------> Listando CCt0003");
            listacct0003=new ArrayList<Cct0003>();
            System.out.println("----> EMPRESA" +empresa.getCodemp());
            listacct0003=sConfiguracion.listarConfigSucursal(empresa.getCodemp());
            System.out.println("PASO :D !");
            System.out.println("----> LISTA" +listacct0003.size()+" --->" +listacct0003.get(0).getCos_nom());
            
            //CORRECTO
            listacct0002=new ArrayList<Cct0002>();
            listacct0002=sParametro.listarcct0002(empresa.getCodemp());
            
            System.out.println("----> SE EXTRAJERON LOS SPARAMETROS");
            appMain.setSucursal(listacct0003.get(0).getCos_nom());
            appMain.setCodsucursal(listacct0003.get(0).getCos_suc());
            appMain.setPerido(listacct0003.get(0).getCos_fpr());
            //appMain.setNquiebres(sAppMain.obtenerdigitos());
            appMain.setCodaguapotable(listacct0002.get(0).getCodserap());
            appMain.setCodalcantarillado(listacct0002.get(0).getCodseral());
            appMain.setCodconexos(listacct0002.get(0).getCodsercx());
            System.out.println(appMain.getNquiebres()+"XXXXXXXXXXXXXXXXDIGITOS >"+listacct0002.get(0).getCodserap());
            System.out.println(appMain.getNquiebres()+"XXXXXXXXXXXXXXXXDIGITOS >"+listacct0002.get(0).getCodseral());
            System.out.println(appMain.getNquiebres()+"XXXXXXXXXXXXXXXXDIGITOS >"+listacct0002.get(0).getCodsercx());

            System.out.println(appMain.getNquiebres()+"XXXXXXXXXXXXXXXXDIGITOS >");
            
            
            this.paginaContenido = "/WEB-INF/vista/configuracion/contenido/panelPrincipal.xhtml";
            this.showMessage("Informacion", "Bienvenido " + this.user.getDenusr());
            this.setCentro(this.paginaContenido);
   	 }
   	 else {
   		 this.showMessage("ERROR", "Usuario y/o clave incorrecto");
            paginaContenido = "/WEB-INF/vista/configuracion/acceso/login.xhtml";
            this.setCentro(this.paginaContenido);
   	 }*/
   }
    
	//Control de contenido
	private String header,content,footer;
	private String title,leftMenu;
	
	//Loggin
    private int idxUser,idxModulo;
	protected Sys10001 empresa;
	protected Sys10005 user;
	private ArrayList<Sys10002> listModulos;
    private ArrayList<SelectItem> listItemModulos;
    private ArrayList<Sys10005> listUsers; 
    private ArrayList<SelectItem> listItemUsers;
    
    
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
	public int getIdxUser() {
		return idxUser;
	}
	public void setIdxUser(int idxUser) {
		this.idxUser = idxUser;
	}
	public int getIdxModulo() {
		return idxModulo;
	}
	public void setIdxModulo(int idxModulo) {
		this.idxModulo = idxModulo;
	}
	public Sys10001 getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Sys10001 empresa) {
		this.empresa = empresa;
	}
	public Sys10005 getUser() {
		return user;
	}
	public void setUser(Sys10005 user) {
		this.user = user;
	}
	public ArrayList<Sys10002> getListModulos() {
		return listModulos;
	}
	public void setListModulos(ArrayList<Sys10002> listModulos) {
		this.listModulos = listModulos;
	}
	public ArrayList<SelectItem> getListItemModulos() {
		return listItemModulos;
	}
	public void setListItemModulos(ArrayList<SelectItem> listItemModulos) {
		this.listItemModulos = listItemModulos;
	}
	public ArrayList<Sys10005> getListUsers() {
		return listUsers;
	}
	public void setListUsers(ArrayList<Sys10005> listUsers) {
		this.listUsers = listUsers;
	}
	public ArrayList<SelectItem> getListItemUsers() {
		return listItemUsers;
	}
	public void setListItemUsers(ArrayList<SelectItem> listItemUsers) {
		this.listItemUsers = listItemUsers;
	}
}
