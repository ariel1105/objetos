package tpTemplateMethod;

public class EmpleadoDePlanta extends Empleado {

	private int cantHijos;
	
	public EmpleadoDePlanta(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	@Override
	public float basico() {
		return 3000f;
	}
	
	@Override
	public float plus() {
		return 150*this.cantHijos;
	}
}
