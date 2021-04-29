package tp3;
import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> elementos = new ArrayList<Integer>();
		

	public void addNumber(Integer i) {
		elementos.add(i);		
	}

	public int getEvenOcurrences() {
		int ocurrences= 0;
		for (int i=0; i < elementos.size(); i++) {
			if (elementos.get(i)%2==0) {
				ocurrences++;
			}
		}
		return ocurrences;
	}

	public int getOddOcurrences() {
		int ocurrences= 0;
		for (int i=0; i < elementos.size(); i++) {
			if (elementos.get(i)%2!= 0) {
				ocurrences++;
			}
		}
		return ocurrences;
	}

	public int getMultiplesOf(int n) {
		int multiples= 0;
		for(int i=0; i < elementos.size(); i++) {
			if (elementos.get(i)%n == 0) {
				multiples++;
			}
		}
		return multiples;
	}
}
