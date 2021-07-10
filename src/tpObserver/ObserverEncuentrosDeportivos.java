package tpObserver;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.stream.Stream;

import org.hamcrest.core.IsEqual;

public class ObserverEncuentrosDeportivos implements Observer {
	
	private AplicacionMovil app;
	private List<String>temasDeInteres;
	
	public ObserverEncuentrosDeportivos(AplicacionMovil app, AppEncuentrosDeportivos obs) {
		this.app = app;
		obs.addObserver(this);
	}
	@Override
	public void update(Observable o, Object arg) {
		Partido partido = (Partido) arg;
		if(this.esDeInteres(partido)) {
			this.notificar(this.app, partido);
		}
	}
	
	public void notificar(AplicacionMovil app2, Partido partido) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean esDeInteres(Partido partido) {
		Stream<String>temas = this.temasDeInteres.stream();
		boolean esDeInteres = temas.anyMatch(tema -> partido.getContrincantes().contains(tema)) 
				|| temas.anyMatch(tema -> equals(partido.getDeporte()));
		return esDeInteres;
				
	}
	
	
	public void darDeAltaSuscripcionA(String tema) {
		this.temasDeInteres.add(tema);
	}

}
