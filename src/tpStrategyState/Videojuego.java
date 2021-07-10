package tpStrategyState;

public class Videojuego {

	private EstadoVideojuego estado;
	
	public Videojuego() {
		this.estado = new EsperandoFichas();
	}
	
	public void ingresarFichas() {
		this.estado.ingresarFichas(this);
	}
	
	public void iniciar() {
		this.estado.iniciar(this);
	}
	
	public void setEstado(EstadoVideojuego estado) {
		this.estado = estado;
	}
	
}
