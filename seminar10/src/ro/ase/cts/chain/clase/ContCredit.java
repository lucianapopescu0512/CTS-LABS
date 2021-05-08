package ro.ase.cts.chain.clase;

public class ContCredit extends Cont {
	public ContCredit(float sold) {
		super(sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		// TODO Auto-generated method stub
				if(suma<=super.getSold()) {
					System.out.println("Se realizeaza plata din contul de credit cu suma de "+suma);
					super.setSold(super.getSold()-suma);
				}
				else {
					if(super.getCont()!=null) {
						super.getCont().realizeazaPlata(suma);
					}
					else {
						System.out.println("Plata refuzata");
					}
				}
		
	}

}
