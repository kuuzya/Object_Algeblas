package basic;

public interface ZeroExpFactory extends ZeroAlg<Exp> {
	@Override
	default Exp zero() {
		return new Zero();
	}

}
