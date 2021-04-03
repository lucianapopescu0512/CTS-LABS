package ro.ase.cts.factorymethod.clase;

public class Fundas extends Jucator {

	public Fundas(String nume, int varsta) {
		super(nume, varsta);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fundas [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
