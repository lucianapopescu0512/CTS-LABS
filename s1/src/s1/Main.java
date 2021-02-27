package s1;

import clase.Animal;
import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		
		Zoo zoo= new Zoo();
		Animal g1=new Giraffe("Gigi");
		Giraffe g2=new Giraffe("Gia");
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		//zoo.feedAll();
		
		Zebra z1=new Zebra("Zizi","iarba");
		Zebra z2=new Zebra("Zia");
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		zoo.feedAll();
	}

}
