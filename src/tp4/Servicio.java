package tp4;

public class Servicio {
	
	private Double cantUnidades;
	private Double costoPorUnidad;
	
	public Servicio(Double a, Double b) {
		cantUnidades = a;
		costoPorUnidad = b;
	}

	public Double montoAPagar() {
		return cantUnidades * costoPorUnidad;
	}

}
