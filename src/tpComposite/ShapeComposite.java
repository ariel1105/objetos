package tpComposite;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ShapeComposite implements IShapeShifter{
	
	private List<IShapeShifter> componentes;
	
	public ShapeComposite() {
		this.componentes = new ArrayList<IShapeShifter>();
	}
	
	public void addChild(IShapeShifter arg) {
		this.componentes.add(arg);
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
		Stream<Integer> stream = this.componentes.stream().map(s -> s.deepest());
		int deepest = 1 + stream.max(Integer::compareTo).get();
		return deepest;
	}

	@Override
	public IShapeShifter flat() {
		ShapeComposite composite = new ShapeComposite();
		Stream<IShapeShifter> stream = this.componentes.stream().map(s -> s.flat());
		return composite;
	}

	@Override
	public List<Integer> values() {
		Stream<List<Integer>> stream = this.componentes.stream().map(s -> s.values());
		List<Integer> values = new ArrayList<Integer>();
		stream.forEach(values::addAll);
		return values;
	}

}
