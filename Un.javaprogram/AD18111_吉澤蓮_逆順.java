import java.util.Random;
import java.util.Scanner;
public class AD18111_‹gàV˜@_‹t‡ {
	
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("—v‘f”F");
		int n = stdIn.nextInt();  
		int[] a = new int[n];	
        int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = 10 + rand.nextInt(90);
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		for (int i = 0; i < n; i++) {
			b[i] = a[n - i - 1];
		
	}
		for (int i = 0; i < n; i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}


}
}