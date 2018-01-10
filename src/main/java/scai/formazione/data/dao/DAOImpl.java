package scai.formazione.data.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
	
	public ArrayList<Utente> getListaUtenti() {
		ArrayList<Utente> listaUtenti = new ArrayList<Utente>();
		HashMap<Integer, Utente> collectionUtente = mySingleton.accessoCollectionUtente();
		for(Integer it: collectionUtente.keySet()){
			listaUtenti.add(collectionUtente.get(it));
		}
		return listaUtenti;
	}
}
