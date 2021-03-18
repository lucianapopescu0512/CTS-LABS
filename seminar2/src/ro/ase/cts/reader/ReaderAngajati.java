package ro.ase.cts.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class ReaderAngajati extends ReaderAplicant{

	
	
	public ReaderAngajati(String numeFisier) {
		super(numeFisier);
	}

	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.numeFisier));
		input.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();
		Angajat angajat=new Angajat();
		while (input.hasNext()) {
			readAplicant(input, angajat);
			int salariu = input.nextInt();
			String ocupatie = input.next();
			angajat.setSalariu(salariu);
			angajat.setOcupatie(ocupatie);
			angajati.add(angajat);
		}
		input.close();
		return angajati;
	}
	
}
