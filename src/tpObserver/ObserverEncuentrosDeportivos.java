package tpObserver;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.stream.Stream;

import org.hamcrest.core.IsEqual;

public class ObserverEncuentrosDeportivos implements Observer {
	
	private AppEncuentrosDeportivos app;
	private List<String>temasDeInteres;
	
	public ObserverEncuentrosDeportivos(AppEncuentrosDeportivos app) {
		this.app = app;
	}
	@Override
	public void update(Observable o, Object arg) {
		if(this.esDeInteres((Partido) arg)) {
			this.notificar(app);
		}
	}
	
	public void notificar(AppEncuentrosDeportivos app2) {
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
