package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		
		ManagerComenzi managerComenzi=new ManagerComenzi();
		ContBancar contBancar=new ContBancar("Luciana");
		managerComenzi.invocaComanda(new ComandaConstituire(contBancar, 250));
		managerComenzi.invocaComanda(new ComandaDepunere(contBancar, 250));
		
		managerComenzi.executaComanda();
		
		managerComenzi.invocaComanda(new ComandaRetragere(contBancar, 250));

		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		
		managerComenzi.invocaComanda(new ComandaRetragere(contBancar, 350));
		managerComenzi.executaComanda();
	}

}
