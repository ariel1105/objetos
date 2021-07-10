package tpStrategyState;

public abstract class JuegoHabilitado extends EstadoVideojuego {

	@Override
	protected void iniciar(Videojuego videojuego) {
		// inicia el juego y al terminar vuelve al estado inicial
		videojuego.setEstado(new EsperandoFichas());
	}

}
