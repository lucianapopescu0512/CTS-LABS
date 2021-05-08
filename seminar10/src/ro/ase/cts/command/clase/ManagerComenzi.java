package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {

	private List<ComandaAbstracta> comenzi;

	public ManagerComenzi() {
		super();
		this.comenzi = new ArrayList<>();
	}
	
	public void invocaComanda(ComandaAbstracta comanda) {
		comenzi.add(comanda);
	}
	
	public void executaComanda() {
		if(comenzi.size()>0) {
			comenzi.get(0).executa();
			comenzi.remove(0);
		}
	}
	
}
