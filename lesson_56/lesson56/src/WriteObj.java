import java.io.*;

public class WriteObj {
    public static void main(String[] args) throws IOException {
        Person p1 = new Person("john", 20, new Car("opel"));

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("object_out.dat"))){
//            os.writeObject(new String("hello from main"));
            os.writeObject(p1);
        }
    }
}
