package scai.formazione.prime.registration;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;

import scai.formazione.bean.ControllerBean;
import scai.formazione.data.Utente;
import scai.formazione.data.dao.DAO;
import scai.formazione.data.dao.DAOImpl;

 
@ManagedBean
public class RegistrationBean {
    
	
	private DAO daoUtente = new DAOImpl();
	private ControllerBean controllerNavigation = new ControllerBean();
	
    public void save(String username, String country, String region, String province, String city, String cap) {
    
    	Utente nuovoUtente = new Utente(username, country, region, province, city, cap);
    	daoUtente.insertNuovoUtente(nuovoUtente);
    	ArrayList<Utente> listaUtenti = daoUtente.getListaUtenti();
    	for(int i=0; i<listaUtenti.size(); i++)
    		System.out.println(listaUtenti.get(i).toString());
    }
}
