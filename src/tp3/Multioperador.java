package tp3;

import java.util.ArrayList;

public class Multioperador {
	private ArrayList<Integer> elementos = new ArrayList<Integer>();

	public void agregar(int i) {
		elementos.add(i);
	}

	public int suma() {
		int suma = 0;
		for (int i=0; i < elementos.size(); i++) {
			suma = suma + elementos.get(i); 
		}
		return suma;
	}

	public int resta() {
		if (elementos.isEmpty()) {
			return 0;
		}
		int resta = elementos.get(0);
		for (int i = 1; i < elementos.size(); i++) {
			resta = resta - elementos.get(i);
		}
		return resta;
	}

	public int multiplicacion() {
		if (elementos.isEmpty()) {
			return 0;
		}
		int multiplicacion = elementos.get(0);
		for (int i = 1; i < elementos.size(); i++) {
			multiplicacion = multiplicacion * elementos.get(i);
		}
		return multiplicacion;
	}

}
