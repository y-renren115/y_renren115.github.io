//制御文復習
import java.util.Scanner;

public class seigyo3 {
  public static void main(String[] args) {
    int inputNum;
    // int[] nums = {5,6,3,8,9,-1,10};
    int sum = 0;

    Scanner scan = new Scanner(System.in);

    System.out.println("整数値を入力してください。(-1で抜けます。)");
    System.out.println("初期値を入力してください。");
    inputNum = scan.nextInt();

    while(true) {
      sum += inputNum;

      if(inputNum == -1) {
        System.out.println("-1が入力されたので処理を抜けます");
        break;
      }
      System.out.println("整数値を入力してください。");
      inputNum = scan.nextInt();
    }
    System.out.println("合計値は:" +sum+ "です。");
    // for(int i = 0; i < nums.length; i++) {
    //   // if(nums[i] < 0) {
    //   //   System.out.println("負の数(" + nums[i] + ")はスキップ!");
    //   //   continue;
    //   // }

    //   sum += nums[i];
    //   System.out.println("nums配列の" + nums[i] + "を加算しました。");
    // }
    // System.out.println("nums配列の合計値は:" + sum + "です");
    // System.out.println("配列要素数:" +nums.length);
    // System.out.println("初期値を整数で入力してください。");
    // inputNum = scan.nextInt();
    // System.out.println("入力された初期値は:" + inputNum + "です。");
    // System.out.println("以下10回まで数値の入力の合計を出力します。");

    // while(inputNum != -1) {
    //   sum += inputNum;

    //   if(sum > 100) {
    //     System.out.println("すみません。これ以上計算できません。");
    //     break;
    //   }
    //   System.out.println("整数値を入力してください。");
    //   inputNum = scan.nextInt();
    // }
    // scan.close();
    // System.out.println("入力された数字の合計は:" +sum+ "です");


  }
}