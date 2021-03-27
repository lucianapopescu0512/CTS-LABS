package ro.ase.cts.prototype.clase;

public class ClientStadion implements AbstractPrototype {
	
	private String denumire;
	private int varsta;
		
	private ClientStadion() {
		super();
	}

	public ClientStadion(String denumire, int varsta) {
		super();
		this.denumire = denumire;
		this.varsta = varsta;
	}

	@Override
	public AbstractPrototype copiaza() {
		ClientStadion clona = new ClientStadion();
		clona.denumire=this.denumire;
		clona.varsta=this.varsta;
		return clona;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClientStadion [denumire=");
		builder.append(denumire);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append("]");
		return builder.toString();
	}

		

}
