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
	
	
	@Test
	public void testDimensiuneLista() {
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(9);
		assertEquals(2, student.getNote().size());
	}
	
	@Test
	public void testCalculeazaMediaCorect() {
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(9);
		assertEquals(9.5f, student.calculeazaMedie(),0.01);
	}
	
	@Test
	public void testStudentCuRestanta() {
		Student student=new Student();
		student.adaugaNota(4);
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testStudentFaraRestanta() {
		Student student=new Student();
		student.adaugaNota(10);
		assertFalse(student.areRestante());
	}
	
	
	@Test
	public void testIndexListaGresit() {
		Student student=new Student();
		student.adaugaNota(4);
	//1	
		try {
	//2		
			student.getNota(-1);
	//3		
			fail("Nu trebui sa ajunga aici. Nu se arunca exceptii");
		}
		catch(IndexOutOfBoundsException exceptie){
	//4		
		}
		catch(Exception exceptie){
	//5		
			fail("Metoda arunca alta exceptie");
		}
	//6
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testIndexListaGresitJUnit4() {
		Student student=new Student();
		student.adaugaNota(4);
		student.getNota(-1);
	}

	
	
}


















