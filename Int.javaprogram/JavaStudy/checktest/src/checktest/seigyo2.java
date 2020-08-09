package checktest;
//javaのライブラリであるScannerクラスをインポート
import java.util.Scanner;

public class seigyo2 {
	public static void main(String[] args) {
		//Scannerクラスとnew演算子によってscanというインスタンスを生成している
		Scanner scan = new Scanner(System.in);
		int inputNum;
		int sum;
		sum = 0;

		while(true) {
			System.out.println(sum);
			sum++;
			if(sum == 150) {
				System.out.println("150になったから終了");
				break;
			}
		}
		//for(ループカウンタの初期化;継続条件;ループカウンタの更新)
		//for文の無限ループはfor(;;)
//		System.out.println("初期値を入力してください。");
//	    inputNum = scan.nextInt();
//	    sum += inputNum;
//	    System.out.println("入力された初期値は:" +inputNum);
//
//		while(inputNum != 0) {
//
//			if(inputNum < 0) {
//				System.out.println("負の数はダメですよ。");
//				continue;
//			}
//
//			System.out.println("合計を求めます.(0で終了)");
//			inputNum = scan.nextInt();
//			sum += inputNum;
//		}
//		scan.close(); //inputNumプロパティを閉じる
//		System.out.println("合計値は:" +sum+ "です");

//		String[] fluits = {"みかん","りんご","ぶどう","メロン"};
//
//		for(int i = 0; i < fluits.length; i++) {
//			System.out.println(fluits[i]);
//		}
//
////		int i =1;
////		while(i <= 100) {
////			System.out.println(i);
////			i++;
////		}
////		for(int j = 1; j <=100; j++) {
////			System.out.println(j);
////		}
//
//		for(int k = 1; k <= 9; k++) {
//			System.out.print(k + " || ");
//			for(int l = 1; l <= 9; l++) {
//				System.out.print(k + "×" + l + "=" + (k*l) + " | ");
//			}
//			System.out.println();
//		}
	}
}
