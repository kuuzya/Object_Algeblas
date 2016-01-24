package addsub;

import basic.StringFactory;

public class AddSubStringFactory extends StringFactory implements AddSubAlg<String> {

	@Override
	public String add(String e1, String e2) {
		return e1 + " + " + e2;
	}

	@Override
	public String sub(String e1, String e2) {
		return e1 + " - " + e2;
	}

}
