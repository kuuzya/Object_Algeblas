package basic;

public interface ZeroStringFactory extends ZeroAlg<String> {
	@Override
	default String zero() {
		return "0";
	}

}
