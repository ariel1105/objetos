package tpObserver;

public class Investigador {
	
	private ObserverInvestigador obs;
	
	public Investigador(ObserverInvestigador obs) {
		this.obs = obs;
		this.obs.setInvestigador(this);
	}

	public void registrarse(SistemaDePublicaciones sistema) {
		sistema.registrar(this);
		sistema.addObserver(this.obs);
	}

	public void publicar(Articulo articulo, SistemaDePublicaciones sistema) {
		sistema.ingresar(articulo);
	}

	public void suscribirseA(String tema) {
		this.obs.agregarTemaDeInteres(tema);
	}

	
	public void recibirNotificacion(Articulo art) {
		// TODO Auto-generated method stub
		
	}

}
