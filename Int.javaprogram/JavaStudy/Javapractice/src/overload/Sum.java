package overload;

public class Sum {

	int z = 10;

	public int sum(int a) {
		return a +1;
	}

	public int sum(int a,int b) {
		return a + b;
	}

	public int sum(int a,int b,int c) {
		return a + b +c;
	}
}
