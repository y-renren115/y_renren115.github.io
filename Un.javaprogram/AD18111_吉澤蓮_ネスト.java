import java.util.Scanner;
 public class AD18111_吉澤蓮_ネスト {
 public static void main(String[] args){
	 Scanner stdln = new Scanner(System.in);
	 System.out.println("あなたのJava入門の評価を表示します");
	 System.out.println("あなたは何回この授業を休みましたか？０～１５で入力してください");
	 int abs = stdln.nextInt();
	 
	 if( abs < 5){
		 System.out.println("出欠席に関しては合格です！");
		 System.out.println("この単位は中間試験50点、期末試験50点の合計100点で評価されます");
		 System.out.println("この単位は100点中60点以上で合格となります");
		 System.out.println("90点以上:S 89～80:A 79～70:B 69～60:C 59～50:D 50点未満:Fで評価がつきます");
		 System.out.println("あなたの中間試験、期末試験の点数を整数で順に入力してください");
		 System.out.print("中間試験の点数:");  int tyu = stdln.nextInt();
		 System.out.print("期末試験の点数:");  int kim = stdln.nextInt();
		 
		 System.out.print("あなたの成績は:");
		 if( tyu + kim >= 90){
			 System.out.println("S");
		 }else if( tyu + kim >= 80 &&  tyu + kim <90){
			 System.out.println("A");
		 }else if(  tyu + kim >= 70 &&  tyu + kim <80){
			 System.out.println("B");
		 }else if(  tyu + kim >=60 &&  tyu + kim <70){
			 System.out.println("C");
		 }else if(  tyu + kim >= 50 &&  tyu + kim <60){
			 System.out.println("D");
		 }else if(  tyu + kim <50){
			 System.out.println("F");
		 }
		 
	}else if( abs >= 5){
		 System.out.println("欠席しすぎです。諦めてください");
	 }
	 
	 
 }
}



