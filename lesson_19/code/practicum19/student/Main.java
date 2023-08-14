package practicum19.student;

public class Main {
    public static void main(String[] args) {

//        int[] rates1 = {4, 5, 3, 4, 5, 3, 4};
//        Student student1 = new Student("Jack", rates1);
//
//        System.out.println(student1);
        //----------------------------------
//        SmartArray array = new SmartArray();
//
//        System.out.println(array);
//
//        array.add(1);
//        System.out.println(array);
//
//        array.add(2);
//        System.out.println(array);
//
//        array.add(3);
//        System.out.println(array);
//
//        array.add(4);
//        System.out.println(array);
//
//        array.add(4);
//        System.out.println(array);
//
//        array.add(3);
//        System.out.println(array);
//
//        int[] qwe = array.getArr();
//        qwe[0]=77777;
//        System.out.println(array);
        //----------------------------------

        Student student1 = new Student("Jack");

        System.out.println(student1);

        student1.addRate(1);
        student1.addRate(5);
        System.out.println(student1);

        System.out.println("---------------- GROUP ----------------");
        Group group31_1 = new Group();
        group31_1.add(student1);
        group31_1.add(new Student("John"));
        group31_1.add(new Student("Alex"));

        System.out.println(group31_1);




    }
}