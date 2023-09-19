import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/*
Stack   ( LinkedList    ArrayDeque)
push() // добавить (в конец)
pop()  // удалить  (в конце)
peek() // посмотреть (в конце)

Queue
add()          offer() // добавить(в конец)
remove()       poll()  // удалить (с начала)
element()      peek()  // посмотреть (первый)

Deque
addLast()      offerLast()   // добавить(в конец)
addFirst()     offerFirst()  // добавить(в начало)
removeLast()   pollLast()    // удалить последний
removeFirst()  pollFirst()   // удалить первый
getFirst()     peekFirst()   // посмотреть первый
getLast()      peekLast()    // посмотреть последний


 */
public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        System.out.println(deque);
        System.out.println(deque.removeLast());
        System.out.println(deque);

        System.out.println("------------");

        Deque<Integer> deque1 = new ArrayDeque<>();

        deque1.addFirst(1);
        deque1.addFirst(2);
        deque1.addFirst(3);
        deque1.addFirst(4);
        System.out.println(deque1);
        System.out.println(deque1.removeLast());
        System.out.println(deque1);

        System.out.println("-----------");

        // Stack
        Deque<String> stack = new LinkedList(); // ArrayDeque
        stack.push("s1");
        stack.push("s2");
        stack.push("s3");
        System.out.println(stack);
        System.out.println("pop " + stack.pop());
        System.out.println(stack);






    }


}
