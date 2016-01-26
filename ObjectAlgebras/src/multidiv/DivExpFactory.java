package multidiv;

import basic.Exp;

public interface DivExpFactory extends DivAlg<Exp> {
	@Override
	public default Exp div(Exp e1, Exp e2) {
		return new Div(e1, e2);
	}

}
