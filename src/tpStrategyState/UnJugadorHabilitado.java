package tpStrategyState;

public class UnJugadorHabilitado extends JuegoHabilitado {

	@Override
	protected void ingresarFichas(Videojuego videojuego) {
		videojuego.setEstado(new DosJugadoresHabilitados());
	}

}
