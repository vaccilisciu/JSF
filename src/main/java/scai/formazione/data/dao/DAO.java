package scai.formazione.data.dao;

import java.util.ArrayList;

import scai.formazione.data.Utente;

public interface DAO {

	public void insertNuovoUtente(Utente nuovoUtente);
	
	public ArrayList<Utente> getListaUtenti();
}
