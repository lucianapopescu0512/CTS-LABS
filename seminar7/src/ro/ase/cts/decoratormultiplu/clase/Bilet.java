package ro.ase.cts.decoratormultiplu.clase;

public class Bilet implements OperatorAbstract {
	
	private String echipaGazda;
	private String echipaOaspeti;
	
	public Bilet() {
		super();
	}

	
	
	public Bilet(String echipaGazda, String echipaOaspeti) {
		super();
		this.echipaGazda = echipaGazda;
		this.echipaOaspeti = echipaOaspeti;
	}



	@Override
	public void rezervaBilet() {
		System.out.println(echipaGazda +" joaca contra "+echipaOaspeti);
		
	}

	@Override
	public String getEchipaGazda() {
		return echipaGazda;
	}

	@Override
	public String getEchipaOaspeti() {
		return echipaOaspeti;
	}
	
}
