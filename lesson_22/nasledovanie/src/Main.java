public class Main {
    public static void main(String[] args) {

       Employee p1 = new Programmer("Jack", 5000); // вызывает только методы Employee
        Programmer p2 = new Programmer("Nick", 3000); // вызывает методы и Employee и Programmer

        Employee q1 = new QAEngineer("Ann", 4000);
        QAEngineer q2 = new QAEngineer("Sten", 5500);

        SupportEngineer s1 = new SupportEngineer("Lena", 4200);


//        p1.work();
        p2.work();

    }
}