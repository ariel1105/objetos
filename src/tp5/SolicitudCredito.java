package tp5;

public abstract class SolicitudCredito {
	
	private float montoSolicitado;
	private int plazo;
	private Cliente solicitante;
	
	
	public void setMontoYPlazo(float monto, int plazo, Cliente cliente) {
		this.montoSolicitado = monto;
		this.plazo = plazo;
		this.solicitante = cliente;
	}
	
	public float getMontoSolicitado() {
		return this.montoSolicitado;
	}
	
	public int getPlazo() {
		return this.plazo;
	}
	
	public Cliente getSolicitante() {
		return this.solicitante;
	}

	public float montoCuotaMensual() {
		return this.montoSolicitado/this.plazo;
	}
	
	public abstract boolean esAceptable();
	
	public abstract boolean tieneIngresosMensualesSuficientes();

}
