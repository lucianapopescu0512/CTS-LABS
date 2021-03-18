package ro.ase.cts.clase;

import java.util.Arrays;

public class Angajat extends Aplicant{
	
	private static float sumaFinantare=10;
	
	private String ocupatie;
	private int salariu;
	
	public Angajat() {
		super();	
	}
	
	public Angajat(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumire_Proiecte,int salariu,String ocupatie) {
		super(nume,prenume,varsta,punctaj,numarProiecte,denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	
	public String getOcupatie() {
		return ocupatie;
	}
	
	public int getSalariu() {
		return salariu;
	}
	
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Angajat ");
		builder.append(super.toString());
		builder.append(", ocupatie=");
		builder.append(ocupatie);
		builder.append(", salariu=");
		builder.append(salariu);
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
