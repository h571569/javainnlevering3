package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Tekst extends Innlegg {


	protected int likes;
	protected int id;
	protected String bruker;
	protected String tekst;
	protected String dato;


	@Override
	public String getDato() {
		return dato;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getBruker() {
		return bruker;
	}

	public String getTekst() {
		return tekst;
	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public void setDato(String dato) {
		this.dato = dato;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void setBruker(String bruker) {
		this.bruker = bruker;
	}


	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		this.likes = likes;
	}
	


	@Override
	public String toString() {
		return "TEKST\n" + this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + this.likes + "\n" + this.tekst  + "\n";


	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
