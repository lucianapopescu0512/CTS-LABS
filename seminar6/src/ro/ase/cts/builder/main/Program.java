package ro.ase.cts.builder.main;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;
import ro.ase.cts.builder.clase.RezervareBuilderV2;

public class Program {

	public static void main(String[] args) {
	
		Rezervare rezervare=new Rezervare(1, false, true, true, false, "Jazz");
		System.out.println(rezervare.toString());
		Rezervare rezervare2=new RezervareBuilder().setCod(2).setBauturiRacoritoareIncluse(true).setMuzicaAmbientalaPersonalizata(true).build();
		System.out.println(rezervare2.toString());
		Rezervare rezervare3=new RezervareBuilder().setCod(3).setGenMuzica("Rock").build();
		Rezervare rezervare4=new RezervareBuilder(4).setBauturiRacoritoareIncluse(true).build();
		System.out.println(rezervare3.toString());
		System.out.println(rezervare4.toString());
		
		RezervareBuilderV2 builder=new RezervareBuilderV2().setBauturiRacoritoareIncluse(true).setMancareInclusa(true);
		Rezervare rezervare5=builder.setCod(5).build();
		Rezervare rezervare6=builder.setCod(6).build();
		System.out.println(rezervare5.toString());
		System.out.println(rezervare6.toString());
	}

}
