package tp5;

public class SolicitudCreditoPersonal extends SolicitudCredito {

	public SolicitudCreditoPersonal(float monto, int plazo, Cliente solicitante) {
		super();
		this.setMontoYPlazo(monto, plazo, solicitante);
	}

	@Override
	public boolean esAceptable() {
		return this.solicitanteTieneIngresosAnualesSuficientes() && this.solicitanteTieneMensualesSuficientes();
	}

	@Override
	public boolean tieneIngresosMensualesSuficientes() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean solicitanteTieneIngresosAnualesSuficientes() {
		return this.getSolicitante().sueldoNetoAnual() > 15000;
	}

	public boolean solicitanteTieneMensualesSuficientes() {
		float montoAMirar = (float) (this.montoCuotaMensual() *0.7);
		return this.getSolicitante().getSueldoNetoMensual() > montoAMirar;
	}

}
