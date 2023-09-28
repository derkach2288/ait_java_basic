import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main3 {
    public static void main(String[] args) {

        read();
    }

    public static void read(){

        try(FileInputStream fileReader = new FileInputStream("2.t")) {
            int data;
            while ((data=fileReader.read())!=-1){
                System.out.println((int) data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
