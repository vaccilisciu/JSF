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
         
        for(int i = 0; i < 11; i++) {
            TreeNode node = new DefaultTreeNode(new Document("country", "region", "province", "city", "cap", "username"), root);
            for(int j = 0; j < 2; j++) {
                new DefaultTreeNode(new Document("country", "region", "province", "city", "cap", "username"), node);
            }
        }
    }
 
    public TreeNode getRoot() {
        return root;
    }
}
