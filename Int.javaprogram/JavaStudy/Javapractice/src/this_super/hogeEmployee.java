package this_super;

public class hogeEmployee extends Employee {

	boolean isTraineer;

	public hogeEmployee() {
	}

	public hogeEmployee(int empId,String name) {

		super(empId,name);
		boolean isTraineer;
		if(empId != 10192) {
			isTraineer = true;
		} else {
			isTraineer = false;
		}
		System.out.println(this.isTraineer ? "研修生です" : "研修生ではありません" );
	}

	 public hogeEmployee(int empId, String name, boolean isTrainee) {
	        // ①挙動確認: 親クラス（Employee）のコンストラクタを呼び出す
	        super(empId, name);
	        // ②挙動確認: 自クラスのフィールド変数（isTrainee）へコンストラクタの引数を格納する
	        this.isTraineer = isTrainee;
	        // ③挙動確認: thisを指定せずに格納する その2
	        isTrainee = true;
	        System.out.println(this.isTraineer ? "研修生です" : "研修生ではありません");

	        this.printEmployee();
	        super.printEmployee();
	 }
}
