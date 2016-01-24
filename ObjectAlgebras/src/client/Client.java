package client;

import addsub.AddSubAlg;
import addsub.AddSubExpFactory;
import addsub.AddSubStringFactory;
import basic.BasicAlg;
import basic.ExpFactory;
import basic.StringFactory;
import multidiv.MultiDivAlg;
import multidiv.MultiDivExpFactory;
import multidiv.MultiDivStringFactory;

public class Client {
	public void test(){
		StringFactory sf = new StringFactory();
		ExpFactory ef = new ExpFactory();

		System.out.println(basicExp(sf));
		System.out.println(basicExp(ef).eval().getInt());
		System.out.println(basicExp2(sf));
		System.out.println(basicExp2(ef).eval().getInt());

		AddSubStringFactory assf = new AddSubStringFactory();
		AddSubExpFactory asef = new AddSubExpFactory();

		System.out.println(addSubExp(assf));
		System.out.println(addSubExp(asef).eval().getInt());
		System.out.println(addSubExp2(assf));
		System.out.println(addSubExp2(asef).eval().getInt());

		MultiDivStringFactory mdsf = new MultiDivStringFactory();
		MultiDivExpFactory mdef = new MultiDivExpFactory();

		System.out.println(multiDivExp(mdsf));
		System.out.println(multiDivExp(mdef).eval().getInt());
		System.out.println(multiDivExp2(mdsf));
		System.out.println(multiDivExp2(mdef).eval().getInt());
	}

	//3
	public <A> A basicExp(BasicAlg<A> v){
		return v.lit(3);
	}

	//0
	public <A> A basicExp2(BasicAlg<A> v){
		return v.zero();
	}

	//2+3
	public <A> A addSubExp(AddSubAlg<A> v){
		return v.add(v.lit(2), v.lit(3));
	}

	//1+3-2
	public <A> A addSubExp2(AddSubAlg<A> v){
		return v.sub(v.add(v.lit(1), v.lit(3)),v.lit(2));
	}

	//5*12
	public <A> A multiDivExp(MultiDivAlg<A> v){
		return v.multi(v.lit(5), v.lit(12));
	}

	// 24/((3*4)/2)
	public <A> A multiDivExp2(MultiDivAlg<A> v){
		return v.div(v.lit(24), v.div(v.multi(v.lit(3), v.lit(4)), v.lit(2)));
	}


	public static void main(String[] args){
		Client c = new Client();
		c.test();
	}
}
