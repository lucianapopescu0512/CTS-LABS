package ro.ase.cts.factorymethod.main;

import ro.ase.cts.factorymethod.clase.AbstractFactory;
import ro.ase.cts.factorymethod.clase.FactoryAtacant;
import ro.ase.cts.factorymethod.clase.FactoryFundas;
import ro.ase.cts.factorymethod.clase.FactoryMijlocas;
import ro.ase.cts.factorymethod.clase.FactoryPortar;
import ro.ase.cts.factorymethod.clase.Jucator;

public class Program {

	
	private static void afisareInformatiiJucator(AbstractFactory abstractFactory,String nume, int varsta) {
		Jucator jucator=abstractFactory.getJucator(nume, varsta);
		System.out.println(jucator.toString());
	}
	
	public static void main(String[] args) {
		
		afisareInformatiiJucator(new FactoryAtacant(), "Andrei", 21);
		afisareInformatiiJucator(new FactoryPortar(), "Dan", 25);
		afisareInformatiiJucator(new FactoryFundas(), "Sergiu", 29);
		afisareInformatiiJucator(new FactoryMijlocas(), "Alex", 24);
	}

}
