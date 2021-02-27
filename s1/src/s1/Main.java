package s1;

import clase.Animal;
import clase.Giraffe;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		
		Zoo zoo= new Zoo();
		Animal g1=new Giraffe("Gigi");
		Giraffe g2=new Giraffe("Gia");
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		zoo.feedAll();
	}

}
