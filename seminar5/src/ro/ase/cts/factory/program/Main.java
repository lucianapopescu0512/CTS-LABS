package ro.ase.cts.factory.program;

import ro.ase.cts.factory.clase.Factory;
import ro.ase.cts.factory.clase.FactorySingleton;
import ro.ase.cts.factory.clase.Jucator;
import ro.ase.cts.factory.clase.TipJucator;

public class Main {

	public static void main(String[] args) {
		
		FactorySingleton factorySingleton=FactorySingleton.getInstance();
		Jucator portar=factorySingleton.getJucator(TipJucator.PORTAR, "Andrei", 24);
		Jucator fundas=factorySingleton.getJucator(TipJucator.FUNDAS, "Daniel", 29);
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
	}

}
