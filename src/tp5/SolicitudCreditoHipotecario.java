package tp5;

public class SolicitudCreditoHipotecario extends SolicitudCredito {

	private Propiedad garantia;
	
	public SolicitudCreditoHipotecario(float monto, int plazo, Cliente solicitante, Propiedad garantia) {
		this.setMontoYPlazo(monto, plazo, solicitante);
		this.garantia = garantia;
	}

	@Override
	public boolean esAceptable() {
		return this.solicitanteTieneEdadAcorde() && this.tieneIngresosMensualesSuficientes() && this.valorDeGarantiaSuficiente();
	}

	@Override
	public boolean tieneIngresosMensualesSuficientes() {
		float ingresos = this.getSolicitante().getSueldoNetoMensual();
		return (this.montoCuotaMensual()/2) < ingresos;
	}

	public int duracionEnAnios() {
		return (int) Math.floor((double)(this.getPlazo()/12));
	}

	public boolean solicitanteTieneEdadAcorde() {
		int edadSolicitante = this.getSolicitante().getEdad();
		return (this.duracionEnAnios()+edadSolicitante)<65;
	}

	public boolean valorDeGarantiaSuficiente() {
		float valorGarantia = this.garantia.getValorFiscal();
		return (this.getMontoSolicitado()*0.7f)<valorGarantia;
	}

}
