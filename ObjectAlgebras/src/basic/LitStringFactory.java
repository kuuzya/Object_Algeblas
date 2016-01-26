package basic;

public interface LitStringFactory extends LitAlg<String> {
	@Override
	public default String lit(int x) {
		return new Integer(x).toString();
	}

}
