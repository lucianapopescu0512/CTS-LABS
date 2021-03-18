package ro.ase.cts.reader;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicant {
	
	protected String numeFisier;
	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
	
	
	public ReaderAplicant(String numeFisier) {
		super();
		this.numeFisier = numeFisier;
	}
	
	public void readAplicant(Scanner scanner,Aplicant aplicant) {
		String nume = scanner.next();
		String prenume = scanner.next();
		int varsta = scanner.nextInt();
		int punctaj = scanner.nextInt();
		int numarProiecte = scanner.nextInt();
		String[] denumiriProiecte = new String[5];
		for (int pas = 0; pas < numarProiecte; pas++)
			denumiriProiecte[pas] = scanner.next();
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumireProiecte(denumiriProiecte,numarProiecte);
	}
	
}
