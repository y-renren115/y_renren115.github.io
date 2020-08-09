package date;

import java.util.Calendar;

public class date {
	public static void main(String[] args) {
//		Date data = new Date();
//		System.out.println(data);

		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.println("今年は" + year);

		boolean isLeapYear = false;
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				isLeapYear = (year % 400 == 0);
			} else {
				isLeapYear = true;
			}
		}
		System.out.println(year + "年はうるう年" + (isLeapYear? "です！":"ではありません。"));
//		System.out.println(cal.get(Calendar.MONTH) +1);
//		System.out.println(cal.get(Calendar.DATE));
//		cal.add(Calendar.MONTH, 6);
	}

}
