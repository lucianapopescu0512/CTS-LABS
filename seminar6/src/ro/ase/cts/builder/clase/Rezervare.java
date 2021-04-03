package ro.ase.cts.builder.clase;

public class Rezervare {

	private int cod;
	private boolean mancareInclusa;
	private boolean scaunErgonomic;
	private boolean bauturiRacoritoareIncluse;
	private boolean muzicaAmbientalaPersonalizata;
	private String genMuzica;
	
	public Rezervare(int cod, boolean mancareInclusa, boolean scaunErgonomic, boolean bauturiRacoritoareIncluse,
			boolean muzicaAmbientalaPersonalizata, String genMuzica) {
		super();
		this.cod = cod;
		this.mancareInclusa = mancareInclusa;
		this.scaunErgonomic = scaunErgonomic;
		this.bauturiRacoritoareIncluse = bauturiRacoritoareIncluse;
		this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
		this.genMuzica = genMuzica;
	}


	public void setCod(int cod) {
		this.cod = cod;
	}

	public void setMancareInclusa(boolean mancareInclusa) {
		this.mancareInclusa = mancareInclusa;
	}

	public void setScaunErgonomic(boolean scaunErgonomic) {
		this.scaunErgonomic = scaunErgonomic;
	}

	public void setBauturiRacoritoareIncluse(boolean bauturiRacoritoareIncluse) {
		this.bauturiRacoritoareIncluse = bauturiRacoritoareIncluse;
	}

	public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
		this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [cod=");
		builder.append(cod);
		builder.append(", mancareInclusa=");
		builder.append(mancareInclusa);
		builder.append(", scaunErgonomic=");
		builder.append(scaunErgonomic);
		builder.append(", bauturiRacoritoareIncluse=");
		builder.append(bauturiRacoritoareIncluse);
		builder.append(", muzicaAmbientalaPersonalizata=");
		builder.append(muzicaAmbientalaPersonalizata);
		builder.append(", genMuzica=");
		builder.append(genMuzica);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
