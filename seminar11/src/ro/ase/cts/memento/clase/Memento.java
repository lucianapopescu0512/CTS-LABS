package ro.ase.cts.memento.clase;

public class Memento {
	private int nrSpectatori;
	private String numeEchipaGazda;
	private String numeEchipaOaspeti;
	
	public Memento(int nrSpectatori, String numeEchipaGazda, String numEchipaOaspeti) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeEchipaOaspeti = numEchipaOaspeti;
	}

	public int getNrSpectatori() {
		return nrSpectatori;
	}

	public String getNumeEchipaGazda() {
		return numeEchipaGazda;
	}

	public String getNumEchipaOaspeti() {
		return numeEchipaOaspeti;
	}
	
}
