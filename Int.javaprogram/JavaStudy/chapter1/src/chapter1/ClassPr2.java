package chapter1;

class ClassPr2 {

	//フィールド↓
	int age;
	String name;
	String men = "aoki";

	//メソッド
	public void printper() {
		age = 20;
		name = "taguti";
		System.out.println(age);
		System.out.println(name);
		System.out.println(this.men);
	}

}
//メインメソッド
public class Main {
	public static void main(String[] args) {
		ClassPr2 per = new ClassPr2();
		per.printper();
	}
}
