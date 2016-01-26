package basic;

public interface LitExpFactory extends LitAlg<Exp> {
	@Override
	default Exp lit(int x) {
		return new Lit(x);
	}

}
