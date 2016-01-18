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

