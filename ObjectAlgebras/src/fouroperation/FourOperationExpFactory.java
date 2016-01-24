package fouroperation;

import addsub.AddSubExpFactory;
import basic.Exp;
import multidiv.MultiDivExpFactory;

public interface FourOperationExpFactory extends AddSubExpFactory, MultiDivExpFactory, FourOperationAlg<Exp>  {

}
