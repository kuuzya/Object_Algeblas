package fouroperation;

import addsub.Add;
import addsub.Sub;
import basic.Exp;
import basic.Lit;
import basic.Zero;
import multidiv.Div;
import multidiv.Multi;

public class FourOperationExpFactory implements FourOperationAlg<Exp>  {
	@Override
	public Exp lit(int x) {
		return new Lit(x);
	}

	@Override
	public Exp zero() {
		return new Zero();
	}

	@Override
	public Exp add(Exp e1, Exp e2) {
		return new Add(e1, e2);
	}

	@Override
	public Exp sub(Exp e1, Exp e2) {
		return new Sub(e1, e2);
	}

	@Override
	public Exp multi(Exp e1, Exp e2) {
		return new Multi(e1, e2);
	}

	@Override
	public Exp div(Exp e1, Exp e2) {
		return new Div(e1, e2);
	}

}
