/*
Предствьте, у вас есть робот, которвй понимает команды:
'С' - шаг на север
'Ю' - шаг на юг
'З' - шаг на запад
'В' - шаг на восток
Команды робату поступают в виде строки вида "CЗВЗЗТЮ". Ояквидно, если в строке присутствуют рядом взаимопротиваположные команды например "ЗВ" или "СЮ" их можно сократить.
Очевидно, что после сокращения, в строке опять взаимопротивоположные команды могут оказаться рядом, и их опять можно сократить.
Например: "СВЮСЗ" превращается в "C" ( "СВЮСЗ" -> "СВЗ" -> "С" ). Напишите метод, который оптимизирует строку команд для робота, сокращая лишние шаги.

Примеры: "СЮСЗ" -> "СЗ"
"СЮВЗ" -> ""
"СВЮЗ" -> "СВЮЗ"
"СВЗЮВЮЗССЮ" -> "ВЮЗС"

Задача 1
Давайте вспомним задачу про робота и его фиксированный набор команд (см.урок 46) Ваша задача реализовать класс робот.
Естественно, в классе вы должны определить набор команд, которые понимает ваш робот (конечно, enum!).

написать метод, который обрабатывает строку команд для робота, проверяя ее на ошибки и исклбчая такие команды.
написать метод, который по строке команд вывадит запись маршрута
Например так: "СВЗ" -> "1. шаг на север 2. шаг на восток 3. шаг на запад"
 */


import java.util.*;

public class Hw50 {
    public static void main(String[] args) {

        String str = "СВЗЮВЮЗССЮЗЗЗ";
        System.out.println(stringOptimize(str));
        robotСommands(stringOptimize(str));

    }

    public static String stringOptimize(String str) {
        if (str == null || str.isEmpty()) return "";
        Map<Character, Character> pair = new HashMap<>();
        pair.put('С', 'Ю');
        pair.put('Ю', 'С');
        pair.put('З', 'В');
        pair.put('В', 'З');

        Deque<Character> stack = new LinkedList<>();

        for (Character ch : str.toCharArray()){
            if (pair.get(ch).equals(stack.peek())){
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : stack){
            sb.append(ch);
        }
        return sb.reverse().toString();
    }

    public static void robotСommands(String str){
        int counter = 0;
        for (Character ch : str.toCharArray()){

            Robot robot = Robot.valueOf(String.valueOf(ch));
//            System.out.print(++counter);
            robot.setCount(++counter);
            robot.printForAllCommands();
            robot.printCommand();
        }
    }



}
