package addsub;

import basic.BasicAlg;

public interface AddSubAlg<A> extends BasicAlg<A> {
	A add(A e1, A e2);
	A sub(A e1, A e2);
}
