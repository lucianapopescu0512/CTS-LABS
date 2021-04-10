package ro.ase.cts.decoratormultiplu.clase;

public class DecoratorSustinereEchipa extends DecoratorAbstract{

	public DecoratorSustinereEchipa(OperatorAbstract bilet) {
		super(bilet);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("Sustinem "+super.getEchipaGazda());
	}
	
}
