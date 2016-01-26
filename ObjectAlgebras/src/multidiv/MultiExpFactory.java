package multidiv;

import basic.Exp;

public interface MultiExpFactory extends MultiAlg<Exp> {
	@Override
	default Exp multi(Exp e1, Exp e2) {
		return new Multi(e1,e2);
	}

}
