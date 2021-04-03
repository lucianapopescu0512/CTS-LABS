package ro.ase.cts.factorymethod.clase;

public abstract class Jucator {
	
	private String nume;
	private int varsta;
	
	public Jucator(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Jucator [nume=");
		builder.append(nume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}
	

}
