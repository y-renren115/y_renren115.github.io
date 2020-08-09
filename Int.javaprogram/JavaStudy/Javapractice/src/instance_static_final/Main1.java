package instance_static_final;

public class Main1 {
	public static void main(String[] args) {
		System.out.println("instanceOfYRの出力");

		instanceOfYR yos1 = new instanceOfYR();
		yos1.incrementId("yos1");
		
		instanceOfYR yos2 = new instanceOfYR();
		yos2.incrementId("yos2");
	}
}
