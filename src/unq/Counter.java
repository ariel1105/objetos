package unq;
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
}
