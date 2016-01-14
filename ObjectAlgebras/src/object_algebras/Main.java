package object_algebras;

public class Main {
	<A> A exp2(IntAlg<A> v){
		return v.add(v.add(v.lit(100), v.lit(1)),v.lit(99));
	}

	<A> A exp(IntAlg<A> v){
		return v.add(v.lit(3), v.lit(4));
	}

	public void check(int x, String s){

	}

	public void test(){
		IntPrint print = new IntPrint();
		IntFactory base = new IntFactory();
		int x;
		String s;
		x = exp(base).eval().getInt();
		s = exp(print).print();
		System.out.println(s);
		System.out.println(x);

		x = exp2(base).eval().getInt();
		s = exp2(print).print();
		System.out.println(s);
		System.out.println(x);
	}

	public static void main(String[] args){
		Main m =  new Main();
		m.test();
	}

}

