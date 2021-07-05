package tpObserver;

public class AplicacionMovil {
	
	private ObserverEncuentrosDeportivos miServidor;
	
	public AplicacionMovil(ObserverEncuentrosDeportivos s) {
		this.miServidor = s;
	}
	
	public void suscribirseA(String tema) {
		this.miServidor.darDeAltaSuscripcionA(tema);
	}

}
