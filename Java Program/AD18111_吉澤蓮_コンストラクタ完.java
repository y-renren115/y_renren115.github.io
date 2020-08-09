import java.util.Scanner;
public class AD18111_吉澤蓮_コンストラクタ完 {
public static void main(String[] args){
	Scanner stdln = new Scanner(System.in);
	
	System.out.println("知りたい年月日の曜日をお調べします！");
	System.out.println("年月日を入力してください。入力ミスを含め５回お調べします！");
	for(int i = 0; i<5; i++){
	System.out.println("年を入力してください:");
	int year = stdln.nextInt();
	System.out.println("月を入力してください:");
	int month = stdln.nextInt();
	System.out.println("日を入力してください:");
	int date = stdln.nextInt();
	
	Day inform = new Day(year, month, date);
	
	System.out.print("年" +inform.getYear());
	System.out.print("月" +inform.getMonth());
	System.out.print("日" +inform.getDate());
	System.out.println("この日付でよろしいですね？1:true 2:false");
	int kak = stdln.nextInt();
	if( kak == 1){
		System.out.println("曜日を求めます");
		inform.set(year, month,date);
		inform.dayOfWeek();
		inform.equalTo(inform);
		inform.toString();
		System.out.println(inform);
	}else if( kak == 2){
		System.out.println("年月日を再入力してください");		
		               }
	     }
	}
}

