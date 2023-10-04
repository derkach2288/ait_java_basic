import java.io.*;

public class ReadObj {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        try(ObjectInputStream is = new ObjectInputStream(new BufferedInputStream( new FileInputStream("object_out.dat")))) {

        try(ObjectInputStream is = new ObjectInputStream( new FileInputStream("object_out.dat"))) {
//            String str = (String)is.readObject();
            Person person = (Person) is.readObject();
            System.out.println(person);
        }
    }
}
