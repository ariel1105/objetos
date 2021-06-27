package tp6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerStatus {
	
	private String[] ordenDeJugadas = {"Nada","Trio", "Color", "Poker"};
	private List<String> listaOrdenDeJugadas;
	
	public PokerStatus(){
		listaOrdenDeJugadas = Arrays.asList(ordenDeJugadas);
	}
	
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

	public Boolean esPoker(ArrayList<String> mano) {
		String mejorValor = this.valorConMasOcurrencias(mano);
		int cantidadDeMejorValor = this.cantidadDeCartasDeValor(mejorValor, mano);
		return cantidadDeMejorValor == 4;
	}

	public int cantidadDeCartasDePalo(String palo, ArrayList<String> mano) {
		int cantidad = 0 ;
		for (int i = 0; i < mano.size(); i++) {
			String paloActual = this.paloDeCarta(mano.get(i));
			if (palo.equals(paloActual)) {
				cantidad++;
			}
		}
		return cantidad;
	}

	public Boolean esColor(ArrayList<String> mano) {
		String carta = mano.get(0);
		String palo = this.paloDeCarta(carta);
		return this.cantidadDeCartasDePalo(palo, mano) == 5;
	}

	public Boolean esTrio(ArrayList<String> mano) {
		String mejorValor = this.valorConMasOcurrencias(mano);
		int cantidadDeMejorValor = this.cantidadDeCartasDeValor(mejorValor, mano);
		return cantidadDeMejorValor == 3;
	}

	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		ArrayList<String> mano = new ArrayList <String>();
		mano.add(carta1);
		mano.add(carta2);
		mano.add(carta3);
		mano.add(carta4);
		mano.add(carta5);
		if (this.esPoker(mano)) {
			return "Poker";
		}
		if (this.esColor(mano)) {
			return "Color";
		}
		if (this.esTrio(mano)) {
			return "Trio";
		}
		else {return "Nada";}
	}

	public String verificarConCarta(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		String cartaS1 = carta1.aString();
		String cartaS2 = carta2.aString();
		String cartaS3 = carta3.aString();
		String cartaS4 = carta4.aString();
		String cartaS5 = carta5.aString();
		return this.verificar(cartaS1, cartaS2, cartaS3, cartaS4, cartaS5);
	}

	public String jugadaGanadora(String jugada1, String jugada2) {
		if (this.ordenDeRelevancia(jugada1) > this.ordenDeRelevancia(jugada2)) {
			return jugada1;
		}
		if (this.ordenDeRelevancia(jugada1) < this.ordenDeRelevancia(jugada2)) {
			return jugada2;
		}
		else {return "No hay Ganador";}
	}

	private int ordenDeRelevancia(String jugada1) {
		return this.listaOrdenDeJugadas.indexOf(jugada1);
	}

}	