package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMeci {
	List<Memento> listaMeciuri;

	public ManagerMeci() {
		super();
		this.listaMeciuri = new ArrayList<>();
	}
	
	public void adaugaMemento(Memento memento) {
		this.listaMeciuri.add(memento);
	}
	
	public Memento getMemento(int pozitie) {
		if(pozitie>=0&&pozitie<this.listaMeciuri.size()) {
			return this.listaMeciuri.get(pozitie);
		}
		else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public Memento undo() {
		return this.listaMeciuri.get(this.listaMeciuri.size()-1);
	}
}
