package checktest;

import java.util.Scanner;

public class originalcheck1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int inputNum;
		String cluc;

		System.out.println("初期化します。初期値を入力してください。");
		inputNum = scan.nextInt();
		System.out.println("入力された初期値は:" + inputNum+ "です");
		System.out.println("入力された合計値を出力しますか？true or false");
		cluc = scan.next();

		if(cluc.equals("true")) {
			while(inputNum != 0) {
			sum += inputNum;

			System.out.println("整数値を入力してください。(0で終了)");
			inputNum = scan.nextInt();
			if(inputNum == 0) {
				System.out.println("現時点で処理を終了します。合計値は:");
				System.out.println(sum);
				break;
			}

			if(sum > 200) {
				System.out.println("合計値が200を超えたので処理をダウンします.");
				System.out.println("合計値:" +sum);
				break;
			}
		  }
		} else {
			System.out.println("処理を終了します。");
		}
	}
}