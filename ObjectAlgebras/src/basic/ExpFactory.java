package basic;

public interface ExpFactory extends BasicAlg<Exp> {
	@Override
	default Exp lit(int x) {
		return new Lit(x);
	}

	@Override
	default Exp zero() {
		return new Zero();
	}

}
