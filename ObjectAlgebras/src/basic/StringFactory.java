package basic;

public interface StringFactory extends BasicAlg<String> {
	@Override
	 public default String lit(int x) {
		return new Integer(x).toString();
	}

	@Override
	public default String zero() {
		return new Integer(0).toString();
	}

}
