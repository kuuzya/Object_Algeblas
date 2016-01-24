package addsub;

import basic.Exp;
import basic.ExpFactory;

public interface AddSubExpFactory extends ExpFactory, AddSubAlg<Exp> {
	@Override
	public default Exp add(Exp e1, Exp e2) {
		return new Add(e1, e2);
	}

	@Override
	public default Exp sub(Exp e1, Exp e2) {
		return new Sub(e1, e2);
	}

}
