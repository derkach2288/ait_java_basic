import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadProduct {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        try(ObjectInputStream is = new ObjectInputStream(new FileInputStream("hw56.dat"))) {
            Product product = (Product) is.readObject();
            System.out.println(product);
        }
    }
}
