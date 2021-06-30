package tpComposite;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParcelaTestCase {
	
	private Parcela parcela1;
		private Cultivo cultivo1;
	//	private Cultivo cultivo1;
		private Parcela parcela2;
	//		private Cultivo cultivo1;
			private Cultivo cultivo2;
	//		private Cultivo cultivo2;
	//		private Cultivo cultivo2;
	//	private Cultivo cultivo2; 				
	@BeforeEach
	void setUp() throws Exception {
		cultivo1 = mock(Cultivo.class);
		cultivo2 = mock(Cultivo.class);
		parcela1 = new Parcela();
		parcela2 = new Parcela();
		parcela2.agregarRegion(cultivo1);
		parcela2.agregarRegion(cultivo1);
		parcela2.agregarRegion(cultivo2);
		parcela2.agregarRegion(cultivo2);
		parcela1.agregarRegion(cultivo1);
		parcela1.agregarRegion(cultivo2);
		parcela1.agregarRegion(parcela2);
		parcela1.agregarRegion(cultivo1);
	}

	@Test
	void test() {
		when(cultivo1.valor()).thenReturn(2000f);
		when(cultivo2.valor()).thenReturn(1200f);
		float valorTotal = parcela1.valor();
		assertEquals(valorTotal, 1700f);
	}

}
