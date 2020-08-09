//クラス・フィールド変数

public class Classpr {

  private String message; //フィールド変数(変数)とはクラス内で使える変数

  public Classpr() {
    message = "Hellow,World";
  }
  public void print() {
    System.out.println(message);
  }
    public static void main(String[] args) {

    Classpr hj = new Classpr();
    hj.print();
    }
}

