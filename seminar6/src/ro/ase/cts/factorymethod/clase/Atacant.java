package ro.ase.cts.factorymethod.clase;

public class Atacant extends Jucator {

	public Atacant(String nume, int varsta) {
		super(nume, varsta);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
