package basic;

public class Lit implements Exp {
	private int x;

	public Lit(int x) {
		this.x = x;
	}

	@Override
	public Value eval() {
		return new VInt(x);
	}

}
