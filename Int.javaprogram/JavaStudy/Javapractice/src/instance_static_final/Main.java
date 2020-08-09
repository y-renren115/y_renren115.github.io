package instance_static_final;

public class Main {
	public static void main(String[] args) {
		instanceOfY y1 = new instanceOfY("ren");
		instanceOfY y2 = new instanceOfY("ran");
		instanceOfY y3 = new instanceOfY("ren");

		System.out.println("--- インスタンスごとのハッシュコード ---");
        System.out.println("y1のハッシュコード: " + y1.hashCode());
        System.out.println("y2のハッシュコード: " + y2.hashCode());
        System.out.println("y3のハッシュコード: " + y3.hashCode());

        System.out.println("--- 「sato1 と sato2」のインスタンスが同一かのチェック ---");
        System.out.println("参照先インスタンスの比較　　: " + (y1 == y2));
        System.out.println("参照先インスタンスの値の比較: " + (y1.equals(y2)));
	}
}
