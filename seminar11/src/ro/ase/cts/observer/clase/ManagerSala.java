package ro.ase.cts.observer.clase;

public class ManagerSala extends ManagerSalaAbstract{
	private String denumireSala;

	public ManagerSala(String denumireSala) {
		super();
		this.denumireSala = denumireSala;
	}
	
	public void anuntaMeci(String tipMeci) {
		super.notifica("Va avea un loc un mecii de "+tipMeci+" in sala "+denumireSala);
	}
}
