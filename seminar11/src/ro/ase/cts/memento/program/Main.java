package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMeci;
import ro.ase.cts.memento.clase.Memento;
import ro.ase.cts.memento.clase.Originator;

public class Main {

	public static void main(String[] args) {
		Originator meci=new Originator(200, "E1", "E2", 150, 10);
		Memento memento=meci.creareMemento();
		ManagerMeci managerMeci=new ManagerMeci();
		managerMeci.adaugaMemento(memento);
		
		meci.setNrBileteVandute(100);
		meci.setNumeEchipaGazda("E3");
		managerMeci.adaugaMemento(meci.creareMemento());
		
		System.out.println(meci.toString());
		meci.setMemento(managerMeci.getMemento(0));
		System.out.println(meci.toString());
	}

}
