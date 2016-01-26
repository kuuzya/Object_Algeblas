package addsub;

import basic.BasicAlg;

public interface AddAlg<A> extends BasicAlg<A> {
	A add(A e1, A e2);
}