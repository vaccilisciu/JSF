package scai.formazione.prime.registration;

import javax.faces.bean.ManagedBean;

import scai.formazione.data.Utente;
import scai.formazione.data.dao.DAO;
import scai.formazione.data.dao.DAOImpl;

 
@ManagedBean
public class RegistrationBean {
    
	private DAO daoUtente = new DAOImpl();
	
    public void save(String username, String country, String region, String province, String city, String cap) {
    
    	Utente nuovoUtente = new Utente(username, country, region, province, city, cap);
    	daoUtente.insertNuovoUtente(nuovoUtente);
    }
}
