package basic;

public class ExpFactory implements BasicAlg<Exp> {
	@Override
	public Exp lit(int x) {
		return new Lit(x);
	}

	@Override
	public Exp zero() {
		return new Zero();
	}

}
