package scai.formazione.prime;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.annotation.PostConstruct;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

import scai.formazione.prime.Document;
 
@ManagedBean(name="ttPaginatorView")
@ViewScoped
public class PaginatorView implements Serializable {
     
    private TreeNode root;
   
    @PostConstruct
    public void init() {
    	root = new DefaultTreeNode();
		TreeNode italy = new DefaultTreeNode(new Document("Italy", "-", "-", "-", "-", "-"), root);
		TreeNode france = new DefaultTreeNode(new Document("France", "-", "-", "-", "-", "-"), root);
		TreeNode piedmont = new DefaultTreeNode("document", new Document("Piedmont", "Turin", "Turin", "100", "TEST"), italy);
    }
 
    public TreeNode getRoot() {
        return root;
    }
}
