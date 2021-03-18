package ro.ase.cts.clase;

import java.util.Arrays;

public abstract class Aplicant {

	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int numarProiecte;
	protected String[] denumireProiect;

	public abstract void afisareSumaFinantare();

	public abstract float getSumaFinantare();

	public Aplicant() {
		super();
	}

	public Aplicant(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.numarProiecte = numarProiecte;
		this.denumireProiect = denumireProiect;
	}

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public int getNr_proiecte() {
		return numarProiecte;
	}

	public int getPunctaj() {
		return punctaj;
	}

	public String[] getDenumireProiect() {
		return denumireProiect;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}

	public void setDenumireProiecte(String[] denumireProiect, int numarProiecte) {
		this.numarProiecte = numarProiecte;
		this.denumireProiect = denumireProiect;
	}

	public void statut(Proiect proiect) {

		boolean esteAcceptat = punctaj >= proiect.getPunctajPrag();

		StringBuilder stringBuilder = new StringBuilder("Aplicantul ");
		stringBuilder.append(nume);
		stringBuilder.append(" ");
		stringBuilder.append(prenume);
		stringBuilder.append(" ");
		stringBuilder.append(esteAcceptat ? "a fost acceptat." : "a fost respins.");

		System.out.println(stringBuilder.toString());

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aplicant [nume=");
		builder.append(nume);
		builder.append(", prenume=");
		builder.append(prenume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", punctaj=");
		builder.append(punctaj);
		builder.append(", numarProiecte=");
		builder.append(numarProiecte);
		builder.append(", denumireProiect=");
		builder.append(Arrays.toString(denumireProiect));
		return builder.toString();
	}

}
