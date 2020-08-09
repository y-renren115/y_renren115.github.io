//制御文(ループ文)

//forループ文
import java .util.Scanner;

public class seigyo2 {
  public static void main(String[] args) {

    // int[] arry = {10,20,30,40,50};
    
    // for(int i = 0; i < arry.length; i++) {
    //   System.out.println("arry配列の要素番号:" + i + "=" + arry[i]);
    //}
    // int i = 1;

    // while(i <= 10) {
    //   System.out.println("*");
    //   i ++;
    // }
    int inputNum;
    int sum = 0;

    Scanner scan = new Scanner(System.in);

    System.out.println("整数値を入力してください合計値を出力します。(-1を入力したら終了します。)");

    inputNum = scan.nextInt();

    while(inputNum != -1) {

      sum += inputNum;

      System.out.println("整数値を入力してください");
      inputNum = scan.nextInt();
    }
      System.out.println("入力された数字の合計値は" + sum + "です");
  }
}