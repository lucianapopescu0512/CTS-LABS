package ro.ase.cts.observer.template.clase;

public class Spectator extends SpectatorAbstract {

	private String nume;
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void aseazareCoada() {
	System.out.println(nume+" s-a asezat la coada");	
	}

	@Override
	public void prezintaBilet() {
		System.out.println(nume+" a prezentat bilet");			
	}

	@Override
	public void realizeazaControlCorporal() {
		System.out.println(nume+" a fost controlat corporal");			
	}

	@Override
	public void ocupaLoc() {
		System.out.println(nume+" a ocupat loc");
	}

}
