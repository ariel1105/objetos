package tpComposite;

import java.time.LocalDate;

public class Archive implements FyleSystem{

	private String nombre;
	private int tama�o;
	private LocalDate fechaUltimaModificacion;
	
	public Archive(String nombre, int tama�o, LocalDate fecha) {
		this.nombre = nombre;
		this.tama�o = tama�o;
		this.fechaUltimaModificacion = fecha;
	}
	
	public LocalDate getFecha() {
		return this.fechaUltimaModificacion;
	}
	@Override
	public int totalSize() {
		return this.tama�o;
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
