package multidiv;

import basic.StringFactory;

public interface MultiDivStringFactory extends StringFactory, MultiDivAlg<String> {
	@Override
	public default String multi(String e1, String e2) {
		return "(" + e1 + " * " + e2 + ")";
	}

	@Override
	public default String div(String e1, String e2) {
		return "(" + e1 + " / " + e2 + ")";
	}

}
