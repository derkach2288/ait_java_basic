import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
    }

    public static void temp (List<Person> list){
        ComparatorPerson comparatorPerson = new ComparatorPerson();
        list.sort(comparatorPerson);
//-----------------------------------------------------------
        Comparator<Person> comparatorPerson2 = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        };
        list.sort(comparatorPerson2);

        //---------------------------------------------------
//        list.sort(new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });

        //------------------------------------------------------
        list.sort((o1, o2)-> o1.getAge()-o2.getAge());
    }
}
