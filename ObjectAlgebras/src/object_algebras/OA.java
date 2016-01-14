package object_algebras;

// Initial object algebra interface for expressions: integers and addition
interface ExpAlg<E> {
	E lit(int x);
	E add(E e1, E e2);
}

// An object algebra implementing that interface (evaluation)
// The evaluation interface
interface Eval {
	int eval();
}

// The object algebra
class EvalExpAlg implements ExpAlg<Eval> {
	@Override
	public Eval lit(final int x) {
		return new Eval() {
			@Override
			public int eval() {
				return x;
			}
		};
	}
	@Override
	public Eval add(final Eval e1, final Eval e2) {
		return new Eval() {
			@Override
			public int eval() {
				return e1.eval() + e2.eval();
			}
		};
	}
}

// Evolution 1: Adding subtraction
interface SubExpAlg<E> extends ExpAlg<E> {
	E sub(E e1, E e2);
}

// Updating evaluation:
class EvalSubExpAlg extends EvalExpAlg implements SubExpAlg<Eval> {
	@Override
	public Eval sub(final Eval e1, final Eval e2) {
		return new Eval() {
			@Override
			public int eval() {
				return e1.eval() - e2.eval();
			}
		};
	}
}

// Evolution 2: Adding pretty printing
interface PPrint {
	String print();
}

class PrintExpAlg implements SubExpAlg<PPrint> {
	@Override
	public PPrint lit(final int x) {
		return new PPrint() {
			@Override
			public String print() {
				return (new Integer(x)).toString();
			}
		};
	}
	@Override
	public PPrint add(final PPrint e1, final PPrint e2) {
		return new PPrint() {
			@Override
			public String print() {
				return e1.print() + " + " + e2.print();
			}
		};
	}
	@Override
	public PPrint sub(final PPrint e1, final PPrint e2) {
		return new PPrint() {
			@Override
			public String print() {
				return e1.print() + " - " + e2.print();
			}
		};
	}
}

// An alternative object algebra for pretty printing:

// Often, when precise control over the invocation of
// methods is not needed, we can simplify object algebras.
// For example, here's an alternative implementation
// of pretty printing that directly computes a string:

class PrintExpAlg2 implements SubExpAlg<String> {
	@Override
	public String lit(int x) {
		return (new Integer(x)).toString();
	}
	@Override
	public String add(String e1, String e2) {
		return e1 + " + " + e2;
	}
	@Override
	public String sub(String e1, String e2) {
		return e1 + " - " + e2;
	}
}

// Testing

public class OA {
	// An expression using the basic ExpAlg
	static <E> E exp1(ExpAlg<E> alg) {
		return alg.add(alg.lit(3), alg.lit(4));
	}

	// An expression using subtraction too
	static <E> E exp2(SubExpAlg<E> alg) {
		return alg.sub(exp1(alg), alg.lit(4));
	}

	public static void main(String args[]) {
		// Some object algebras:
		//EvalExpAlg ea = new EvalExpAlg();
		EvalSubExpAlg esa = new EvalSubExpAlg();
		PrintExpAlg pa = new PrintExpAlg();
		PrintExpAlg2 pa2 = new PrintExpAlg2();

		// We can call esa with exp1
		Eval ev = exp1(esa);

		// But calling ea with exp2 is an error
		// Eval ev_bad = exp2(ea);

		// Testing the actual algebras
		System.out.println("Evaluation of exp1 \"" + exp1(pa).print() + "\" is: " + ev.eval());
		System.out.println("Evaluation of exp2 \"" + exp2(pa).print() + "\" is: " + exp2(esa).eval());
		System.out.println("The alternative pretty printer works nicely too!\nexp1: " + exp1(pa2) + "\nexp2: " + exp2(pa2));

	}
}