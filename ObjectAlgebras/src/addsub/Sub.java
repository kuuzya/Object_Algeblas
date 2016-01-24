package addsub;

import basic.Exp;
import basic.Value;

public class Sub implements Exp {
	Exp e1,e2;

	public Sub(Exp e1, Exp e2) {
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public Value eval() {
		return new Value(){
			@Override
			public int getInt() {
				return e1.eval().getInt() - e2.eval().getInt();
			}
		};
	}

}
