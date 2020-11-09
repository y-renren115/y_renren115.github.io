
public class AD18111_‹gàV˜@_‘½ŽŸŒ³”z—ñ {
	public static void main(String[] args) {
		 int[][][]x = new int[4][4][4]; //3ŽŸŒ³‚Ì”z—ñ‚ð•\Ž¦‚µ‚Ü‚·
		 
		 x[0][0][0] =27;
		 x[0][1][2] =37;
		 x[0][3][3] =54;
		 x[1][2][3] =65;
		 x[3][3][3] =49;
		 for(int i= 0; i<4; i++)
			 for(int j = 0; j<4; j++)
				 for(int k =0; k<4; k++)
				 System.out.println("x["+i+"]["+j+"]["+k+"]="+x[i][j][k]);
		
	}

}
