package tpComposite;

public class Cultivo implements Region{
	
	private float valor;
	
	public Cultivo(float valor) {
		this.valor = valor;
	}

	@Override
	public float valor() {
		return this.valor;
	}

}
