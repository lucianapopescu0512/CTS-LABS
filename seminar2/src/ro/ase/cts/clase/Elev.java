package ro.ase.cts.clase;
import java.util.Arrays;

public class Elev extends Aplicant{
	
	private static float sumaFinantare=30;
	
	private int clasa;
	private String tutore;


	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public int getClasa() {
		return clasa;
	}
	
	public String getTutore() {
		return tutore;
	}
	
	public void setClasa(int i) {
		this.clasa = i;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Elev ");
		builder.append(super.toString());
		builder.append(", clasa=");
		builder.append(clasa);
		builder.append(", tutore=");
		builder.append(tutore);
		builder.append("]");
		return builder.toString();
		}
	

	@Override
	public void afisareSumaFinantare() {
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+ sumaFinantare+" Euro/zi in proiect.");
	}
	
	@Override
	public float getSumaFinantare() {
		return sumaFinantare;
	}
	
}
