import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws IOException {
        Date date = new Date();
        System.out.println("Милисекунды " + date.getTime()); // Unix Timestamp - сколько прошло милисикунд с 1 января 1970 года
        System.out.println(date);
        System.out.println("Секунды " + date.getTime() / 1000); // секунды
        System.out.println("Минуты " + date.getTime() / 1000 / 60);
        System.out.println("Часы " + date.getTime() / 1000 / 60 / 60);
        System.out.println("Дни " + date.getTime() / 1000 / 60 / 60 / 24);
        System.out.println("Года " + date.getTime() / 1000 / 60 / 60 / 24 / 365);

        // Проблемы класса Date
        System.out.println(date.getMonth()); // 9 месяц - нумерация с нуля
        System.out.println(date.getYear()); // c 1900 года
        date.setTime(125);
        System.out.println(date.getYear());

        // 1997 Calendar - для работы с классом Date - в нем есть более адекватные методы

        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar);

        Date current = calendar.getTime(); // текущая дата
        System.out.println(current); // Wed Oct 11 11:43:16 CEST 2023
        calendar.set(Calendar.DATE, 15); // поменял число на 15
//        calendar.set(Calendar.YEAR, 2020); // поменял год на 2020
//        calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY); // поменяли день недели на среду
        System.out.println(calendar.getTime());

        int currentYear = calendar.get(Calendar.YEAR); // получить год
        System.out.println(currentYear);

        // Пример создания с параметрами конструктора
        Calendar calendar1 = new GregorianCalendar(2022, Calendar.JANUARY, 28);


        // Как вас зовут? Год рождения? Тогда вам столько то лет
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Привет! Как тебя зовут?");
//        String name = br.readLine();
//        System.out.println("Приятно познпкомится " + name + " Какого ты года рождения?");
//        int yearOfBirth = Integer.parseInt(br.readLine());
//        int age = calendar.get(Calendar.YEAR) - yearOfBirth;
//        System.out.println("Значит тебе " + age + ", или  " + (age-1));

        //---------roll---------
        Calendar calendar2 = new GregorianCalendar();
        calendar2.roll(Calendar.DATE, -10); // изменяет дату на переданное значение
        System.out.println(calendar.getTime());

        // сравнение календарей
        System.out.println(calendar2.after(calendar1));

        // сравнение дат
        System.out.println(calendar.before(new Date()));

    }
}
