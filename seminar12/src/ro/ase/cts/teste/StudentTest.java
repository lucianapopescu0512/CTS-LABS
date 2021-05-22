package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTest {
	
	@Test
	public void testCorectitudineConstructorCuParametrii() {
		String nume="Gigel";
		Student student=new Student(nume);		
		assertEquals(nume, student.getNume());
		
	}

	@Test
	public void testInitializareListaInConstructor() {
		Student student=new Student("Gigel");
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testConstructorFaraParametrii() {
		Student student=new Student();
		assertNotNull("Notele nu au fost initializate",student.getNote());
		assertNotNull("Numele nu a fost initializat",student.getNume());
	}
	
	@Test
	public void testMetodaAdaugareNotaInLista() {
		Student student=new Student();
		int nota=10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	
	
}
