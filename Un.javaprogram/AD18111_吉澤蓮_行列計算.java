import java.util.Random;
import java.util.Scanner;
public class AD18111_‹gàV˜@_s—ñŒvZ{
	public static void main(String[] args) {
		
		System.out.println("4s3—ñs—ñ‚ÌÏ‚ğŒvZ‚µ‚Ü‚·");
		System.out.println("Šes—ñ‚Ì—v‘f‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢:");
		Scanner stdln = new Scanner(System.in);
				
		
		int[][] a = new int[4][3];
		int[][] b = new int[3][4];
		int[][] c = new int[4][4];
		
		for(int i =0; i<4; i++){
			for(int j =0; j<3; j++){
				System.out.println("s—ñ‚P["+(i+1)+"]["+(j+1)+"]‚Ì’l");
				a[i][j] = stdln.nextInt();
				
				
	}	
	}
		for(int i =0; i<3; i++){
			for(int j =0; j<4; j++){
				System.out.println("s—ñ2["+(i+1)+"]["+(j+1)+"]‚Ì’l");
				b[i][j] = stdln.nextInt();
				
		
		
	}
}
		
		for(int i =0; i<4; i++){
			for(int j =0; j<4; j++){
		int tasu =0;
		for(int k= 0; k<3; k++){
			
			tasu += a[i][k]*b[k][j];
		}
		
		c[i][j] = tasu;
	}
			
	
}
		for(int i =0; i<4; i++){
			for(int j =0; j<4; j++){
				System.out.println("ŒvZŒ‹‰Ê["+(i+1)+"]["+(j+1)+"]="+c[i][j]);
}
	}
}
}