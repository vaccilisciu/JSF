package scai.formazione.data;

import java.util.HashMap;

public class Singleton {

	private HashMap<Integer, Utente> collectionUtenti = new HashMap<Integer, Utente>();
	private static Singleton mySingleton;
	private int indiceUtente = 0;

	/**
	 * Inserimento statico di utenti per i primi test di lettura dopo
	 * inizializzazione Singleton
	 */
	private Singleton() {
		collectionUtenti.put(indiceUtente++, new Utente("rosario", "italy", "piedmont", "turin", "turin", "10100"));
	}

	/**
	 * Metodo di build della mia classe Singleton
	 * 
	 * @return Inizializzazione unica (statica) per la mia collezione di utenti
	 */
	public static Singleton build() {
		if (mySingleton == null) {
			mySingleton = new Singleton();
		}
		return mySingleton;
	}

	public HashMap<Integer, Utente> accessoCollectionUtente() {
		return collectionUtenti;
	}
	
	public int getIndiceUtente() {
		return indiceUtente;
	}

	public void setIndiceUtente(Integer indiceUtente) {
		this.indiceUtente = indiceUtente;
	}
}
