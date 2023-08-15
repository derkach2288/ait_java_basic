public class Main {
    public static void main(String[] args) {

        Student[] students = {
                new Student("jack"),
                new Student("john"),
                new Student("alex"),
                new Student("stan"),
                new Student("rick"),
        };

        for (Student st: students){
            st.ask();
        }

        students[1].ask();
        students[1].ask();
    }
}