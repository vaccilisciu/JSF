package scai.formazione.data.dao;

import scai.formazione.data.Singleton;
import scai.formazione.data.Utente;

public class DAOImpl implements DAO{

	private Singleton mySingleton;
	
	public DAOImpl() {
		mySingleton = Singleton.build();
	}
	
	public void insertNuovoUtente(Utente nuovoUtente) {
		Integer lastIndiceUtente = mySingleton.getIndiceUtente();
		mySingleton.accessoCollectionUtente().put(lastIndiceUtente, nuovoUtente);
		mySingleton.setIndiceUtente(++lastIndiceUtente);
	}
	
	public static void main(String[] args) {
		
	}
}
