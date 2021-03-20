package ro.ase.cts.clase;

public class LazyAsigurareMedicala {

	private int id;
	private String numeAsigurat;
	private float contributie;
	
	private static LazyAsigurareMedicala lazyAsigurareMedicala=null;
	
	private LazyAsigurareMedicala(int id, String numeAsigurat, float contributie) {
		super();
		this.id = id;
		this.numeAsigurat = numeAsigurat;
		this.contributie = contributie;
	}

	public static synchronized LazyAsigurareMedicala getInstance(int id, String numeAsigurat, float contributie) {
		if(lazyAsigurareMedicala==null) {
			lazyAsigurareMedicala=new LazyAsigurareMedicala(id, numeAsigurat, contributie);
		}
		return lazyAsigurareMedicala;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setNumeAsigurat(String numeAsigurat) {
		this.numeAsigurat = numeAsigurat;
	}

	public void setContributie(float contributie) {
		this.contributie = contributie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LazyAsigurareMedicala [id=");
		builder.append(id);
		builder.append(", numeAsigurat=");
		builder.append(numeAsigurat);
		builder.append(", contributie=");
		builder.append(contributie);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
