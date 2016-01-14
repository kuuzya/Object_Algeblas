package object_algebras;

// Factory class nimonatteru Objectをたくさん作るよ
class IntPrint implements IntAlg<IPrint> {
	//Note: return annonymous inner class that implements IPrint.
	@Override
	public IPrint lit(final int x) {
		return new IPrint(){
			@Override
			public String print() {
				return new Integer(x).toString();
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

class IntFactory implements IntAlg<Exp> {
	@Override
	public Exp lit(int x) {
		return new Lit(x);
	}
	@Override
	public Exp add(Exp e1, Exp e2) {
		return new Add(e1, e2);
	}
}

interface IPrint {
	String print();
}