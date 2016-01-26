package addsub;

import basic.Exp;
import basic.ExpFactory;

public interface AddSubExpFactory extends AddExpFactory, SubExpFactory, ExpFactory, AddSubAlg<Exp> {

}
