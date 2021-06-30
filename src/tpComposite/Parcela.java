package tpComposite;

import java.util.ArrayList;

public class Parcela implements Region{
	
	private ArrayList<Region>porcionesDeTierra;
	
	public Parcela() {
		this.porcionesDeTierra = new ArrayList<Region>();
	}
	
	public void agregarRegion(Region region) {
		this.porcionesDeTierra.add(region);
	}

	@Override
	public float valor() {
		float valor = 0;
		for(int i=0; i<porcionesDeTierra.size();i++) {
			valor = valor + (porcionesDeTierra.get(i).valor()/4);
		}
		return valor;
	}

}
