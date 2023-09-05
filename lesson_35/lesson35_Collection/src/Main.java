import java.util.*;

public class Main {
    /*
    Collections
    java.util

    List and ArrayList - список, в основе своей имеющий массив и количество элементов в листе не фиксировано.

    Конструкторы ArrayList:
    ArrayList() - создает а=пустой список
    ArrayList(Collection collection) - создает лист, в который добавляются все элементы коллекции collection
    ArrayList(int capacity) - список с начальным размером, равным capacity
         */

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
//        List<String> names = new ArrayList<>();
        List<Integer> ints = new ArrayList<>();

        // добавление элемента в конец в листа, метод add()
        names.add("John");
        System.out.println(names);
        names.add("Bill");
        System.out.println(names);

        // добавление элемента по индексу
        names.add(1, "Mary");
        System.out.println(names);

        names.add(3, "Jack");
        System.out.println(names);

        System.out.println("Print listCapacity");
        List<String> listCapacity = new ArrayList<>(20);
//        listCapacity.add(3, "ddd");
        System.out.println(listCapacity);

        // метод определение размера листа size
        System.out.println("names list size = " + names.size());
        System.out.println("names list listCapacity = " + listCapacity.size());

        // изменить элемент - метод set()
        names.set(2, "Anna");
        System.out.println(names);

        // получение элемента - метод get
        System.out.println(names.get(2));

        List<Integer> numbers = new ArrayList<>(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(7);
        System.out.println(numbers);

        // удаление элемента - метод remove(Object o) - удаление по названию - возвращает boolean
        names.remove("Anna");
        System.out.println(names);

        // удаление элемента по индексу remove(int index) - возвращает то, что удаляем
        System.out.println("who is removed?" + names.remove(0));
        System.out.println(names);

        System.out.println(numbers);
        System.out.println(numbers.remove(2));
        System.out.println(numbers);
        numbers.remove(Integer.valueOf(2));
        System.out.println(numbers);

        // int indexOf(Object o) - возвращает индекс элемента
        int position = names.indexOf("Jack");
        System.out.println(position);

        // boolean contains(Object o) - проверяет, содержит ли лист данный элемент
        System.out.println(names.contains("Mary"));
        System.out.println(names.contains("Peter"));

        // сортировка
        names.add("John");
        names.add("Peter");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);

        System.out.println("For Loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println();
        System.out.println("Enhanced For");
        for (String name : names) {
            System.out.println(name);
        }


        // Итератор
        /*
        Iterator - один из методов интерфейса Collection, он возвращает обьект, реализующий интерфейс Iterator
        методы интерфейса итератор:
        E next() - возыращает следующий элемент коллекции
        boolean hasNext() - проверяет, не достигнут ли конец коллекции
        remove() - удаляет текущий элемент(получены последним вызовом next() )
         */

        System.out.println("======Iterator=====");
        Iterator<String> ourIterator = names.iterator();

        while (ourIterator.hasNext()){
            if(ourIterator.next().equals("Mary"))
                ourIterator.remove();
//            System.out.println(ourIterator.next());
        }
        System.out.println(names);



    }
}
