package scai.formazione.prime.textvalidation;

import javax.faces.bean.ManagedBean;

 
@ManagedBean
public class InputTextareaView {
     
    public void save(String username, String country, String region, String province, String city, String cap) {
    
    	System.out.println("username: "+username);
    	System.out.println("country: "+country);
    	System.out.println("region: "+region);
    	System.out.println("province: "+province);
    	System.out.println("city: "+city);
    	System.out.println("cap: "+cap);
    }
}
