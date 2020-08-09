import java.util.Scanner;
public class AD18111_吉澤蓮_if {
	public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		System.out.print("整数x:"); int x = stdln.nextInt();
		System.out.print("整数y:"); int y = stdln.nextInt();
		if(x < y ){
			int t = x;
			x = y;
			y = t;
		}
		System.out.println("x>=となるようにソートしました。");
		System.out.println("変数xは"+x+"です。");
		System.out.println("変数yは"+y+"です。");
	}

}
