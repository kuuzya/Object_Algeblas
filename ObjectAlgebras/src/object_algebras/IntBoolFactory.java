package object_algebras;

/* Extended Expression Factory */
class IntBoolFactory extends IntFactory implements IntBoolAlg<Exp> {
	public Exp bool(Boolean b) {
		return new Bool(b);
	}
	public Exp iff(Exp e1, Exp e2, Exp e3) {
		return new Iff(e1,e2,e3);
	}
}

/* Extended Retroactive Implementation for Printing */
class IntBoolPrint extends IntPrint implements IntBoolAlg<IPrint> {
	@Override
	public IPrint bool(final Boolean b) {
		return new IPrint() {
			@Override
			public String print() {
				return new Boolean(b).toString();}
		};
	}
	@Override
	public IPrint iff(final IPrint e1, final IPrint e2, final IPrint e3) {
		return new IPrint() {
			@Override
			public String print() {
				return "if (" + e1.print() + ") then " + e2.print() + " else " + e3.print();
			}
		};
	}
}
//
//interface Value2{
//	boolean getbool();
//}
//
//interface Exp2 extends Exp{
//
//}

class Bool implements Exp {
	Boolean e;
	public Bool(Boolean e) {
		this.e = e;
	}
	@Override
	public Value eval() {
		if(e){
			return new VInt(1);
		}else{
			return new VInt(0);
		}
	}
}
class Iff implements Exp {
	Exp e1,e2,e3;
	public Iff(Exp e1, Exp e2, Exp e3) {
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
	}
	@Override
	public Value eval() {
		if(e1.eval().getInt()==1){
			return e2.eval();
		}else{
			return e3.eval();
		}
	}
}
