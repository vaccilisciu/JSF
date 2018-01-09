package scai.formazione.prime;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
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
         
        for(int i = 0; i < 50; i++) {
            TreeNode node = new DefaultTreeNode(new Document("Node " + i, String.valueOf((int) (Math.random() * 1000)), "Document"), root);
             
            for(int j = 0; j < 5; j++) {
                new DefaultTreeNode(new Document("Node " + i + "." + j, String.valueOf((int) (Math.random() * 1000)), "Document"), node);
            }
        }
    }
 
    public TreeNode getRoot() {
        return root;
    }
}
