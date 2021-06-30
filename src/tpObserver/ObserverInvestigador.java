package tpObserver;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class ObserverInvestigador  implements Observer{
	
	ArrayList<String>temasDeInteres;
	private Investigador investigador;
	
	public ObserverInvestigador() {
		this.temasDeInteres = new ArrayList<String>();
	}

	@Override
	public void update(Observable o, Object arg) {
		Articulo articulo = (Articulo) arg;
		if (this.tieneTemasDeInteres(articulo)) {
			this.notificarInvestigador(articulo);
		}
	}


	private void notificarInvestigador(Articulo art) {
		investigador.recibirNotificacion(art);
	}

	public void agregarTemaDeInteres(String tema) {
		this.temasDeInteres.add(tema);
	}

	public void setInvestigador(Investigador investigador) {
		this.investigador = investigador;
	}

	public boolean estaInteresado(String tema) {
		return this.temasDeInteres.contains(tema);
	}

	public boolean tieneTemasDeInteres(Articulo articulo) {
		boolean resultado = false;
		ArrayList<String> temasDeInteres = this.temasDeInteres;
		for(int i = 0; i<temasDeInteres.size(); i++) {
			if (articulo.temasDeInteres().contains(temasDeInteres.get(i))){
				resultado = true;
			}
		}
		return resultado;
	}

}
