package ro.ase.cts.decoratormultiplu.program;

import ro.ase.cts.decoratormultiplu.clase.Bilet;
import ro.ase.cts.decoratormultiplu.clase.DecoratorAbstract;
import ro.ase.cts.decoratormultiplu.clase.DecoratorSustinereEchipa;
import ro.ase.cts.decoratormultiplu.clase.DecoratorUrare;

public class Main {

	public static void main(String[] args) {
		
		Bilet bilet=new Bilet("EchipaA","EchipaB");
		bilet.rezervaBilet();
		
		DecoratorAbstract meciGhencea=new DecoratorSustinereEchipa(bilet);
		meciGhencea.rezervaBilet();
		
		DecoratorAbstract meciPaste=new DecoratorUrare(bilet);
		meciPaste.rezervaBilet();
		
		DecoratorAbstract meciGhenceaPaste=new DecoratorSustinereEchipa(meciPaste);
		System.out.println();
		meciGhenceaPaste.rezervaBilet();
	}

}
