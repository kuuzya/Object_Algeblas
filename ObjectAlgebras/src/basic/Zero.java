package basic;

public class Zero implements Exp {
	@Override
	public Value eval() {
		return () -> 0;
	}

}
