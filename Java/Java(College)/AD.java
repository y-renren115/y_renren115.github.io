
import java.util.Random;
import java.util.Scanner;

public class AD18111_‹gàV˜@_ {
	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner stdln = new Scanner(System.in);
		
		int num = rand.nextInt(1000);
		
		System.out.println("™”“–‚ÄƒQ[ƒ€™");
		System.out.println("0`999‚Ì”‚ğ“–‚Ä‚Ä‚­‚¾‚³‚¢");
		for(int i = 0; i<10; i++);
		int x; //“ü—Í‚µ‚½”
		do{
			System.out.println("‚¢‚­‚Â‚©‚ÈH:");
			x = stdln.nextInt();
			
			if(x<num && x<500)
				System.out.println("‚à‚Á‚Æ‘å‚«‚È”‚Å‚·Bƒqƒ“ƒg:500‚æ‚è‘å‚«‚¢‚Å‚·");
			else if(x>num && x>500)
				System.out.println("‚à‚Á‚Æ¬‚³‚È”‚Å‚·Bƒqƒ“ƒg:500‚æ‚è¬‚³‚¢‚Å‚·");
		}while(x!=num);
		
		System.out.println("³‰ğ‚Å‚·B");
	}

	}

