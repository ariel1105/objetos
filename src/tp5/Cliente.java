package tp5;

public class Cliente {
	private String nombre;
	private String apellido;
	private int edad;
	private Float sueldoNetoMensual;
	
	public Cliente(String n, String a, int e, Float s) {
		this.nombre = n;
		this.apellido = a;
		this.edad = e;
		this.sueldoNetoMensual = s;
	}
	
	public Float sueldoNetoAnual() {
		return this.sueldoNetoMensual*12f;
	}
}
