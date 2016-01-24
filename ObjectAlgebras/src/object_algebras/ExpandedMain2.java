package object_algebras;
import java.util.ArrayList;


public class ExpandedMain2 extends Main {
	public <A> A expanded2Exp(ExpandedIntAlg2<A> v){
		return v.mod(v.lit(3), v.lit(4));
	}

	public <A> A expanded2Exp2(ExpandedIntAlg2<A> v){
		ArrayList<A> es = new ArrayList<A>();
		es.add(v.lit(10)); es.add(v.lit(6)); es.add(v.lit(14));
		return v.average(es);
	}

	public void expanded2Test(){
		ExpandedIntPrint2 print = new ExpandedIntPrint2();
		ExpandedIntFactory2 base = new ExpandedIntFactory2();
		int x;
		String s;

		s = expanded2Exp(print).print();
		x = expanded2Exp(base).eval().getInt();
		System.out.println(s);
		System.out.println(x);

		s = expanded2Exp2(print).print();
		x = expanded2Exp2(base).eval().getInt();
		System.out.println(s);
		System.out.println(x);
	}

	public static void main(String[] args){
		ExpandedMain2 em2 =  new ExpandedMain2();
		em2.expanded2Test();
	}

}
