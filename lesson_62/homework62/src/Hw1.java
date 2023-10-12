import java.util.List;

/*
Задача 1 ⭐⭐⭐⭐
Создайте класс Conference - с полями:

тема String
время LocalDateTime
ссылка на приглашение String В конструкторе конференции нужно принимать отдельно две строки:
date - в формате "dd-MM-yyyy",
time - в формате "HH-mm"
и остальную необходимую информацию
Создайте лист конференций и отсортируйте их по возрастанию (от ближайших к тем которые только будут).
 */
public class Hw1 {
    public static void main(String[] args) {

        List<Conference> conferences = List.of(
                new Conference("Java", "www.eee.dd", "22-12-2023", "12-20"),
                new Conference("Java", "www.eee.dd", "22-11-2023", "12-20"),
                new Conference("Java", "www.eee.dd", "20-11-2023", "12-20"),
                new Conference("Java", "www.eee.dd", "20-01-2024", "12-20"),
                new Conference("Java", "www.eee.dd", "20-01-2024", "12-10")
        );

        System.out.println(conferences);

        List<Conference> sortedConferences = conferences.stream().sorted().toList();
        System.out.println(sortedConferences);

//        List<Conference> sortConferences = conferences.stream().sorted((a, b) -> a.getDateTime().compareTo(b.getDateTime())).toList();
//        System.out.println(sortConferences);

    }
}
