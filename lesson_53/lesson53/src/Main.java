import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        Set<Map.Entry<String, Charset>> charSets = Charset.availableCharsets().entrySet();
//        for (Map.Entry<String, Charset> e: charSets){
//            System.out.println(e.getKey());
//        }

        read();

    }

    public static void read(){
        // KOI8-R
        try(FileReader fileReader = new FileReader("2.t", Charset.forName("KOI8-R"))) {
            int data;
            while ((data=fileReader.read())!=-1){
                System.out.print((char)data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
