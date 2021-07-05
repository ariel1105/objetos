package tpComposite;

public class MainShape {
	

	public static void main(String[] args) {

		IShapeShifter a;
		IShapeShifter b;
		IShapeShifter c;
		IShapeShifter d;
		IShapeShifter e;
		IShapeShifter f;
		
		a = new ShapeLeaf(1);
		b = new ShapeLeaf(2);
		c = a.compose(b);
		d = new ShapeLeaf(3);
		d = d.compose(c);
		e = d.flat();
		
		System.out.println(c.deepest());
	}

}
