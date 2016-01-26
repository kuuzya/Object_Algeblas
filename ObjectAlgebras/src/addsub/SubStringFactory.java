package addsub;

public interface SubStringFactory extends SubAlg<String> {
	@Override
	public default String sub(String e1, String e2) {
		return e1 + " - " + e2;
	}

}
