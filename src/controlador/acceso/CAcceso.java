package controlador.acceso;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;

//import org.primefaces.context.RequestContext;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.model.TreeNode;

import controlador.costos.mt.confsucursales.SConfiguracionSucursales;
import controlador.costos.mt.paramsist.SParamSistemas;
import modelo.bdcostos.Cct0002;
import modelo.bdcostos.Cct0003;
import modelo.bdsistema.Sys10001;
import modelo.bdsistema.Sys10002;
import modelo.bdsistema.Sys10005;
import modelo.bdsistema.Sys10007;
import util.AppMain;
import util.CPaginaUtil;
import util.FacesCurrentInstance;
import util.FacesUtils;


@ManagedBean(name = "cAcceso")
@SessionScoped	
public class CAcceso extends FacesCurrentInstance implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8598913851605690413L;
	
	/**
	 * Construye el Bean e inicializa las variables necesarias
	 */
	@PostConstruct
	public void init() {
		this.header = "/WEB-INF/vista/configuracion/contenido/header.xhtml";
		this.content = "/WEB-INF/vista/configuracion/acceso/login.xhtml";
		//this.content = "/WEB-INF/vista/test/default.xhtml";
		this.footer = "/WEB-INF/vista/configuracion/contenido/footer.xhtml";
		this.title = "ERP - AVALON";
		
		setToContextSessionMap("cAcceso", this);
        appMain =new AppMain();
        setsAppMain(new sAppMain());
        cPaginaUtil = new CPaginaUtil();
        
        //Para obtener el objeto cPaginaUtil desde las otras clases hacer uso de esta línea.
        cPaginaUtil = (CPaginaUtil) FacesUtils.getExternalContext().getSessionMap().get("cPaginaUtil");
        sAcceso = new SAcceso();
        user = new Sys10005();

        
        listModulos = new ArrayList<Sys10002>();
        listItemModulos = new ArrayList<SelectItem>();
        sConfiguracion=new SConfiguracionSucursales();
        sParametro=new SParamSistemas();
        
        
        fillUsers();
        fillEmpresa(10);
	}
	
	//========FUNCTIONS
	private void fillEmpresa(int codemp) {
		empresa = sAcceso.listOneSys10001(codemp);
	}
	/**
	* Permite obtener los modulos a los que un usuario tiene acceso y carga el combo
	*/
	private final void fillModulos() {
		this.listItemModulos = new ArrayList<SelectItem>();
	    if (this.listItemModulos != null && !this.listItemModulos.isEmpty()) 
	    	this.listItemModulos.clear();
	    if (this.sAcceso.validaUsuario(this.user.getCodusr())) {
	    	this.listModulos = this.sAcceso.listModuloxUsuario(this.user.getCodusr()
	    			, String.valueOf(this.empresa.getCodemp()));
	    	int i = 1;
	        for (Sys10002 sys10002 : this.listModulos) {
	        	this.listItemModulos.add(new SelectItem(i, sys10002.getDenapli()));
	            i++;
	        }	
	        this.user = this.sAcceso.listOneSys10005(this.user.getCodusr());
	    } else {
	    	this.showMessage("ERROR", "Error en la carga de los módulos...");
	    }
	}
	/**
	 * Permite obtener los Usuarios en la Base de datos
     */
	private final void fillUsers() {
    	this.listItemUsers = new ArrayList<>();
    	if(this.listItemUsers != null && !this.listItemUsers.isEmpty())
    		this.listItemUsers.clear();
    	
    	this.listUsers = this.sAcceso.listAllSys10005();
    	int i = 1;
    	for(Sys10005 usr:this.listUsers) {
    		this.listItemUsers.add(new SelectItem(i,usr.getCodusr()+"\t"+usr.getDenusr()));
    		i++;
    	}
    }
	public final void fillMenu() { 
    	
		System.out.println("Ingreso al metodo FillMenu()...");
    	
    	TreeNode menuNode = null;
    	TreeNode principalNode = null;
    	TreeNode subNode = null;
    	TreeNode subsubNode = null;
    	TreeNode subsubsubNode = null;
        String[] campo = {"cpopup", "cidopcion", "codapli"};
        String[] relacion = {"=", "!=", "="};
        String[] campo1 = {"lprincipal", "codapli"};
        String[] relacion1 = {"=", "="};
        String[] value1 = {"1", "" + selsys10002.getCodapli() + ""};

        if (selsys10002.getCodapli() != 8) {
            listaMenuPrincipal = sAcceso.listAllComplexWhere(campo1, relacion1, value1, "cidopcion");
        } else {
            System.out.println("Ingreso a MenuPrincipal especial opcMenuPlaneamiento:" + opcMenuPlaneamiento + " modulo:" + selsys10002.getCodapli());
            //opcMenuPlaneamiento default para 1
            listaMenuPrincipal = sAcceso.listAllComplexWhereOpcMenu(opcMenuPlaneamiento, selsys10002.getCodapli(), campo1, relacion1, value1, "cidopcion");
        }
        
        listaSubMenu = null;
        ArrayList<Sys10007> listaSubSubMenu = null;
        ArrayList<Sys10007> listaSubSubSubMenu = null;
        //Nodo principal
        menuNode = addNode(null, "ERP - AVALON", new Sys10007("", 0, "", 0, 0, "", "", "", "", "", "", "", "", ""), false);
        setModel((ObjetoMenu)menuNode);
        
        
      //Primer Nodo
        for (Sys10007 sys10007 : listaMenuPrincipal) {
        	
        	System.out.println("INFO...  MENUNODE -> "+menuNode.toString()+"\nSys10007 -> "+sys10007.getDesopcion() );
        	
            principalNode = addNode(menuNode, sys10007.getDesopcion(), sys10007, true);
            objetoMenuSelected = (ObjetoMenu) principalNode;
            objetoMenuSelected.setExpanded(false);
            System.out.println("Obj PRINCIPAL: " + ((ObjetoMenu)objetoMenuSelected).getMenu().getDesopcion());
            String[] valueSubMenu = {"'" + sys10007.getCidopcion() + "'", "'" + sys10007.getCidopcion() + "'", "" + selsys10002.getCodapli() + ""};

            if (selsys10002.getCodapli() != 8) {
                
                listaSubMenu = sAcceso.listAllComplexWhere(campo, relacion, valueSubMenu, "cidopcion");
            } else {
                System.out.println("Ingreso a SubMenu especial opcMenuPlaneamiento:" + opcMenuPlaneamiento + " modulo:" + selsys10002.getCodapli());
                listaSubMenu = sAcceso.listAllComplexWhereOpcMenu(opcMenuPlaneamiento, selsys10002.getCodapli(), campo, relacion, valueSubMenu, "cidopcion");
            }

            for (Sys10007 sys100071 : listaSubMenu) {
                if (sys100071.getLdespliega() == 1) {
                    subNode = addNode(principalNode, sys100071.getDesopcion().trim(), sys100071, true);
                    objetoMenuSelected = (ObjetoMenu) subNode;
                    objetoMenuSelected.setExpanded(false);
                    System.out.println("SUBMENU: " + ((ObjetoMenu)objetoMenuSelected).getMenu().getDesopcion());
                    String[] valueSubSubMenu = {"'" + sys100071.getCidopcion() + "'", "'" + sys100071.getCidopcion() + "'", "" + selsys10002.getCodapli() + ""};

                    if (selsys10002.getCodapli() != 8) {
                        listaSubSubMenu = sAcceso.listAllComplexWhere(campo, relacion, valueSubSubMenu, "cidopcion");
                    } else {
                        System.out.println("Ingreso a SubSubMenu especial opcMenuPlaneamiento:" + opcMenuPlaneamiento + " modulo:" + selsys10002.getCodapli());
                        listaSubSubMenu = sAcceso.listAllComplexWhereOpcMenu(opcMenuPlaneamiento, selsys10002.getCodapli(), campo, relacion, valueSubSubMenu, "cidopcion");
                    }

                    for (Sys10007 sys100072 : listaSubSubMenu) {
                        if (sys100072.getLdespliega() == 1) {
                            //Agrega los Nodos si es que se despliega
                            subsubNode = addNode(subNode, sys100072.getDesopcion().trim(), sys100072, true);
                            objetoMenuSelected = (ObjetoMenu) subsubNode;
                            objetoMenuSelected.setExpanded(false);
                            System.out.println("Obj SUB SUB MENU: " + ((ObjetoMenu)objetoMenuSelected).getMenu().getDesopcion());
                            String[] valueSubSubSubMenu = {"'" + sys100072.getCidopcion() + "'", "'" + sys100072.getCidopcion() + "'", "" + selsys10002.getCodapli() + ""};

                            if (selsys10002.getCodapli() != 8) {
                                listaSubSubSubMenu = sAcceso.listAllComplexWhere(campo, relacion, valueSubSubSubMenu, "cidopcion");
                            } else {
                                System.out.println("Ingreso a SubSubSubMenu especial opcMenuPlaneamiento:" + opcMenuPlaneamiento + " modulo:" + selsys10002.getCodapli());
                                listaSubSubSubMenu = sAcceso.listAllComplexWhereOpcMenu(opcMenuPlaneamiento, selsys10002.getCodapli(), campo, relacion, valueSubSubSubMenu, "cidopcion");
                            }

                            for (Sys10007 sys100073 : listaSubSubSubMenu) {
                                if (sys100073.getLdespliega() == 1) {
                                    //Agrega los Nodos si es que se despliega
                                    subsubsubNode = addNode(subsubNode, sys100073.getDesopcion().trim(), sys100073, true);
                                    objetoMenuSelected = (ObjetoMenu) subsubsubNode;
                                    objetoMenuSelected.setExpanded(false);
                                    System.out.println("Obj SUB SUB SUB MENU: " + ((ObjetoMenu)objetoMenuSelected).getMenu().getDesopcion());
                                } else {
                                    subsubsubNode = addNode(subsubNode, null, sys100073, true);
                                }
                            }
                        } else {
                            subsubNode = addNode(subNode, null, sys100072, true);
                        }
                    }
                } else {
                    addNode(principalNode, null, sys100071, true);
                }
            }
        }
        setModel(menuNode);
        System.out.println("MODELO CON N HIJOS: " + this.getModel().getChildCount());
    }
	
	/**
	 * Crea un nodo, y se lo añade al padre
	 * @param parent es el nodo padre
	 * @param title es el label que tendra el elemento
	 * @param menu la data interna del menu
	 * @param visible si el mismo sera visible
	 * @return el nodo creado
	 */
	private TreeNode addNode(TreeNode parent, String title, Sys10007 menu, boolean visible) {
    	ObjetoMenu userObject = new ObjetoMenu(
    			(title != null?title:menu.getDesopcion()),
    			parent);
    	
    	userObject.setMenu(menu);
        if (title != null) {
        	userObject.setVisible(visible);
            userObject.setExpanded(true);
        }

        return userObject;
    }
	/**
     * Obtiene el nombre de la carpeta que se le ha asignado en el proyecto
     * @param modulo int <br/> Es el codigo del módulo del que se desea obtener <br/>
     * el nombre de carpeta en la vista del proyecto
     * @return nombre de la carpeta que tiene asignada en el proyecto
     */
    public String getNomCarpetaxModulo(int modulo) {
        String carpeta = "";
        switch (modulo) {
            case 1:
                carpeta = "administracion";
                break;
            case 2:
                carpeta = "contabilidad";
                break;
            case 3:
                carpeta = "finanzas";
                break;
            case 4:
                carpeta = "costos";
                break;
            case 5:
                carpeta = "logistica";
                break;
            case 6:
                carpeta = "almacenes";
                break;
            case 7:
                carpeta = "nomina";
                break;
            case 8:
                carpeta = "planeamiento";
                break;
            case 9:
                carpeta = "patrimonio";
                break;
            case 10:
                carpeta = "tramite_documentario";
                break;
            case 11:
                carpeta = "hotelero";
                break;
            case 12:
                carpeta = "flotas";
                break;
            case 13:
                carpeta = "ventas";
                break;
            case 14:
                carpeta = "operacional";
                break;
        }

        return carpeta;
    }
    
	/**
	 * Listener del combo de Usuarios
	 * Carga el Sys10005 para el Usuario determinado
	 */
	public void effectChangeListenerComboUser() {
		if(this.idxUser != -5 ) {
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
		
	}
	/**
     * Listener del Combo de Modulos <br/> 
     * Carga en selsys10002 el bean del Modulo seleccionado.      
     */
    public void effectChangeListenerCombo() {
        if(this.idxModulo != -5) {
        	this.selsys10002 = this.listModulos.get(idxModulo-1);	
        	//this.showMessage("INFO", "MÓDULO SELECCIONADO " 
				//	+ this.selsys10002.getDenapli());
        }
    }
    
    /**
     * Controla el cambio de evento en el Nodo Menu
     * @param event
     */
    public void onNodeSelect(NodeSelectEvent event) {
    	if(this.getObjetoMenuSelected() != null) {
			if(this.getObjetoMenuSelected().isLeaf()) {
				this.setContent("/WEB-INF/vista/"
						+ ((ObjetoMenu)this.getObjetoMenuSelected()).getMenu().getDespagina());
				this.showMessage("INFO", this.getContent());
				//RequestContext.getCurrentInstance().update("content:pnlContenido");
			}
		}
		else 
			this.showMessage("ERROR", "Null:Objeto seleccionado inválido");
    }
    /**
     * Funcion que permite el cierre de sesion del Usuario
     * @param actionEvent
     */
    public void cerrarSesion(ActionEvent actionEvent) {
        FacesContext context = FacesContext.getCurrentInstance();
        HttpSession session = (HttpSession) context.getExternalContext().getSession(false);
        session.invalidate();
        this.showMessage("Información", "La sesión se ha cerrado");
    }
    
    /**
     * Permite actualizar la Cabecera segun el módulo al que se ingrese
     */
    public void actualizaCabecera() {
        //cambiamos de cabecera según el modulo ingresado .
        String carpeta = getNomCarpetaxModulo(selsys10002.getCodapli());
        String rutaCab = carpeta + "/contenido/cabecera.xhtml";
        System.out.println("RUTA CAB " + rutaCab);
        cPaginaUtil.refrescarCabecera(rutaCab);
    }
    
    /**
     * Valida el ingreso de un usuario y a su vez carga el menu con las 
     * opciones respectivas
     */
    public void validarAcceso() {
    	if (sAcceso.validaAcceso(user.getCodusr(), user.getClave(), String.valueOf(empresa.getCodemp()))) { 
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
	            
	            
	        this.showMessage("Informacion", "Bienvenido " + this.user.getDenusr());
	        this.setContent("/WEB-INF/vista/configuracion/contenido/panelPrincipal.xhtml");
	        this.setLeftMenu("/WEB-INF/vista/configuracion/menu/menuPrincipal.xhtml");
	   	}
	   	else {
	   		this.showMessage("ERROR", "Usuario y/o clave incorrecto");
	        this.setContent("/WEB-INF/vista/configuracion/acceso/login.xhtml");
	        this.setLeftMenu(null);
	   	}
    	System.gc();
    }
    
    
    
    
    
    //====PRIVATE
    private String opcMenuPlaneamiento = "1";
    private TreeNode model;
    private TreeNode objetoMenuSelected;
    private boolean mostrarOpcionesEspecialesMenu = false;
    private CPaginaUtil cPaginaUtil;
    private SConfiguracionSucursales sConfiguracion;
    private ArrayList<Cct0003> listacct0003;
    private ArrayList<Cct0002> listacct0002; 
    private SParamSistemas sParametro;
    private AppMain appMain;
    private sAppMain sAppMain;
    
    //Control de contenido
	private String header,content,footer;
	private String title,leftMenu;
	
	
    private Sys10002 selsys10002;
    private Sys10002 selsys10002_2;
    private SAcceso sAcceso;
	//Loggin
    private int idxUser,idxModulo;
	protected Sys10001 empresa;
	protected Sys10005 user;
	private ArrayList<Sys10002> listModulos;
    private ArrayList<SelectItem> listItemModulos;
    private ArrayList<Sys10005> listUsers; 
    private ArrayList<SelectItem> listItemUsers;
    
    //MENU
	private ArrayList<Sys10007> listaMenuPrincipal;
	private ArrayList<Sys10007> listaSubMenu;
    
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
	public String getOpcMenuPlaneamiento() {
		return opcMenuPlaneamiento;
	}
	public void setOpcMenuPlaneamiento(String opcMenuPlaneamiento) {
		this.opcMenuPlaneamiento = opcMenuPlaneamiento;
	}
	public TreeNode getModel() {
		return model;
	}
	public void setModel(TreeNode model) {
		this.model = model;
	}
	public TreeNode getObjetoMenuSelected() {
		return objetoMenuSelected;
	}
	public void setObjetoMenuSelected(TreeNode objetoMenuSelected) {
		this.objetoMenuSelected = objetoMenuSelected;
	}
	public boolean isMostrarOpcionesEspecialesMenu() {
		return mostrarOpcionesEspecialesMenu;
	}
	public void setMostrarOpcionesEspecialesMenu(boolean mostrarOpcionesEspecialesMenu) {
		this.mostrarOpcionesEspecialesMenu = mostrarOpcionesEspecialesMenu;
	}
	public CPaginaUtil getcPaginaUtil() {
		return cPaginaUtil;
	}
	public void setcPaginaUtil(CPaginaUtil cPaginaUtil) {
		this.cPaginaUtil = cPaginaUtil;
	}
	public SConfiguracionSucursales getsConfiguracion() {
		return sConfiguracion;
	}
	public void setsConfiguracion(SConfiguracionSucursales sConfiguracion) {
		this.sConfiguracion = sConfiguracion;
	}
	public ArrayList<Cct0003> getListacct0003() {
		return listacct0003;
	}
	public void setListacct0003(ArrayList<Cct0003> listacct0003) {
		this.listacct0003 = listacct0003;
	}
	public ArrayList<Cct0002> getListacct0002() {
		return listacct0002;
	}
	public void setListacct0002(ArrayList<Cct0002> listacct0002) {
		this.listacct0002 = listacct0002;
	}
	public SParamSistemas getsParametro() {
		return sParametro;
	}
	public void setsParametro(SParamSistemas sParametro) {
		this.sParametro = sParametro;
	}
	public AppMain getAppMain() {
		return appMain;
	}
	public void setAppMain(AppMain appMain) {
		this.appMain = appMain;
	}
	public sAppMain getsAppMain() {
		return sAppMain;
	}
	public void setsAppMain(sAppMain sAppMain) {
		this.sAppMain = sAppMain;
	}
	public Sys10002 getSelsys10002() {
		return selsys10002;
	}
	public void setSelsys10002(Sys10002 selsys10002) {
		this.selsys10002 = selsys10002;
	}
	public Sys10002 getSelsys10002_2() {
		return selsys10002_2;
	}
	public void setSelsys10002_2(Sys10002 selsys10002_2) {
		this.selsys10002_2 = selsys10002_2;
	}
	public SAcceso getsAcceso() {
		return sAcceso;
	}
	public void setsAcceso(SAcceso sAcceso) {
		this.sAcceso = sAcceso;
	}
}
