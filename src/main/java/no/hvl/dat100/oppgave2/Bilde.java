package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	private int id;
	private String bruker;
	private String dato;
	private String tekst;
	private String url;
	private int likes;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.tekst = tekst;
		this.url = url;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getTekst() {
		return tekst;
	}

	@Override
	public int getLikes() {
		return likes;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	@Override
	public void setDato(String dato) {
		this.dato = dato;
	}

	@Override
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		this.tekst = tekst;
		this.url = url;
	}
	
	public String getUrl() {
		return this.url;

	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getBruker() {
		return this.bruker;
	}
	public String getDato() {
		return this.dato;
	}

	@Override
	public String toString() {
		return "BILDE\n" + this.id + "\n" + this.bruker + "\n" + this.dato + "\n" + this.likes + "\n" + this.tekst  + "\n" + this.url +"\n";


	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
