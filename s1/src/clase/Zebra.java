package clase;

public class Zebra extends Animal {
	
	private String mancare;

	public Zebra(String name,String mancare) {
		super(name);
		this.mancare=mancare;
	}

	public Zebra(String name) {
		super(name);
		this.mancare="-";
	}

}
