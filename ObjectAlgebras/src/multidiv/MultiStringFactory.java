package multidiv;

public interface MultiStringFactory extends MultiAlg<String> {
	@Override
	public default String multi(String e1, String e2) {
		return "(" + e1 + " * " + e2 + ")";
	}

}
