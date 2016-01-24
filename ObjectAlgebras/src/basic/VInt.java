package basic;

public class VInt implements Value {
	private int x;

	public VInt(int x) {
		this.x = x;
	}

	@Override
	public int getInt() {
		return x;
	}

}
