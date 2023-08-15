public class Main {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance(); //всегда возвращается один и тот же объект
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        instance1.temp=1;
        instance1.temp=2;
        instance1.temp=3;

        instance1.print();
        instance2.print();


        System.out.println(Singleton.MESSAGE);

        Singleton2 qwe = Singleton2.INSTANCE;



    }
}