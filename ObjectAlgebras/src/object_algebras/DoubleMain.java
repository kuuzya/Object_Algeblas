package object_algebras;

public class DoubleMain {
	public <A> A doubleExp(DoubleAlg<A> v){
		return v.add(v.lit(3.0), v.lit(4.0));
	}

	public <A> A doubleExp2(DoubleAlg<A> v){
		return v.add(v.add(v.lit(100.0), v.lit(1.0)),v.lit(99.0));
	}

	public void test(){
		DoublePrint print = new DoublePrint();
		DoubleFactory base = new DoubleFactory();
		double x;
		String s;
		//must change
		x = doubleExp(base).eval().getDouble();
		s = doubleExp(print).print();
		System.out.println(s);
		System.out.println(x);

		x = doubleExp2(base).eval().getDouble();
		s = doubleExp2(print).print();
		System.out.println(s);
		System.out.println(x);
	}

	public static void main(String[] args){
		DoubleMain dm =  new DoubleMain();
		dm.test();
	}

}
