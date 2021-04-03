package ro.ase.cts.factorymethod.clase;

public class Portar extends Jucator {

	public Portar(String nume, int varsta) {
		super(nume, varsta);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Portar [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
	

}
