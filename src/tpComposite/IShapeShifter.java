package tpComposite;

import java.util.List;

public interface IShapeShifter {

	public IShapeShifter compose(IShapeShifter arg);
	
	public int deepest();
	
	public IShapeShifter flat();
	
	public List<Integer> values();
}
