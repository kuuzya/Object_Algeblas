package basic;

public class Zero implements Exp {
	@Override
	public Value eval() {
		return new VInt(0);
	}

}
