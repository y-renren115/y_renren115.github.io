import java.util.Scanner;
import java.util.Random;
public class AD18111_‹gàV˜@_s—ñŒvZ1 {
	public static void main(String[] args) {
		System.out.println("4~4‚Ì¤•i‚ğ");
		
		int[][] a = {{1,2,3},{4,5,6}};
		int[][] b = {{6,3,4},{5,1,2}};
		int[][] c = {{0,0,0},{0,0,0}};
		
		for(int i=0; i<2; i++)
			for(int j = 0; j<3; j++)
				c[i][j] =a[i][j]+b[i][j];
		
		System.out.println("s—ña");
		for(int i =0; i<2; i++){
			 for(int j =0; j<3; j++)
				 System.out.printf("%3d",a[i][j]);
			     System.out.println();
			     
		}
		System.out.println("s—ñb");
		for(int i =0; i<2; i++){
			for(int j =0; j<3; j++)
				System.out.printf("%3d",b[i][j]);
			    System.out.println();
			    
		}
		System.out.println("s—ñc");
		for(int i =0; i<2;i++){
			for(int j =0; j<3; j++)
				System.out.printf("%3d",c[i][j]);
			    System.out.println();
		}

		}

	

	}


