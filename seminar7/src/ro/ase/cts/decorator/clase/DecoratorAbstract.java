package ro.ase.cts.decorator.clase;

public abstract  class DecoratorAbstract implements CardAbstract {
	
	private CardAbstract cardAbstract;

	public DecoratorAbstract(CardAbstract cardAbstract) {
		super();
		this.cardAbstract = cardAbstract;
	}

	@Override
	public void platestePOS() {
		cardAbstract.platestePOS();
		
	}

	@Override
	public void platesteOnline() {
		cardAbstract.platesteOnline();
		
	}
	
	
	public CardAbstract getCardAbstract() {
		return cardAbstract;
	}

	public abstract void platesteContactless();
		
}
