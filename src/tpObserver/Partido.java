package tpObserver;

import java.util.List;

public class Partido {
	
	private String resultado;
	private List<String>contrincates;
	private String deporte;
	
	public Partido(String r, List<String>c, String d) {
		this.resultado = r;
		this.contrincates = c;
		this.deporte = d;
	}
	
	public List<String> getContrincantes(){
		return this.contrincates;
	}
	
	public String getDeporte() {
		return this.deporte;
	}

}
