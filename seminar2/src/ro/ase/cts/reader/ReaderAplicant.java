package ro.ase.cts.reader;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract interface ReaderAplicant {
	
	List<Aplicant> readAplicanti(String file) throws FileNotFoundException;

}