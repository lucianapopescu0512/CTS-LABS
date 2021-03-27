package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.AbstractPrototype;
import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ClientStadion;

public class Main {

	public static void main(String[] args) {
		
		AbstractPrototype abstractPrototype1= new ClientStadion("Luciana",21);
		AbstractPrototype abstractPrototype2=abstractPrototype1.copiaza();
		ClientStadion clientStadion=(ClientStadion) abstractPrototype1.copiaza();
		clientStadion.setDenumire("new Luciana");
		System.out.println(abstractPrototype1.toString());
		System.out.println(abstractPrototype2.toString());
		System.out.println(clientStadion.toString());
		
		Bilet bilet1=new Bilet(1, "E1", "E2", "27 martie, 10:00");
		Bilet bilet2=(Bilet) bilet1.copiaza();
		bilet2.setCod(2);
		System.out.println(bilet1.toString());
		System.out.println(bilet2.toString());
		
	}

}
