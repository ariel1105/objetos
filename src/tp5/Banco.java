package tp5;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private SectorPrestamos sectorPrestamos;
	
	public Banco(SectorPrestamos sector) {
		this.sectorPrestamos = sector;
	}

	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	public void registrarSolicitud(SolicitudCredito solicitud) {
		this.sectorPrestamos.registrarSolicitud(solicitud);
	}

	public ArrayList<Cliente> getClientes() {
		return this.clientes;
	}
	
	
}
