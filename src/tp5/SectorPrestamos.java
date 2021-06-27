package tp5;

import java.util.ArrayList;

public class SectorPrestamos {
	
	private ArrayList<SolicitudCredito> solicitudesDeCredito;
	private ArrayList<SolicitudCredito> solicitudesAprobadas;
	
	SectorPrestamos(){
		solicitudesDeCredito = new ArrayList<SolicitudCredito>();
		solicitudesAprobadas = new ArrayList<SolicitudCredito>();
	}

	public void registrarSolicitud(SolicitudCredito solicitud) {
		this.solicitudesDeCredito.add(solicitud);
	}

	public ArrayList<SolicitudCredito> getCreditos() {
		return this.solicitudesDeCredito;
	}

	public void evaluarSolicitud(SolicitudCredito solicitud) {
		if ((this.solicitudesDeCredito.contains(solicitud)) && (solicitud.esAceptable())){
			this.solicitudesAprobadas.add(solicitud);
		}
	}

	public ArrayList<SolicitudCredito> solicitudesAprobadas() {
		return this.solicitudesAprobadas;
	}

	public float montoADesembolsar() {
		ArrayList<SolicitudCredito>solicitudes = this.solicitudesAprobadas;
		float monto = 0;
		for (int i = 0; i < solicitudes.size(); i++) {
			monto = monto + solicitudes.get(i).getMontoSolicitado();
		}
		return monto;
	}
}
