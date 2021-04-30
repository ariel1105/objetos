package tp4;

public class Impuesto {
	
	private Double tasa;
	
	public Impuesto(Double t) {
		tasa = t;
	}

	public Double montoAPagar() {
		return tasa;
	}
}
