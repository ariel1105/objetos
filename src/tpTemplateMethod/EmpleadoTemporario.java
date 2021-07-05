package tpTemplateMethod;

public class EmpleadoTemporario extends Empleado {
	
	private int cantHoras;
	private int cantHijos;
	private boolean estaCasado;

	public EmpleadoTemporario(int horas, int cantHijos, boolean estaCasado) {
		this.cantHoras = horas;
		this.cantHijos = cantHijos;
		this.estaCasado = estaCasado;
	}
	
	@Override
	public float valorEnHoras() {
		return this.cantHoras *5;
	}
	
	@Override
	public float basico() {
		return 1000f;
	}
	
	@Override
	public float plus() {
		float plus = 0;
		if(this.cantHijos > 0 || this.estaCasado) {
			plus = 100f;
		}
		return plus;
	}

}
