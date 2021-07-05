package tpTemplateMethod;

public class EmpleadoPasante extends Empleado {
	
	private int cantHoras;

	public EmpleadoPasante(int cantHoras) {
		this.cantHoras = cantHoras;
	}
	
	@Override
	public float valorEnHoras() {
		return cantHoras * 40;
	}

}
