package ro.ase.cts.factorymethod.clase;

public class FactoryMijlocas implements AbstractFactory{

	@Override
	public Jucator getJucator(String nume, int varsta) {
		return new Mijlocas(nume, varsta);
	}

}
