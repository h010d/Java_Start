package Lessons_Java_Start;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
    public static void main(String[] args) throws Exception {
        Date date = new Date(0);
        Date date1 = new Date();
        System.out.println(date);
        System.out.println(date1);
        Calendar calendar = Calendar.getInstance();
       calendar.setTime(date1);
        System.out.println("+++++++++");
        System.out.println(calendar.getTime());
       calendar.add(Calendar.WEEK_OF_MONTH, 1);
       calendar.add(Calendar.MINUTE, 2);
        System.out.println("+++++++++");
        System.out.println(calendar.getTime());
        System.out.println("+++++++++");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println("+++++++++");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        Date newDAte = simpleDateFormat.parse("05/12/1985 05:22");
        System.out.println(newDAte);
    }
}
