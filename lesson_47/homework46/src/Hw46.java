import java.util.*;

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
 */
public class Hw46 {
    public static final Map<Character,Character> mapTeams = Map.of(
            'С','Ю',
            'Ю','С',
            'З','В',
            'В', 'З'
    );

    public static void main(String[] args) {
        System.out.println(checkTeams("СВЗЮВЮЗССЮ")); //true

    }

    public static String checkTeams(String str){
        if(str==null) return "";

        Deque<Character> stack = new LinkedList<>();

        for (Character ch: str.toCharArray() ){
            if(mapTeams.get(ch).equals(stack.peek()) ){
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.toString();
    }
}
