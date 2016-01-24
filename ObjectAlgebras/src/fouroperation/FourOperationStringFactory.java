package fouroperation;

public class FourOperationStringFactory implements FourOperationAlg<String> {
	@Override
	public String lit(int x) {
		return new Integer(x).toString();
	}

	@Override
	public String zero() {
		return new Integer(0).toString();
	}

	@Override
	public String add(String e1, String e2) {
		return "(" + e1 + " + " + e2 + ")";
	}

	@Override
	public String sub(String e1, String e2) {
		return "(" + e1 + " - " + e2 + ")";
	}

	@Override
	public String multi(String e1, String e2) {
		return "(" + e1 + " * " + e2 + ")";
	}

	@Override
	public String div(String e1, String e2) {
		return "(" + e1 + " / " + e2 + ")";
	}

}
