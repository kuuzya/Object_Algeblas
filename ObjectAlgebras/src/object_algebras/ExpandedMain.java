package object_algebras;

public class ExpandedMain extends Main {
	// 2 * 3 -> 6
	public <A> A expandedExp(ExpandedIntAlg<A> v){
		return v.multi(v.lit(2), v.lit(3));
	}

	// 6 * (5 - 4 / 2) -> 18
	public <A> A expandedExp2(ExpandedIntAlg<A> v){
		return v.multi(v.lit(6), v.minus(v.lit(5), v.div(v.lit(4), v.lit(2))));
	}

	public void expandedTest(){
		ExpandedIntPrint print = new ExpandedIntPrint();
		ExpandedIntFactory base = new ExpandedIntFactory();
		int x;
		String s;
		// Main.test と同じ書き方でOK
		x = exp(base).eval().getInt();
		s = exp(print).print();
		System.out.println(s);
		System.out.println(x);

		x = exp2(base).eval().getInt();
		s = exp2(print).print();
		System.out.println(s);
		System.out.println(x);

		// もしくは素直にthis.test();で同じものが呼べる
		this.test();

		x = expandedExp(base).eval().getInt();
		s = expandedExp(print).print();
		System.out.println(s);
		System.out.println(x);

		x = expandedExp2(base).eval().getInt();
		s = expandedExp2(print).print();
		System.out.println(s);
		System.out.println(x);

	}

	public static void main(String[] args){
		ExpandedMain em = new ExpandedMain();
		em.expandedTest();
	}
}
