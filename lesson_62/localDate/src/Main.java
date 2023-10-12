import java.awt.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        // вобьем вручную
        LocalDate tommorow = LocalDate.of(2023, 10, 13);
        System.out.println(tommorow); // 2023-10-13


        LocalTime moment = LocalTime.now();
        System.out.println(moment); // 10:53:25.738690

        LocalTime endOfLesson = LocalTime.of(13, 0, 0);
        System.out.println(endOfLesson); // 13:00

        LocalDateTime thisPointTime = LocalDateTime.now();
        System.out.println(thisPointTime); // 2023-10-12T10:55:35.362735

        LocalDateTime endTomorrowLesson = LocalDateTime.of(2023, 10, 13, 13, 0, 0);
        System.out.println(endTomorrowLesson);

        LocalDateTime endTomorrowClass = LocalDateTime.of(tommorow, endOfLesson);
        System.out.println(endTomorrowClass); // 2023-10-13T13:00

        // Immutability - неизменяемость/немутабельность
        // LocalDate и остальныем- немутабельные


        LocalDate dayAfterTomorrow = today.plusDays(2);
        System.out.println(dayAfterTomorrow); // создали новый объект
        System.out.println(today); //today не изменился

        // Для изменения времени есть методы plus..., minus...
        LocalDate dayOfNextWeek = today.plusDays(7);
        System.out.println(dayOfNextWeek); // 2023-10-19

        LocalDate dayOfLastWeek = today.minusDays(7);
        System.out.println(dayOfLastWeek); // 2023-10-05
        // .plusDays()  .plusMonths()  .plusYears()
        // .minusDays()  .minusMonths()  .minusYears()

        LocalTime consultation = endOfLesson
                .plusHours(2).plusMinutes(30);
        System.out.println(consultation);

        // III. Getting fields values
        int numberOfDayToday = today.getDayOfMonth();
        System.out.println(numberOfDayToday); // 12

        int numberOfDayFromYearBeginnig = today.getDayOfYear();
        System.out.println(numberOfDayFromYearBeginnig); // 285

        DayOfWeek todayDayOfWeek = today.getDayOfWeek();
        System.out.println(todayDayOfWeek); // THURSDAY

        System.out.println(DayOfWeek.MONDAY); // MONDAY

        String germanyDay = DayOfWeek.MONDAY.getDisplayName(TextStyle.FULL, Locale.GERMAN);
        System.out.println(germanyDay); // Montag

        // также можно получать поля LocalTime

        int currentHour = moment.getHour();
        System.out.println(currentHour); // 11

        // IV. Period - промежуток времени
        LocalDate unity = LocalDate.of(1990, 10, 3);
        // промежуток времени
        Period period = Period.between(unity, today);
        System.out.println(period); // P33Y9D
        System.out.println(period.getDays()); // 9 дней
        System.out.println(period.getYears()); // 33 года
        System.out.println(period.getMonths()); // 0

        // как еще можно создать период?
        Period vacation = Period.of(0, 0, 14);
        System.out.println(vacation); // P14D
        int vacationLength = vacation.getDays();
        System.out.println(vacationLength); // 14

        // допустим мой отпуск начинается 2024.02.12
        // отпуск длится 14 дней

        LocalDate startOfVocation = LocalDate.of(2024, 2, 12);
        LocalDate endOfVacation = startOfVocation.plus(vacation);
        System.out.println(endOfVacation); // 2024-02-26

        // V.How to parse string? And to format?
        // Если строка приходит через дефис 2022-12-12
        // parse

        LocalDate christmas = LocalDate.parse("2023-12-24");
        System.out.println(christmas); // 2023-12-24
        // if format is different - we can use DateTimeFormatter
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyy/MM/dd" );
        // указали какой формат у входящей строки
        LocalDate orthodoxChristmas = LocalDate.parse("2023/12/24", formatter);

        // Format
        String unititySlashStyle = formatter.format(unity);
        System.out.println(unititySlashStyle);


        Conference conference = new Conference("Java", "www.eee.dd", "22-12-2023", "12-20");
        System.out.println(conference);





    }
}
