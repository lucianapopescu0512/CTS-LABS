package ro.ase.cts.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ReaderElevi extends ReaderAplicant {

	public ReaderElevi(String numeFisier) {
		super(numeFisier);
	}
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.numeFisier));
		input.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();
		Elev elev=new Elev();
		while (input.hasNext()) {
			readAplicant(input, elev);
			int clasa = input.nextInt();
			String tutore = input.next();
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			elevi.add(elev);
		}

		input.close();
		return elevi;
	}
	
}
