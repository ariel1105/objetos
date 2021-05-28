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

	public int cantidadDeCartasDeValor(String valorCarta, ArrayList<String> mano) {
		int cantidad = 0;
		for (int i = 0; i < mano.size(); i++) {
			if (valorCarta.equals(this.valorDeCarta(mano.get(i)))){
				cantidad ++;
			}
		}
		return cantidad;
	}

	public String valorConMasOcurrencias(ArrayList<String> mano) {
		String valorActual = mano.get(0);
		for (int i = 1; i < mano.size(); i++) {
			if (this.cantidadDeCartasDeValor(this.valorDeCarta(mano.get(i)), mano) > 
			    this.cantidadDeCartasDeValor(this.valorDeCarta(valorActual), mano)){
				valorActual = mano.get(i);
			}
		}
		return this.valorDeCarta(valorActual);
	}

	public Boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		ArrayList<String> mano = new ArrayList<String>();
		mano.add(carta1);
		mano.add(carta2);
		mano.add(carta3);
		mano.add(carta4);
		mano.add(carta5);
		String mejorValor = this.valorConMasOcurrencias(mano);
		int cantidadDeMejoValor = this.cantidadDeCartasDeValor(mejorValor, mano);
		return cantidadDeMejoValor == 4;
	}

}	