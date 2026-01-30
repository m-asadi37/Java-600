package pack2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException, ParseException {
        Date now = new Date();
        System.out.println(now);

        System.out.println(System.currentTimeMillis());
        Thread.sleep(1000);
        System.out.println(System.currentTimeMillis());

        long millis = System.currentTimeMillis();
        Date yesterday = new Date(millis - (24 * 60 * 60 * 1000));
        System.out.println(yesterday);

        System.out.println(now.after(yesterday));
        System.out.println(now.getDay());

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getWeekYear());

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Date date = sdf.parse(str);
        System.out.println(date);

        System.out.println(sdf.format(now));
    }
}
