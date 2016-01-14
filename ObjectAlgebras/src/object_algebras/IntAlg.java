package object_algebras;

/*
 * Vistor Pattern for arithmetic expressions
 * and also AO interface
 * */
interface IntAlg<A>{
	A lit(int x);
	A add(A e1, A e2);
}
