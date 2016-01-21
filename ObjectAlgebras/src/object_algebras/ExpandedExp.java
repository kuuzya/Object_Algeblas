package object_algebras;

class Minus implements Exp{
	Exp l,r;
	public Minus(Exp l, Exp r) { this.l = l; this.r = r; }
	@Override
	public Value eval() {
		return new VInt(l.eval().getInt() - r.eval().getInt());
	}
}

class Multi implements Exp{
	Exp l,r;
	public Multi(Exp l, Exp r) { this.l = l;	this.r = r; }
	@Override
	public Value eval() {
		return new VInt(l.eval().getInt() * r.eval().getInt());
	}
}

class Div implements Exp{
	Exp l,r;
	public Div(Exp l, Exp r) { this.l = l;	this.r = r; }
	@Override
	public Value eval() {
		return new VInt(l.eval().getInt() / r.eval().getInt());
	}
}

interface ExpandedIntAlg<A> extends IntAlg<A> {
	A minus(A e1, A e2);
	A multi(A e1, A e2);
	A div(A e1, A e2);
}

class ExpandedIntFactory extends IntFactory implements ExpandedIntAlg<Exp> {
	@Override
	public Exp minus(Exp e1, Exp e2) {
		return new Minus(e1, e2);
	}

	@Override
	public Exp multi(Exp e1, Exp e2) {
		return new Multi(e1, e2);
	}

	@Override
	public Exp div(Exp e1, Exp e2) {
		return new Div(e1, e2);
	}

}

class ExpandedIntPrint extends IntPrint implements ExpandedIntAlg<IPrint>{
	@Override
	public IPrint minus(IPrint e1, IPrint e2) {
		return new IPrint(){
			@Override
			public String print() {
				return e1.print() + "-" + e2.print();
			}
		};
	}

	@Override
	public IPrint multi(IPrint e1, IPrint e2) {
		return new IPrint(){
			@Override
			public String print() {
				return e1.print() + "*" + e2.print();
			}
		};
	}

	@Override
	public IPrint div(IPrint e1, IPrint e2) {
		return new IPrint(){
			@Override
			public String print() {
				return e1.print() + "/" + e2.print();
			}
		};
	}

}