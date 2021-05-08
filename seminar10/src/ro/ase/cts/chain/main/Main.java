package ro.ase.cts.chain.main;

import ro.ase.cts.chain.clase.Cont;
import ro.ase.cts.chain.clase.ContCredit;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContEconomii;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cont contCurent=new ContCurent(200);
		Cont contCredit=new ContCredit(100);
		Cont contEconomii=new ContEconomii(300);
		
		contCurent.setCont(contEconomii);
		contEconomii.setCont(contCredit);
		
		contCurent.realizeazaPlata(150);
		contCurent.realizeazaPlata(250);
		contCurent.realizeazaPlata(130);
	}

}
