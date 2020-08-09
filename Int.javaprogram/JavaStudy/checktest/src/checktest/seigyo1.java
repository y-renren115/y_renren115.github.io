package checktest;

public class seigyo1 {

	  final String name = null;
	  final String pass = null;
//	  int age = 0;
//	  int birth = 0;

	 private static final String const_ms_success = "ログイン成功です！";
	 private static final String const_err_name = "名前に誤りがあります。";
	 private static final String const_err_pass = "パスワードに誤りがあります。";
	 private static final String const_err_all = "入力情報に誤りがあります。";

//	 public seigyo1(String name,String pass,int age,int birth) {
//		 this.name = name;
//		 this.pass = pass;
//		 this.age = age;
//		 this.birth = birth;
//	 }
//
//	 public void printInfo() {
//		 System.out.println("name is:" +this.name);
//		 System.out.println("pass is:" +this.pass);
//		 System.out.println("age is:" +this.age);
//		 System.out.println("birth is:" +this.birth);
//	 }
	 //演算子
	 //算術演算子...+,-,*,/,%
	 //比較演算子...<,>,>=,<=,==,!=
	 //論理演算子...&&,||,!
	 public static void main(String[] args) {

		 //switch文は必ず終わりにbreak文を記入する必要がある。そうしないと次の条件の判定も勝手に行なってしまい、意図しない結果になってしまう
		 String signal = "black";

		 switch(signal) {
		 case("green"):
		 	System.out.println("GO!");
		 	break;
		 case("yellow"):
			 System.out.println("Carefully!");
		 	 break;
		 case("red"):
			 System.out.println("Stop!");
		 	 break;
		 default:
			 System.out.println("故障中です！");
			 break;
		 }

//		 int age = 25;
//		 boolean is_student = false;
//
//		 if(age <= 25 && is_student) {
//			 System.out.println("学生パック使えます！");
//		 } else if(age <= 25 || is_student) {
//			 System.out.println("若者割引使えます！");
//		 }

//		 String name = "alice";
//		 String pass = "abc123";
//
//		 if("alice".equals(name) && "abc123".equals(pass)) {
//			 System.out.println(const_ms_success);
//		 } else if("abc123".equals(pass)) {
//			 System.out.println(const_err_name);
//		 } else if("alice".equals(name)) {
//			 System.out.println(const_err_pass);
//		 } else {
//			 System.out.println(const_err_all);
//		 }
	 }
}



