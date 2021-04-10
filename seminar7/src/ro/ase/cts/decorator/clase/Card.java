package ro.ase.cts.decorator.clase;

public class Card implements CardAbstract {

	private String titular;
	private String numarCard;
	
	public Card(String titular, String numarCard) {
		super();
		this.titular = titular;
		this.numarCard = numarCard;
	}

	@Override
	public void platestePOS() {
		System.out.println(this.titular+" a realizat plata pos");
		
	}

	@Override
	public void platesteOnline() {
		System.out.println(this.titular+" a realizat plata online");
	
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumarCard() {
		return numarCard;
	}

	public void setNumarCard(String numarCard) {
		this.numarCard = numarCard;
	}
	
	
}
