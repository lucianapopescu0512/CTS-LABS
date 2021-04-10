package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorContactless;
import ro.ase.cts.decorator.clase.DecoratorContactlessTelefon;

public class Main {

	public static void main(String[] args) {
		Card card=new Card("Luciana", "2039548459");
		card.platesteOnline();
		card.platestePOS();
		
		DecoratorAbstract decorator=new DecoratorContactless(card);
		decorator.platesteContactless();
		DecoratorAbstract decorator2=new DecoratorContactlessTelefon(card);
		decorator2.platesteContactless();
	}

}
