package addsub;

import basic.Exp;

public interface SubExpFactory extends SubAlg<Exp> {
	@Override
	public default Exp sub(Exp e1, Exp e2) {
		return new Sub(e1, e2);
	}

}
