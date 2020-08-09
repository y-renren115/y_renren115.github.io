package checktest;

public class finalcheck {
	public static void main(String[] args) {

	 //int型の配列変数dataの値を3,1,2,7,5で初期化している。
	int[] data = {3,1,2,7,5};

	for(int k = 0; k < data.length; k++) {
		System.out.print(data[k] + " ");
	}
	System.out.println();
	//バブルソートの実装
	for(int i = 0; i < data.length - 1; i++) {
		for(int j = data.length -1; j > i; j--) {
			int w;
			if(data[j] < data[j-1]) {
				w = data[j-1];
				data[j-1] = data[j];
				data[j] = w;
			}
		}
	  }
	for(int i = 0; i < data.length; i++) {
		System.out.print(data[i] + " ");
	}
  }
}
