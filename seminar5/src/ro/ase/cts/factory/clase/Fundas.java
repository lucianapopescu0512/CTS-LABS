package ro.ase.cts.factory.clase;

public class Fundas extends Jucator{

	public Fundas(String nume, int varsta) {
		super(nume, varsta);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fundas []");
		builder.append(super.toString());
		return builder.toString();
	}


}
