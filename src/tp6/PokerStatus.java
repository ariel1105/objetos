package tp6;

import java.util.ArrayList;
import java.util.function.BooleanSupplier;

public class PokerStatus {

	public String paloDeCarta(String carta) {
		return this.paloCorrespondiente(carta.substring(carta.length()-1));
	}

	private String paloCorrespondiente(String inicial) {
		switch (inicial) {
			case "D": return "Diamante";
			case "T": return "Trebol";
			case "P": return "Pica";
			default : return "Corazones";
		}
	}

	public String valorDeCarta(String carta) {
		return carta.substring(0, carta.length()-1); 
	}

	public int cantidadDeCartasDeValor(String valorCarta, String[] mano) {
		int cantidad = 0;
		for (int i = 0; i < mano.length; i++) {
			if (valorCarta.equals(this.valorDeCarta(mano[i]))){
				cantidad ++;
			}
		}
		return cantidad;
	}

	public String valorConMasOcurrencias(String[] mano) {
		String valorActual = mano[0];
		for (int i = 1; i < mano.length; i++) {
			if (this.cantidadDeCartasDeValor(this.valorDeCarta(mano[i]), mano) > 
			    this.cantidadDeCartasDeValor(this.valorDeCarta(valorActual), mano)){
				valorActual = mano[i];
			}
		}
		return this.valorDeCarta(valorActual);
	}

	public Boolean esPoker(String[] mano) {
		String mejorValor = this.valorConMasOcurrencias(mano);
		int cantidadDeMejorValor = this.cantidadDeCartasDeValor(mejorValor, mano);
		return cantidadDeMejorValor == 4;
	}

	public int cantidadDeCartasDePalo(String palo, String[] mano) {
		int cantidad = 0 ;
		for (int i = 0; i < mano.length; i++) {
			String paloActual = this.paloDeCarta(mano[i]);
			if (palo.equals(paloActual)) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public Boolean esColor(String[] mano) {
		String carta = mano[0];
		String palo = this.paloDeCarta(carta);
		return this.cantidadDeCartasDePalo(palo, mano) == 5;
	}

	public Boolean esTrio(String[] mano) {
		String mejorValor = this.valorConMasOcurrencias(mano);
		int cantidadDeMejorValor = this.cantidadDeCartasDeValor(mejorValor, mano);
		return cantidadDeMejorValor == 3;
	}

	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		String[] mano = new String[] {carta1, carta2, carta3, carta4, carta5};
		if (this.esPoker(mano)) {
			return "Poker";
		}
		if (this.esColor(mano)) {
			return "Color";
		}
		else {return "Trio";}
	}

}	