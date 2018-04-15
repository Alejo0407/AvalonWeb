package controlador.acceso;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import modelo.bdsistema.Sys10007;

public class ObjetoMenu extends DefaultTreeNode {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 937148818233746687L;
	
    public ObjetoMenu(Object data) {
    	super(data);
    }

	public ObjetoMenu(Object data, TreeNode parent) {
		super(data,parent);
	}
	
	public ObjetoMenu(String type, Object data, TreeNode parent) {
		super(type,data,parent);
	}
	
	public ObjetoMenu(boolean visible) {
		this();
		this.setVisible(visible);
		
	}
	public ObjetoMenu() {
		super();
		this.setLeafIcon("tree_document.gif");
		this.setExpanded(false);
		setBranchContractedIcon("tree_folder_closed.gif");
        setBranchExpandedIcon("tree_folder_open.gif");
	}
	
	public void addChild(Object data, DefaultTreeNode child) {
		child = new DefaultTreeNode(data,this);
	}
	public String getBranchContractedIcon() {
		return contractedIcon;
	}
	public void setBranchContractedIcon(String contractedIcon) {
		this.contractedIcon = contractedIcon;
	}
	public String getBranchExpandedIcon() {
		return branchExpandedIcon;
	}
	public void setBranchExpandedIcon(String branchExpandedIcon) {
		this.branchExpandedIcon = branchExpandedIcon;
	}
	public Sys10007 getMenu() {
		return menu;
	}
	public void setMenu(Sys10007 menu) {
		this.menu = menu;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public String getLeafIcon() {
		return leafIcon;
	}

	public void setLeafIcon(String leafIcon) {
		this.leafIcon = leafIcon;
	}
	
	public boolean isExpanded() {
		return expanded;
	}

	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}
	private boolean expanded;
	private String leafIcon;
	private String contractedIcon;
	private String branchExpandedIcon;
	private Sys10007 menu;
	
	//ES REMPLAZADO POR EL ENCAPSULADO OBJECT
	//private String text;
    private boolean visible;
  
}
