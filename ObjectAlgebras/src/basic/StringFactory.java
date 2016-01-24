package basic;

public class StringFactory implements BasicAlg<String> {
	@Override
	public String lit(int x) {
		return new Integer(x).toString();
	}

	@Override
	public String zero() {
		return new Integer(0).toString();
	}

}
