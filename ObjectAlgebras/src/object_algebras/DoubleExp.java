package object_algebras;

interface DoubleExp{
	DoubleValue eval();
}

interface DoubleValue{
	double getDouble();
}

class VDouble implements DoubleValue{
	double x;
	public VDouble(double x) { this.x = x; }
	@Override
	public double getDouble() {
		return x;
	}
}

class DoubleLit implements DoubleExp{
	double x;
	public DoubleLit(double x) { this.x = x; }
	@Override
	public DoubleValue eval() {
		return new VDouble(x);
	}
}

class DoubleAdd implements DoubleExp{
	DoubleExp l,r;
	public DoubleAdd(DoubleExp l, DoubleExp r) { this.l = l; this.r = r; }
	@Override
	public DoubleValue eval() {
		return new VDouble(l.eval().getDouble() + r.eval().getDouble());
	}
}