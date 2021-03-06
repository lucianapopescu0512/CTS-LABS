package ro.ase.cts.builder.clase;

public class RezervareBuilderV2 implements AbstarctBuilder {

	private int cod;
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturiRacoritoareIncluse;
	private boolean muzicaAmbientalaPersonalizata;
	private String genMuzica;

	public RezervareBuilderV2() {

	}

	public RezervareBuilderV2 setCod(int cod) {
		this.cod = cod;
		return this;
	}

	public RezervareBuilderV2 setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
		return this;
	}

	public RezervareBuilderV2 setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
		return this;
	}

	public RezervareBuilderV2 setBauturiRacoritoareIncluse(boolean bauturiRacoritoareIncluse) {
		this.bauturiRacoritoareIncluse = bauturiRacoritoareIncluse;
		return this;
	}

	public RezervareBuilderV2 setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
		this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
		return this;
	}

	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	@Override
	public Rezervare build() {
		return new Rezervare(cod, mancareInclusa, scaunErgonomic, bauturiRacoritoareIncluse, muzicaAmbientalaPersonalizata, genMuzica);
	}

}
