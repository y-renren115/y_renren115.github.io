package chapter1;

public class Classpr1 {

//	private String message;
//
//	public Classpr() {
//		message = "Hello, World";
//	}
//
//	public void print() {
//		System.out.println(message);
//	}
//
//	public static void main(String[] args) {
//
//		Classpr prt = new Classpr();
//
//		prt.print();
//	}

	public String pub_put = "publicメソッドです。";
	protected String pro_put = "protectedです。";
	String pack_put = "packageです。";
	private String pri_put = "privateです。";

	
	public void test() {
		System.out.println(pub_put);
		System.out.println(pro_put);
		System.out.println(pack_put);
		System.out.println(pri_put);
	}

	public static void main(String[] args) {
		Classpr1 outpu = new Classpr1();

		outpu.test();
	}
}
