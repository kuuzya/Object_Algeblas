package fouroperation;

import addsub.AddSubStringFactory;
import multidiv.MultiDivStringFactory;

public interface FourOperationStringFactory extends AddSubStringFactory, MultiDivStringFactory, FourOperationAlg<String> {

}
