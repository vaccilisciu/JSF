package scai.formazione.prime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.annotation.PostConstruct;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import scai.formazione.data.Utente;
import scai.formazione.data.dao.DAO;
import scai.formazione.data.dao.DAOImpl;
import scai.formazione.prime.Document;
 
@ManagedBean(name="ttPaginatorView")
@ViewScoped
public class PaginatorView implements Serializable {
     
    private TreeNode root;
    private DAO daoUtenti = new DAOImpl();
   
    @PostConstruct
    public void init() {
    	ArrayList<Utente> listaUtentiIta = daoUtenti.getListaUtentiIta();
    	root = new DefaultTreeNode();
		TreeNode italy = new DefaultTreeNode(new Document("Italy", "-", "-", "-", "-", "-"), root);
		TreeNode france = new DefaultTreeNode(new Document("France", "-", "-", "-", "-", "-"), root);
		TreeNode child = null;
		for(int i=0; i<listaUtentiIta.size(); i++) {
			String region = listaUtentiIta.get(i).getRegion();
			String province = listaUtentiIta.get(i).getProvince();
			String city = listaUtentiIta.get(i).getCity();
			String cap = listaUtentiIta.get(i).getCap();
			String username = listaUtentiIta.get(i).getName();
			child = new DefaultTreeNode("document", new Document(region, province, city, cap, username), italy);
		}
    }
 
    public TreeNode getRoot() {
        return root;
    }
}
