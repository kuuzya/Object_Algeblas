package addsub;

import basic.Exp;
import basic.ExpFactory;

public class AddSubExpFactory extends ExpFactory implements AddSubAlg<Exp> {
	@Override
	public Exp add(Exp e1, Exp e2) {
		return new Add(e1, e2);
	}

	@Override
	public Exp sub(Exp e1, Exp e2) {
		return new Sub(e1, e2);
	}

}
