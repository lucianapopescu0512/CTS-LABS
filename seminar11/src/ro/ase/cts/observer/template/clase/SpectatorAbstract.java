package ro.ase.cts.observer.template.clase;

public abstract class SpectatorAbstract {
	public abstract void aseazareCoada();
	public abstract void prezintaBilet();
	public abstract void realizeazaControlCorporal();
	public abstract void ocupaLoc();
	
	//neaparat finala 
	public final void intrarePeStadion() {
		aseazareCoada();
		prezintaBilet();
		realizeazaControlCorporal();
		ocupaLoc();
	}
}
