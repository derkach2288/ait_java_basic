public class Main {
    public static void main(String[] args) {

       OurLinkedList<Person> list = new OurLinkedList<>();
       Person p1 = new Person("Jack");
       list.append(p1);
       list.append(new Person("John"));
       list.append(new Person("Anna"));

        System.out.println(list.get(1));

        list.set(new Person("Oleg"), 1);
        System.out.println(list.get(1));
        System.out.println("=========");
        list.printOurList();
//        System.out.println("Remove Ob");
//        list.remove(p1);
//        list.printOurList();
        System.out.println("Remove id");
        list.removeById(3);
        list.printOurList();


    }
}
