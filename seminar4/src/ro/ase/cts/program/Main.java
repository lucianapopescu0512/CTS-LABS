package ro.ase.cts.program;

import ro.ase.cts.clase.AsigurareMedicala;
import ro.ase.cts.clase.LazyAsigurareMedicala;
import ro.ase.cts.clase.Palat;

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
		
		Palat palat1=Palat.getInstance("George", 150.5f, 100);
		Palat palat2=Palat.getInstance("Carol", 250.5f, 200);
		
		
		System.out.println(palat1.toString());
		System.out.println(palat2.toString());
		
		palat1.setNumarCamere(300);
		palat2.setInaltime(250.4f);
		
		System.out.println(palat1.toString());
		System.out.println(palat2.toString());
		
		
		
	}

}
