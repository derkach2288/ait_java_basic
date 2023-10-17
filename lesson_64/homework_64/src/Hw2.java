import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/*
Задание 2 Todo лист - лист задач (опциональное)
Создайте класс Task с полями:

title
description
status
date - LocalDate С методами:
switchStatus
changeTitle(String title)
Пусть задача создается со статусом не выполнено. Создайте лист задач. Пусть хотя бы одна будет на эту субботу. Дополнительно:

Поменяйте название на прописные буквы для тех задач, которые будут в течение 10 дней с настоящего момента.
Поменяйте статус у задач, которые назначены на субботу.
Напишите метод procrastinate - который откладывает задачу на один день.
Отложите все задачи листа на один день.
 */
public class Hw2 {
    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>(List.of(
                new Task("make header", "String header", new Date("18-11-2023")),
                new Task("make footer", "String footer", new Date("16-10-2023")),
                new Task("make footer", "String footer", new Date("17-10-2023")),
                new Task("make description", "String description", new Date("21-10-2023"))
        ));

        System.out.println(tasks);

        // Поменяйте название на прописные буквы для тех задач,
        // которые будут в течение 10 дней с настоящего момента.
        tasks.stream().filter(task -> {
            LocalDate today = LocalDate.now();
            if (today.plusDays(10).isAfter(task.getDate().getLocalDate()) && today.minusDays(1).isBefore(task.getDate().getLocalDate())){
                return true;
            } else return false;
        }).forEach(task -> task.setChangeTitle(task.getTitle().toUpperCase()));
        System.out.println(tasks);


//         Поменяйте статус у задач, которые назначены на субботу.
        tasks.stream()
                .filter(task -> task.getDate().getLocalDate().getDayOfWeek().equals(DayOfWeek.SATURDAY))
                .forEach(task -> task.setSwitchStatus());
        System.out.println(tasks);

        // Отложите все задачи листа на один день.
        tasks.stream().forEach(task -> procrastinate(task));
        System.out.println(tasks);



    }
//Напишите метод procrastinate - который откладывает задачу на один день.
    public static void procrastinate(Task task){
        task.setDate(new Date(task.getDate().getLocalDate().plusDays(1)));

    }
}
