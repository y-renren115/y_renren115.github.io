import java.util.Scanner;
public class AD18111_吉澤蓮_配列 {
	
public static void main(String[] args) {
		
	Scanner stdln = new Scanner(System.in);
	System.out.print("人数を入力せよ:");
	 int ninzu  = stdln.nextInt();
	 int sum = 0;
    int[] tensu = new int[ninzu];
    System.out.println(ninzu+ "人の点数を入力せよ");
     for(int i = 0; i<ninzu; i++){
    	 System.out.print((i+1)+ "番目の点数:");
    	 tensu[i] = stdln.nextInt();
    	 sum += tensu[i];
     }
      System.out.println("合計点は:" + sum + "点です。");
      System.out.println("平均点は:" + sum/ninzu + "点です。");
	  int max = tensu[0];
	  for(int i =1; i<tensu.length; i++){
		  if(tensu[i]>max)max = tensu[i];
		  
	  }
	  System.out.println("最高点は:" +max+ "点です。");
	  int min = tensu[1];
	  for(int i =1; i<tensu.length; i++){
		  if(tensu[i]<min)min = tensu[i];
		 
	  }
	
	  System.out.println("最低点は:" + min +"点です。");
	
	
	
	}

}
