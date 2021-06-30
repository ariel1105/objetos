package tpObserver;

import java.util.ArrayList;

public class Articulo {
	private String titulo;
	private ArrayList<String> autores;
	private String filiacion;
	private String tipoDeArticulo;
	private String lugarDePublicacion;
	private ArrayList<String> palabrasClave;
	
	public Articulo(String titulo, ArrayList<String> autores, String filiacion, String tipoDeArticulo, String lugar, ArrayList<String>palabrasClave) {
		this.titulo = titulo;
		this.autores = autores;
		this.filiacion = filiacion;
		this.tipoDeArticulo = tipoDeArticulo;
		this.lugarDePublicacion = lugar;
		this.palabrasClave = palabrasClave;
	}
	
	public ArrayList<String> temasDeInteres() {
		ArrayList<String> temas = new ArrayList<String>();
		temas.add(this.titulo);
		temas.addAll(this.autores);
		temas.add(this.filiacion);
		temas.add(this.tipoDeArticulo);
		temas.add(this.lugarDePublicacion);
		temas.addAll(this.palabrasClave);
		return temas;
	}

}
