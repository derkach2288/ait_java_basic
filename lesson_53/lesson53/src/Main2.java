import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        readWrite();
    }
    public static void read(){
        // KOI8-R
        try(FileReader fileReader = new FileReader("buf.t")) {
            char[] data = new char[20];
            int count;
            while ((count=fileReader.read(data))!=-1){
                if (count==data.length){
                    System.out.print(new String(data));
                } else {
                    data = Arrays.copyOf(data, count);
                    System.out.print(data);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void read2(){

        try(BufferedReader br = new BufferedReader(new FileReader("buf.t"))) {
            String line = null;
            while ((line=br.readLine())!=null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static void readWrite(){

        try(BufferedReader br = new BufferedReader(new FileReader("buf.t"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("buf2.txt"))) {
            String line = null;
            while ((line=br.readLine())!=null){
                System.out.println(line);
                bw.write(line);
                bw.newLine(); // добавляет перевод строки
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }




}
