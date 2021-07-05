package tpObserver;

import java.util.Observable;

public class AppEncuentrosDeportivos extends Observable{
	
	public void publicarPartido(Partido p) {
		this.notifyObservers(p);
	}

}
