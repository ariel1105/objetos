package tpComposite;

import java.time.LocalDate;


public class MainShape {
	

	public static void main(String[] args) {
		
		ShapeLeaf dumi;
		LocalDate fecha1;
		LocalDate fecha2;
		LocalDate fecha3;
		
		IShapeShifter a;
		IShapeShifter b;
		IShapeShifter c;
		IShapeShifter d;
		IShapeShifter e;
		IShapeShifter f;

		dumi = new ShapeLeaf(1);
		fecha1 = LocalDate.of(2021, 7, 8);
		fecha2 = LocalDate.of(2021, 7, 10);
		fecha3 = LocalDate.of(2021, 7, 9);
		
		
		a = new ShapeLeaf(1);
		b = new ShapeLeaf(2);
		c = a.compose(b);
		d = new ShapeLeaf(3);
		d = d.compose(c);
		e = d.flat();
		
		System.out.println("lala");
		
	}

}
