import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main2 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        Date current = calendar.getTime();
        System.out.println(current);

        /*
        4 цифры для года (yyyy);
2 цифры для месяца (ММ);
2 цифры для дня (dd);
2 цифры для часов в 24-часовом формате (HH);
2 цифры для минут (mm);
2 цифры для секунд (ss). Знаки разделения и порядок расстановки символов шаблона сохраняется.
         */
        SimpleDateFormat formatter = new SimpleDateFormat("yyy, dd,MM");
        String currentAsString = formatter.format(current);
        System.out.println(currentAsString);


        // Создайте и выведите следующие значения "2018-12 13" год месяц день
        Calendar calendar1 = new GregorianCalendar();

        calendar1.set(Calendar.YEAR, 2018);
        calendar1.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar1.set(Calendar.DATE, 13);
        Date current1 = calendar1.getTime();


        SimpleDateFormat formatter1 = new SimpleDateFormat("yyy-MM dd");
        String format = formatter1.format(current1);
        System.out.println(format);

        //var2
        Calendar calendar2 = new GregorianCalendar(2018, Calendar.DECEMBER, 13);
        Date date2 = calendar2.getTime();
        SimpleDateFormat formatter2 = new SimpleDateFormat("yyy-MM dd");
        String dateString2 = formatter2.format(date2);
        System.out.println(dateString2);


        //меняем дату умным методом, чтоб менялся год, месяц и тд
        calendar2.add(Calendar.DATE, 20);
        System.out.println(calendar2.getTime());
        calendar2.add(Calendar.DATE, -20);
        System.out.println(calendar2.getTime());

    }
}
