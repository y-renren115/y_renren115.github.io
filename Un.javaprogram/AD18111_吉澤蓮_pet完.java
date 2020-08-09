import java.util.Scanner;
public class AD18111_吉澤蓮_pet完{
	
public static void main(String[] args) {
	Scanner stdln = new Scanner(System.in);
    System.out.println("ペットの名前を入力してください");
    String name = stdln.next();
    System.out.println("飼い主の名前を入力してください");
    String masterName = stdln.next();
    
    Pet date1 = new Pet(name, masterName);
    System.out.println("自己紹介を表示しますか？");
    System.out.println("1:する　2:しない");
    int sent1 = stdln.nextInt();
  
     if( sent1 == 1){
     date1.introduce(); 
     
                    }
     
    System.out.println("ロボットペットについて表示します");
    
    RobotPet date2 = new  RobotPet(name,masterName);
    
    for(int i = 0; i<2; i++){
    System.out.println("表示したい内容を選んでください");
    System.out.println("1:自己紹介　2:家事");
    int sent2 = stdln.nextInt();
                           
    if( sent2 == 1){
    date2.introduce();
    
    }else if( sent2 == 2){
    	System.out.println("0,1,2いずれかの数字を整数で入力してね！");
    	int sw = stdln.nextInt();
    	date2.work(sw);
               }
                             }
                    
  }
     
                   
     }
     

