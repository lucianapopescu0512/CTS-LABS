package ro.ase.cts.program;

import ro.ase.cts.clase.AsigurareMedicala;
import ro.ase.cts.clase.LazyAsigurareMedicala;

public class Main {

	public static void main(String[] args) {
		
		AsigurareMedicala asigurareMedicala1 = AsigurareMedicala.getInstance();
		AsigurareMedicala asigurareMedicala2 = AsigurareMedicala.getInstance();
		
		asigurareMedicala1.setId(2);
		asigurareMedicala2.setContributie(350.4f);

		System.out.println(asigurareMedicala1.toString());
		System.out.println(asigurareMedicala2.toString());
		
		LazyAsigurareMedicala lazyAsigurareMedicala1=LazyAsigurareMedicala.getInstance(1, "Luciana", 205.3f);
		LazyAsigurareMedicala lazyAsigurareMedicala2=LazyAsigurareMedicala.getInstance(2, "Dan", 244.3f);
		
		System.out.println(lazyAsigurareMedicala1.toString());
		System.out.println(lazyAsigurareMedicala2.toString());
	}

}
