package tpComposite;

import java.time.LocalDate;
import java.util.ArrayList;

public class Directorio implements FyleSystem{
	
	private String nombre;
	private LocalDate fechaCreacion;
	private ArrayList<FyleSystem> contenido;
	
	public Directorio(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fechaCreacion = fecha;
		this.contenido = new ArrayList<FyleSystem>();
	}

	@Override
	public int totalSize() {
		int peso = 0;
		for (int i = 0; i<this.contenido.size(); i++) {
			peso = peso + this.contenido.get(i).totalSize();
		}
		return peso;
	}

	@Override
	public void printStructure() {
		for (int i = 0; i < this.contenido.size(); i++) {
			System.out.println("----");
			this.contenido.get(i).printStructure();
		}
	}

	@Override
	public Archive lastModified() {
		Archive last = this.contenido.get(0).lastModified();
		for (int i = 1; i < this.contenido.size(); i++) {
			if (!last.lastModified().getFecha().isAfter(this.contenido.get(i).lastModified().getFecha())) {
				last = this.contenido.get(i).lastModified();
			}
		}
		return last;
	}

	@Override
	public Archive oldestElement() {
		Archive oldest = this.contenido.get(0).lastModified();
		for (int i = 1; i < this.contenido.size(); i++) {
			if (oldest.lastModified().getFecha().isAfter(this.contenido.get(i).lastModified().getFecha())) {
				oldest = this.contenido.get(i).lastModified();
			}
		}
		return oldest;
	}
}
