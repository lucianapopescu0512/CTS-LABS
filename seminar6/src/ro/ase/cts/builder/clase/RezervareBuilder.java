package ro.ase.cts.builder.clase;

public class RezervareBuilder implements AbstarctBuilder {

	
	private Rezervare rezervare;
	
	public RezervareBuilder() {
		rezervare=new Rezervare(1, false, false, false, false, "");
	}
	
	public RezervareBuilder(int cod) {
		rezervare=new Rezervare(cod, false, false, false, false, "");
	}

	public RezervareBuilder setCod(int cod) {
		this.rezervare.setCod(cod);
		return this;
	}

	public RezervareBuilder setMancareInclusa(boolean mancareInclusa) {
		this.rezervare.setMancareInclusa(mancareInclusa);
		return this;
	}

	public RezervareBuilder setScaunErgonomic(boolean scaunErgonomic) {
		this.rezervare.setScaunErgonomic(scaunErgonomic);
		return this;
	}

	public RezervareBuilder setBauturiRacoritoareIncluse(boolean bauturiRacoritoareIncluse) {
		this.rezervare.setBauturiRacoritoareIncluse(bauturiRacoritoareIncluse);
		return this;
	}

	public RezervareBuilder setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
		this.rezervare.setMuzicaAmbientalaPersonalizata(muzicaAmbientalaPersonalizata);
		return this;
	}

	public RezervareBuilder setGenMuzica(String genMuzica) {
		this.rezervare.setGenMuzica(genMuzica);
		return this;
	}
	
	@Override
	public Rezervare build() {
		return this.rezervare;
	}

}
