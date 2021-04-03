package ro.ase.cts.factorymethod.clase;

public class FactoryFundas implements AbstractFactory {

	@Override
	public Jucator getJucator(String nume, int varsta) {
		return new Fundas(nume, varsta);
	}

}
