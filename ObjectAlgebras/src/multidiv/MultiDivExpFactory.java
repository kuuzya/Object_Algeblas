package multidiv;

import basic.Exp;
import basic.ExpFactory;

public interface MultiDivExpFactory extends ExpFactory, MultiDivAlg<Exp> {
	@Override
	public default Exp multi(Exp e1, Exp e2) {
		return new Multi(e1, e2);
	}

	@Override
	public default Exp div(Exp e1, Exp e2) {
		return new Div(e1, e2);
	}

}
