import java.util.Scanner;
public class AD18111_‹gàV˜@_member1{
public static void main(String[] args) {
		Scanner stdln = new Scanner(System.in);
		
	System.out.println("–¼‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
	String name = stdln.next();
	System.out.println("”N—î‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
	int age = stdln.nextInt();
	System.out.println("”Ô†‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
	int no = stdln.nextInt();
	System.out.println("ZŠ‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
	String address = stdln.next();
	
	memberdateregist information = new memberdateregist(name, age, no, address);
	System.out.println("“o˜^‚µ‚Ü‚µ‚½");
	 information.print();
	}

}
