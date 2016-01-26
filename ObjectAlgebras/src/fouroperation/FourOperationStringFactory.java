package fouroperation;

import addsub.AddSubStringFactory;
import multidiv.MultiDivStringFactory;

public interface FourOperationStringFactory extends AddSubStringFactory, MultiDivStringFactory, FourOperationAlg<String> {
	@Override
	public default String add(String e1, String e2) {
		return "(" + e1 + " + " + e2 + ")";
	}

	@Override
	public default String sub(String e1, String e2) {
		return "(" + e1 + " - " + e2 + ")";
		}

}
