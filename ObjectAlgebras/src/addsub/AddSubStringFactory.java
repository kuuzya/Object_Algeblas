package addsub;

import basic.StringFactory;

public interface AddSubStringFactory extends StringFactory, AddSubAlg<String> {

	@Override
	public default String add(String e1, String e2) {
		return e1 + " + " + e2;
	}

	@Override
	public default String sub(String e1, String e2) {
		return e1 + " - " + e2;
	}

}
