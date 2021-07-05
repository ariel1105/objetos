package tpComposite;

import java.util.ArrayList;
import java.util.List;

public class ShapeLeaf implements IShapeShifter{
	
	private Integer value;
	
	public ShapeLeaf(Integer value) {
		this.value = value;
	}

	@Override
	public IShapeShifter compose(IShapeShifter arg) {
		ShapeComposite composite = new ShapeComposite();
		composite.addChild(this);
		composite.addChild(arg);
		return composite;
	}

	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer>values(){
		List<Integer> valores = new ArrayList<Integer>();
		valores.add(this.value);
		return valores;
	}
	

}
