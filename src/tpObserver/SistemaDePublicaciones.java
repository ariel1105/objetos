package tpObserver;

import java.util.ArrayList;
import java.util.Observable;

public class SistemaDePublicaciones extends Observable{
	
	private ArrayList<Investigador> investigadores;
	private ArrayList<Articulo> articulos;
	
	public SistemaDePublicaciones(){
		this.investigadores = new ArrayList<Investigador>();
		this.articulos = new ArrayList<Articulo>();
	}

	public void registrar(Investigador investigador) {
		if (!this.investigadores.contains(investigador)) {
		this.investigadores.add(investigador);
		}
	}

	public void ingresar(Articulo articulo) {
		this.articulos.add(articulo);
		this.notifyObservers(articulo);
	}


}
