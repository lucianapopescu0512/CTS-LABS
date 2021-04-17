package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Masa;
//import ro.ase.cts.facade.clase.OperatorMese;
//import ro.ase.cts.facade.clase.Picolo;

public class Main {

	public static void main(String[] args) {
		
//		Masa masa=new Masa(10, 0);
//		if(OperatorMese.esteLibera(masa)) {
//			Picolo andrei=new Picolo("Andrei");
//			if(andrei.esteDebarasata(masa) && andrei.esteAranjata(masa)) {
//				System.out.println("Poftiti la masa!");
//			}else {
//				System.out.println("Mai asteptati putin!");
//			}
//		}else {
//			System.out.println("Mai asteptati putin!");
//		}
//		
		System.out.println();
		
		Masa masa1=new Masa(14,3);
		if(Facade.potInvitaOameniiLaMasa(masa1)) {
			System.out.println("Poftiti la masa!");
		}else {
			System.out.println("Mai asteptati putin!");
		}

	}

}
