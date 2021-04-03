package ro.ase.cts.factorymethod.clase;

public class Mijlocas extends Jucator{

	public Mijlocas(String nume, int varsta) {
		super(nume, varsta);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mijlocas [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
