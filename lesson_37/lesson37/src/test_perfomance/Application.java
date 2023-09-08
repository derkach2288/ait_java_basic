package test_perfomance;

public class Application {
    public static void main(String[] args) {


        ListOperationsStrategy arrayStrategy = new ArrayListOperationsStrategy();
        ListOperationsStrategy linkedStrategy = new LinkedListOperationsStrategy();

        ListPerfomanceTester arrayTester = new ListPerfomanceTester(arrayStrategy);
        ListPerfomanceTester linkedTester = new ListPerfomanceTester(linkedStrategy);

        System.out.println("Test add perfomance");

        System.out.println(arrayTester.testAddPerfomance(10000000));
        System.out.println(linkedTester.testAddPerfomance(10000000));

        System.out.println("Test get perfomance");

        System.out.println(arrayTester.testGetPerfomance(10000000, 1000));
        System.out.println(linkedTester.testGetPerfomance(10000000, 1000));



    }
}