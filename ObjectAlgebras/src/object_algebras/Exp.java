package object_algebras;

interface Value {
	int getInt();
}

class VInt implements Value{
	int x;
	public VInt(int x) {
		this.x = x;
	}
	@Override
	public int getInt() {
		return x;
	}
}

interface Exp {
	Value eval();
}

class Lit implements Exp {
	int x;
	public Lit(int x) { this.x = x; }
	public Value eval() {
		return new VInt(x);
	}
}

class Add implements Exp {
	Exp l, r;
	public Add(Exp l, Exp r) { this.l = l; this.r = r; }
	public Value eval() {
		return new VInt(l.eval().getInt() + r.eval().getInt());
	}
}
