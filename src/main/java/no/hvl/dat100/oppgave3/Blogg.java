package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	public int nesteledig = 0;
	public Innlegg[] innlegg;

	public Blogg() {
		innlegg = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innlegg = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		int antall = 0;

		for (int i = 0; i < innlegg.length; i++) {
			if (innlegg[i] != null) {
				antall++;
			}
		}

		return antall;
	}
	
	public Innlegg[] getSamling() {
		return this.innlegg;
	}
	
	public int finnInnlegg(Innlegg innlegg) {

		int peker;

		for (int i = 0; i < getAntall(); i++) {
			if (innlegg.getId() == this.innlegg[i].getId()) {
				return i;
			}
		}
		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
        return finnInnlegg(innlegg) >= 0;
	}

	public boolean ledigPlass() {
		 return getAntall() < this.innlegg.length;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if(ledigPlass() && !finnes(innlegg)) {
				this.innlegg[nesteledig] = innlegg;
				nesteledig++;
				return true;
		}
		return false;
	}
	
	public String toString() {

		String ut = "";

		for (int i = 0; i < nesteledig; i++) {
			ut += this.innlegg[i].toString();
		}
		return getAntall() + "\n" + ut;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[] nyInnlegg = new Innlegg[this.innlegg.length*2];

		for(int i = 0; i < nesteledig; i++) {
			nyInnlegg[i] = this.innlegg[i];
		}
		this.innlegg = nyInnlegg;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		boolean lagtTil = false;

		if (!finnes(innlegg)) {
			if (ledigPlass()) {
				leggTil(innlegg);
				lagtTil = true;
			} else {
				utvid();
				leggTil(innlegg);
				lagtTil = true;
			}
		}
		return lagtTil;
	}
	
	public boolean slett(Innlegg innlegg) {
		
		if(finnes(innlegg)) {
			this.innlegg[finnInnlegg(innlegg)] = null;
//			this.innlegg[finnInnlegg(innlegg)] = this.innlegg[nesteledig-1];
//			this.innlegg[nesteledig-1] = null;
			return true;
		}
		return false;
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}