import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {


    String name;
    int lessons;

    public Student(String name, int lessons) {
        this.name = name;
        this.lessons = lessons;
    }

    public String getName() {
        return name;
    }

    public int getLessons() {
        return lessons;
    }

    @Override
    public String toString() {
        return name + " (" + lessons + ")";
    }
}
