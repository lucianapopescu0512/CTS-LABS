package ro.ase.cts.memento.clase;

public class Originator {
	private int nrSpectatori;
	private String numeEchipaGazda;
	private String numeEchipaOaspeti;
	private int nrBileteVandute;
	private int nrJandarmi;
	
	public Originator(int nrSpectatori, String numeEchimaGazda, String numeEchipaOaspeti, int nrBileteVandute,
			int nrJandarmi) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.numeEchipaGazda = numeEchimaGazda;
		this.numeEchipaOaspeti = numeEchipaOaspeti;
		this.nrBileteVandute = nrBileteVandute;
		this.nrJandarmi = nrJandarmi;
	}
	
	public Memento creareMemento() {
		return new Memento(nrSpectatori, numeEchipaGazda, numeEchipaOaspeti);
	}
	
	public void setMemento(Memento memento) {
		this.nrBileteVandute=memento.getNrSpectatori();
		this.numeEchipaGazda=memento.getNumeEchipaGazda();
		this.numeEchipaOaspeti=memento.getNumEchipaOaspeti();
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public void setNumeEchipaGazda(String numeEchipaGazda) {
		this.numeEchipaGazda = numeEchipaGazda;
	}

	public void setNumeEchipaOaspeti(String numeEchipaOaspeti) {
		this.numeEchipaOaspeti = numeEchipaOaspeti;
	}

	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}

	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Originator [nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", numeEchipaGazda=");
		builder.append(numeEchipaGazda);
		builder.append(", numeEchipaOaspeti=");
		builder.append(numeEchipaOaspeti);
		builder.append(", nrBileteVandute=");
		builder.append(nrBileteVandute);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append("]");
		return builder.toString();
	}


	
}
