package ro.ase.cts.factorymethod.clase;

public class FactoryAtacant implements AbstractFactory {

	@Override
	public Jucator getJucator(String nume, int varsta) {
		return new Atacant(nume, varsta);
	}

}
