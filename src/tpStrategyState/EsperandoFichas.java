package tpStrategyState;

public class EsperandoFichas extends EstadoVideojuego {

	@Override
	protected void ingresarFichas(Videojuego videojuego) {
		videojuego.setEstado(new UnJugadorHabilitado());
	}

	@Override
	protected void iniciar(Videojuego videojuego) {
		System.out.println("Por favor inserte fichas");
	}

}
