import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        writeFile4("Hello world qqqq");

    }

    public static void writeFile(String str) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("1111.txt");
            for (char ch : str.toCharArray()) {
                fileWriter.write(ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("close error");
            }
        }
    }


    public static void writeFile2(String str) throws IOException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("1111.txt");
            for (char ch : str.toCharArray()) {
                fileWriter.write(ch);
            }
//            fileWriter.flush(); // говорит, что можно записывать - запишется без close
        } finally {
            fileWriter.close();
        }

    }

    public static void writeFile3(String str) {

        try(FileWriter fileWriter = new FileWriter("1111.txt");) {
            for (char ch : str.toCharArray()) {
                fileWriter.write(ch);
            }
        } catch (IOException e){
            System.out.println("!ERROR");
        }

    }

    public static void writeFile4(String str) {

        try(FileWriter fileWriter = new FileWriter("4.txt");) {
                fileWriter.write(str);
                fileWriter.write(65); // попадет символ по таблице аске
        } catch (IOException e){
            System.out.println("!ERROR");
        }

    }


}
