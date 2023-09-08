import java.util.LinkedList;
import java.util.List;

public class Linked {
    public static void main(String[] args) {
        /*
        LINKEDLIST
        конструкторы:
        Linkedlist() - пустой список
        Linkedlist(Collection collection) - список со всеми эл-ми

        addFirst() / offerFirst() - добавляет эл в начало листа
        addLast() / offerLast() - добавляет эл в конец листа
        removeFirst() / pollFirst() - удаляет первый элемент листа
        removeLast() / pollLast() - удаляет последний элемент листа
        getFirst() / peekFirst() - получить первый элемент листа
        getLast() / peekLast() - получить последний элемент листа


         */
        List<String> strings = new LinkedList<>();
        LinkedList<String> names = new LinkedList<>();
        names.add("Jack");
        names.add("John");
        names.add("Bill");

        System.out.println(names);

        names.addFirst("Anna");
        System.out.println(names);

        names.removeFirst();
        System.out.println(names);

        System.out.println(names.peekFirst());

    }
}
