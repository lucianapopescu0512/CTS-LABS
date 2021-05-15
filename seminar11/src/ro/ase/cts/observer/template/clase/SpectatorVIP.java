package ro.ase.cts.observer.template.clase;

public class SpectatorVIP extends SpectatorAbstract {

	private String nume;
	private String loja;	
	
	public SpectatorVIP(String nume, String loja) {
		super();
		this.nume = nume;
		this.loja = loja;
	}

	@Override
	public void aseazareCoada() {
		System.out.println(this.nume+" intra direct la intrarea VIP");
	}

	@Override
	public void prezintaBilet() {
		System.out.println(this.nume+" a prezentat bilet VIP");
	}

	@Override
	public void realizeazaControlCorporal() {
		System.out.println(this.nume+" a fost controlat corporal");
	}

	@Override
	public void ocupaLoc() {
		System.out.println(this.nume+" ocupa loc la loja "+this.loja);
	}

}
