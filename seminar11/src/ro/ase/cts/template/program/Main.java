package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorAbstract;
import ro.ase.cts.template.clase.SpectatorVIP;

public class Main {

	public static void main(String[] args) {
		SpectatorAbstract spectatorAbstract1=new Spectator("Alex");
		SpectatorAbstract spectatorAbstract2=new SpectatorVIP("Daniel","Loja VIP");
		spectatorAbstract1.intrarePeStadion();
		spectatorAbstract2.intrarePeStadion();
	}

}
