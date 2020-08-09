package checktest;

public class originalcheck2 {
	public static void main(String[] args) {
		//オリジナルバブルソートの実装
		int[] arry = {10,50,70,60,80,30};

		//そのまま順に表示
		for(int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + " ");
		}
		System.out.println();

		//バブルソート
		int w;
		for(int j = 0; j < arry.length-1; j++) {
			for(int k = arry.length - 1; k > j; k--) {
				if(arry[k-1] > arry[k]) {
					w = arry[k-1];
					arry[k-1] = arry[k];
					arry[k] = w;
				}
			}
		}
		for(int i = 0; i < arry.length; i++) {
			System.out.print(arry[i] + " ");
		}
	}

}
