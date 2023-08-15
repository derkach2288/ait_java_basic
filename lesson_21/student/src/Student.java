public class Student {
    public String name;
    private static int questionsCounter;

    static {
        questionsCounter = 0; // блок инициализации, исполняется до конструктора
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student" + name;
    }

    public void ask(){
        System.out.println(name + " ask the questionsCounter #" + questionsCounter);
        questionsCounter++;
    }
}
