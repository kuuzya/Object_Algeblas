package object_algebras;

public class Print2 implements IntAlg<String> {
	@Override
	public String lit(int x) {
		return new Integer(x).toString();
	}
	@Override
	public String add(String e1, String e2) {
		return e1 + " + " + e2;
	}

}

interface IntBoolAlg<A> extends IntAlg<A> {
	A bool(Boolean b);
	A iff(A e1, A e2, A e3);
}

