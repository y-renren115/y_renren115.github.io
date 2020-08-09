//制御文...if,else,else if,switch

public class seigyo {
  public static void main(String[] args) {
    // int old = 25;
    // if (old >= 20 ) {
    //   System.out.println("酒が飲めるぞ！");
    // } else if(old == 19) {
    //   System.out.println("あと一年で酒が飲める！");
    // } else {
    //   System.out.println("まだまだ酒は飲めない...");
    // }

    // String country = "America";
    // if (country.equals("America")) {
    //   System.out.println("アメリカ合衆国");
    // } else if(country.equals("Japan")){
    //   System.out.println("日本");
    // }

    // int age = 24;

    // boolean is_student = false;
    
    // if (age < 25 && is_student) {
    //   System.out.println("学生割引使えます！");
    // } else if(age < 25 || is_student) {
    //   System.out.println("若者割引使えます！");
    // } else {
    //   System.out.println("大人料金になります。");
    // }

    // int kubun = 2;

    // switch(kubun) {
    //   case 1:
    //     System.out.println("区分が一の処理を実行します。");
    //   break;

    //   case 2:
    //     System.out.println("区分が２の処理を実行します。");
    //   break;

    //   case 3:
    //     System.out.println("区分が３の処理を実行します。");
    //   break;
    // }
      String signal = "green";

      switch(signal) {
        case "green":
          System.out.println("GO!");
        break;

        case "yellow":
          System.out.println("carefully!");
        break;

        case "red":
          System.out.println("stop!");
        break;
      }
  }
}