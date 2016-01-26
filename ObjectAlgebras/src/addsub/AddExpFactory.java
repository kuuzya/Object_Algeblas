package addsub;

import basic.Exp;
import basic.ExpFactory;

public interface AddExpFactory extends ExpFactory, AddAlg<Exp> {
	@Override
	public default Exp add(Exp e1, Exp e2) {
		return new Add(e1, e2);
	}

}
