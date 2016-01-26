package multidiv;

import basic.Exp;
import basic.ExpFactory;

public interface MultiDivExpFactory extends MultiExpFactory, DivExpFactory, ExpFactory, MultiDivAlg<Exp> {

}
