package multidiv;

import basic.BasicAlg;

public interface MultiDivAlg<A> extends BasicAlg<A> {
	A multi(A e1, A e2);
	A div(A e1, A e2);
}
