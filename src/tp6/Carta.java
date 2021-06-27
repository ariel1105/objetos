package tp6;

public class Carta {
	private String valor;
	private String palo;
	
	public Carta(String valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}

	public Boolean valeMasQue(Carta carta2) {
		return this.valorNumerico() > carta2.valorNumerico(); 
	}

	private int valorNumerico() {
		switch(this.valor) {
		case "A": return 14;
		case "K": return 13;
		case "Q": return 12;
		case "J": return 11;
		default: return Integer.parseInt(this.valor);
		}
	}
	
	public String paloDeCarta() {
		return this.palo;
	}
	
	public String valorDeCarta() {
		return this.valor; 
	}

	public String aString() {
		return this.valor + this.palo;
	}
}
