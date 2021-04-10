package ro.ase.cts.adapter.clase;

public class AdapterCreditClasa extends Leasing implements CreditAbstract {

	public AdapterCreditClasa(String numeClient, float suma) {
		super(numeClient, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void oferaCredit() {
		super.creeazaLeasing();
		
	}

	
}
