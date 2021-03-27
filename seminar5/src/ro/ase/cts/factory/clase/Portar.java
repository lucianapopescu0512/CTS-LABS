package ro.ase.cts.factory.clase;

public class Portar extends Jucator {

	public Portar(String nume, int varsta) {
		super(nume, varsta);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Portar []");
		builder.append(super.toString());
		return builder.toString();
	}

	
}
