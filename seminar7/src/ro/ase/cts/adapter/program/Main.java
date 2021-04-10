package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterCredit;
import ro.ase.cts.adapter.clase.AdapterCreditClasa;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Main {
	
	public static void creeazaCredit(CreditAbstract credit) {
		credit.oferaCredit();
	}

	public static void main(String[] args) {
		
		Leasing leasing=new Leasing("Luciana", 100);
		AdapterCredit adapter=new AdapterCredit(leasing);
		creeazaCredit(adapter);
		
		AdapterCreditClasa adapterCreditClasa=new AdapterCreditClasa("Luciana", 200);
		creeazaCredit(adapterCreditClasa);
	}

}
