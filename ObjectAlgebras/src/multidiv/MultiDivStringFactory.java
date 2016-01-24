package multidiv;

import basic.StringFactory;

public class MultiDivStringFactory extends StringFactory implements MultiDivAlg<String> {
	@Override
	public String multi(String e1, String e2) {
		return "(" + e1 + " * " + e2 + ")";
	}

	@Override
	public String div(String e1, String e2) {
		return "(" + e1 + " / " + e2 + ")";
	}

}
