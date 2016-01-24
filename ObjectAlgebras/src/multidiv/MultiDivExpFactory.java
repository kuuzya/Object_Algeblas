package multidiv;

import basic.Exp;
import basic.ExpFactory;

public class MultiDivExpFactory extends ExpFactory implements MultiDivAlg<Exp> {
	@Override
	public Exp multi(Exp e1, Exp e2) {
		return new Multi(e1, e2);
	}

	@Override
	public Exp div(Exp e1, Exp e2) {
		return new Div(e1, e2);
	}

}
