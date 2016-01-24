package multidiv;

import basic.Exp;
import basic.Value;

public class Div implements Exp {
	private Exp e1,e2;

	public Div(Exp e1, Exp e2) {
		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public Value eval() {
		return new Value(){
			@Override
			public int getInt() {
				return e1.eval().getInt() / e2.eval().getInt();
			}
		};
	}
}
