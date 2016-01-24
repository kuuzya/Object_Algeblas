package object_algebras;

import java.util.ArrayList;

class Mod implements Exp{
	Exp l,r;
	public Mod(Exp l, Exp r) { this.l = l; this.r = r; }
	@Override
	public Value eval() {
		return new VInt(l.eval().getInt() % r.eval().getInt());
	}
}

class Average implements Exp{
	ArrayList<Exp> exps;
	public Average(ArrayList<Exp> exps) { this.exps = exps;}
	public Average(Exp l, Exp r) {
		ArrayList<Exp> exps = new ArrayList<Exp>();
		exps.add(l); exps.add(r);
		this.exps = exps;
	}
	@Override
	public Value eval() {
		if(exps.size()==0){
			return new VInt(0);
		}else{
			int i=0;
			for(Exp exp : exps){
				i += exp.eval().getInt();
			}
			i /= exps.size();
			return new VInt(i);
		}
	}
}
interface ExpandedIntAlg2<A> extends IntAlg<A> {
	A mod(A e1, A e2);
	A average(ArrayList<A> es);
}

class ExpandedIntFactory2 extends IntFactory implements ExpandedIntAlg2<Exp> {
	@Override
	public Exp mod(Exp e1, Exp e2) {
		return new Mod(e1,e2);
	}

	@Override
	public Exp average(ArrayList<Exp> es) {
		return new Average(es);
	}

}

class ExpandedIntPrint2 extends IntPrint implements ExpandedIntAlg2<IPrint>{
	@Override
	public IPrint mod(final IPrint e1, IPrint e2) {
		return new IPrint(){
			@Override
			public String print() {
				return e1.print() + "%" + e2.print();
			}
		};
	}

	@Override
	public IPrint average(final ArrayList<IPrint> es) {
		return new IPrint(){
			@Override
			public String print() {
				String ans = "Average(";
				for(IPrint e : es){
					ans += e.print()+",";
				}
				ans = ans.substring(0, ans.length()-1);
				return ans + ")";
			}
		};
	}

}