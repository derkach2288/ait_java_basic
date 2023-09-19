import java.util.ArrayDeque;
import java.util.Deque;

public class HW45 {
    /*
    Дано последовательность скобок 3х видов () () { }[ ] в виде строки
    проверить корректность:
    {()[]}

    Stack
    вижу открытую - ложу закрытую
    вижу открытую - ложу закрытую
    вижу закрытую - проверяю, если последняя такая же закрытая - удаляю закрытую, если нет - false
    если стек пустой в иоге - true

     */
    public static void main(String[] args) {

        String str = "{()[]}"; // })
        String str2 = "{()[}]"; //

        System.out.println(parenthesisMatching(str2));

    }
    public static boolean parenthesisMatching(String str){
        Deque<Character> res = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (ch == '('){  //()
                res.push(')');
            } else if (ch == '{'){
                res.push('}');
            } else if (ch == '['){
                res.push(']');
            } else if (ch == res.peek()) {
                res.pop();
            }


        }
        return res.isEmpty() ? true : false;
    }
}
