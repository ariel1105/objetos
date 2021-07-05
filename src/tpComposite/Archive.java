package tpComposite;

import java.time.LocalDate;

public class Archive implements FyleSystem{

	private String nombre;
	private int tamaño;
	private LocalDate fechaUltimaModificacion;
	
	public Archive(String nombre, int tamaño, LocalDate fecha) {
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.fechaUltimaModificacion = fecha;
	}
	
	public LocalDate getFecha() {
		return this.fechaUltimaModificacion;
	}
	@Override
	public int totalSize() {
		return this.tamaño;
	}

	@Override
	public void printStructure() {
		System.out.println(this.nombre);
	}

	@Override
	public Archive lastModified() {
		return this;
	}

	@Override
	public Archive oldestElement() {
		return this;
	}

}
