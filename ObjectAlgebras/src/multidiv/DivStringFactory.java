package multidiv;

public interface DivStringFactory extends DivAlg<String> {
	@Override
	public default String div(String e1, String e2) {
		return "(" + e1 + " / " + e2 + ")";
	}

}
