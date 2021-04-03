package ro.ase.cts.factorymethod.clase;

public class FactoryPortar implements AbstractFactory {

	@Override
	public Jucator getJucator(String nume, int varsta) {
		return new Portar(nume, varsta);
	}

}
