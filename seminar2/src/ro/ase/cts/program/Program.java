
package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.reader.ReaderAngajati;
import ro.ase.cts.reader.ReaderAplicant;
import ro.ase.cts.reader.ReaderStudent;

public class Program {
	
	public static List<Aplicant> readAplicanti(ReaderAplicant readerAplicant) throws FileNotFoundException{	
		return readerAplicant.readAplicanti();
	}
	

	public static void main(String[] args) {			
		List<Aplicant> listaAplicanti;
		try {			
			listaAplicanti = readAplicanti(new ReaderStudent("studenti.txt"));
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException error) {
			error.printStackTrace();
		}
	}

}
