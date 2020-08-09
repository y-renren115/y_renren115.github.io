package chapter1;

//ConstructorSample.java
class ConstructorSample {
 String str = "Blue Engineer";

 // コンストラクタ
 public ConstructorSample() {
     System.out.println(str);
 }
}

//Main.java
public class Main {

 public static void main(String[] args) {
     // インスタンスの生成
     ConstructorSample cs = new ConstructorSample();
 }

}
