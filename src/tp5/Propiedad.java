package tp5;

public class Propiedad {
	private String descripcion;
	private String direccion;
	private float valorFiscal;
	
	public Propiedad(String descripcion, String direccion, float valor) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valor;
	}
	
	public float getValorFiscal() {
		return this.valorFiscal;
	}

}
