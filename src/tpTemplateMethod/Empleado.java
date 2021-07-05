package tpTemplateMethod;

public abstract class Empleado {
	
	public final float sueldo() {
		return this.valorEnHoras() + this.basico() + this.plus() * 0.83f;
	}

	public float plus() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float basico() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float valorEnHoras() {
		// TODO Auto-generated method stub
		return 0;
	}

}
