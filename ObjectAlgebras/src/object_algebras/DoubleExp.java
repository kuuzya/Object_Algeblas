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

interface DoubleAlg<A>{
	A lit(double x);
	A add(A e1, A e2);
}

class DoublePrint implements DoubleAlg<IPrint> {
	@Override
	public IPrint lit(final double x) {
		return new IPrint(){
			@Override
			public String print() {
				// must change
				return new Double(x).toString();
			}
		};
	}
	@Override
	public IPrint add(IPrint e1, IPrint e2) {
		return new IPrint(){
			@Override
			public String print() {
				return e1.print() + "+" + e2.print();
			}
		};
	}

}

class DoubleFactory implements DoubleAlg<DoubleExp> {
	@Override
	public DoubleExp lit(double x) {
		//must change
		return new DoubleLit(x);
	}
	@Override
	public DoubleExp add(DoubleExp e1, DoubleExp e2) {
		return new DoubleAdd(e1, e2);
	}
}
