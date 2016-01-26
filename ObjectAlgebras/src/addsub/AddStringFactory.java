package addsub;

public interface AddStringFactory extends AddAlg<String> {
	@Override
	public default String add(String e1, String e2) {
		return e1 + " + " + e2;
	}

}
