package javaText;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class smpledate {
	 public static void main(String[] args) throws ParseException {
        String dateTime = "2020/08/08 21:23:40";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        ocalDateTime ldt2 = LocalDateTime.parse(date, dtf);
    }
}
