package ro.ase.cts.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	
	private static float sumaFinantare=20;
	
	protected String facultate;
	protected int anStudii;

	public Student() {
		super();	
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,numarProiecte,denumireProiect);
		this.facultate = facultate;
		this.anStudii = an_studii;
	}
	
	public String getFacultate() {
		return facultate;
	}
	
	public int getAn_studii() {
		return anStudii;
	}
	
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	
	public void setAn_studii(int anStudii) {
		this.anStudii = anStudii;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("Student ");
		builder.append(super.toString());
		builder.append(", facultate=");
		builder.append(facultate);
		builder.append(", anStudii=");
		builder.append(anStudii);
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
