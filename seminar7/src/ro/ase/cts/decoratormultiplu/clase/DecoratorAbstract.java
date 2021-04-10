package ro.ase.cts.decoratormultiplu.clase;

public abstract class DecoratorAbstract implements OperatorAbstract {

	
	private OperatorAbstract bilet;
	
	
	public DecoratorAbstract(OperatorAbstract bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void rezervaBilet() {
		bilet.rezervaBilet();		
	}

	@Override
	public String getEchipaGazda() {
		return bilet.getEchipaGazda();
	}

	@Override
	public String getEchipaOaspeti() {
		return bilet.getEchipaOaspeti();
	}

}
