import java.util.Scanner;
public class AD18111_吉澤蓮_多重ループ {
		public static void main(String[] args) {
			Scanner stdln = new Scanner(System.in);
			System.out.println("整数値を入力してください:");
			int x = stdln.nextInt();
			System.out.println(x+"に100未満になるように８を加算していきます。");
			do{
				System.out.println("x=" +x);
				x +=8;				
			}while(x<100);
			System.out.println("処理が終了しました");
	
			System.out.println("次に左下直角の三角形を表示します。");
			System.out.print("段数は:");
			int n = stdln.nextInt();
			
			for( int i = 1; i<=n; i++){
				for(int j = 1; j<=i; j++)
					System.out.print('*');
				System.out.println();
			
			
			
			
			
	}

}
}

