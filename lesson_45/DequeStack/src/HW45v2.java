import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/*
** Задача 1 **

Дана строка - скобочная последовательность ( строка состоящая из скобок трех видов *() [] {} )
Написать метод (алноритм обсуждали в классе) который проверит прпвилтность расстановки скобок.

( {} [] ) -> true

( {} [ ) -> false

( } [] ) -> false

{ ( } [] ) -> false
 */
public class HW45v2 {
    public static Map<Character, Character> pairToOpenBracket = Map.of(
            '(', ')',
            '[', ']',
            '{', '}'
    );

    public static Map<Character, Character> pairToCloseBracket = Map.of(
            ')', '(',
            ']', '[',
            '}', '{'
    );


    public static void main(String[] args) {

        System.out.println(checkBrackets("( {} [] )")); //true
        System.out.println(checkBrackets("( {ddd} [ )")); //false
        System.out.println(checkBrackets("( } [] )")); //false
        System.out.println(checkBrackets("{ ( } [] )")); // false
        System.out.println(checkBrackets("")); // true

    }

    public static boolean checkBrackets(String str){
        if (str==null) return false;
        if (str.isEmpty()) return true;
        Deque<Character> stack = new LinkedList<>();

        for (char ch: str.toCharArray() ){
            Character bracket= pairToOpenBracket.get(ch);
            if(bracket!=null){
                stack.push(bracket);
            } else if(pairToCloseBracket.containsKey(ch)  && ((stack.isEmpty() || ch!=stack.pop()))  ) {
                return false;
            }
        }
        return stack.isEmpty();
    }


    public static boolean checkBrackets2(String brecketStr){
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');

        Deque<Character> stack = new LinkedList<>();
        for (Character c: brecketStr.toCharArray()) {
            if (brackets.containsValue(c)){
                stack.push(c);
            } else if (brackets.containsKey(c)){
                if (stack.isEmpty() || stack.pop() != brackets.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


}
