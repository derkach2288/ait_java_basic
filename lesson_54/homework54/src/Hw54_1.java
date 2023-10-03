/*
По ссылке https://drive.google.com/file/d/1XZrLLuJlHK3n35NwQAnY9t1nSwZ3-piq/view?usp=sharing находится файл file.dat . Сохраните этот файл на диск (просто из браузера) . Ваша программа  должна записать в отдельный файл первые 601 байт, затем в отдельный файл записать следующие 57053 байта и оставшиеся 22494 байта записать в следующий файл. Если все сделано правильно, у вас должно получиться 3 файла.

В одном из этих файлов лежит gif картина, в другом jpg картинка, еще в одном скомпилированный .class файл java программы. Вам нужно написать программу, которая определит, в каком файле что лежит. Сделать это можно используя так называемые сигнатуры файлов: gif должен начинаться с шестнадцатеричной  последовательности байт 47 49 46 38 39 61	jpeg с последовательности ff d8   java .class файл с шестнадцатеричной  последовательности ca fe ba be

Сохраните файл, опознанный как .class файл под именем Main.class и запустите его из командной строки java Main. Если у вас получилось, на экране вы прочитайте кодовое слово.

 */
/*
1. читаем 3 массива заданного размера из файла
2. анализ сигнатур
3. запись файлов
 */


import java.io.*;
import java.util.Arrays;

public class Hw54_1 {

    private static byte[] arr1 = new byte[601];
    private static byte[] arr2 = new byte[57053];
    private static byte[] arr3 = new byte[22494];

     /*
    static byte[][] arr = new byte[3][];
//  arr[0][3]
    arr[0] = arr1;
    arr[1] = arr2;
    arr[2] = arr3;

     */



    public static void main(String[] args) {
        int a = 43;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toHexString(a));
        int b = 0x2b;
        System.out.println(b);


        try {
            read();
        } catch (IOException e) {
            System.out.println("Reading file error");
            throw new RuntimeException(e);
        }

        try {
            write(arr1);
            write(arr2);
            write(arr3);
        } catch (IOException e) {
            System.out.println("Writing files error!");
            throw new RuntimeException(e);
        }

    }

    public static void write(byte[] arr) throws IOException {
        FileTypes fileType = getFileType(arr);
        String name="pic";
        if(fileType==FileTypes.CLASS) {
            name="Main";
        }
        name=name+fileType.getExt();
        try (BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(name))) {
            os.write(arr);
        }

    }

    public static void read() throws IOException {

        try (BufferedInputStream is = new BufferedInputStream(new FileInputStream("20231002.dat"))) {
            is.read(arr1);
            is.read(arr2);
            is.read(arr3);
        }
    }

    public static FileTypes getFileType(byte[] arr){
        byte[] gif = new byte[]{(byte)0x47, (byte)0x49, (byte)0x46, (byte)0x38, (byte)0x39, (byte)0x61}; // 0x означает, что число в 16ричном виде
        byte[] jpeg = new byte[]{(byte)0xff, (byte)0xd8};
        byte[] klass = new byte[]{(byte)0xca, (byte)0xfe, (byte)0xba, (byte)0xbe};

        boolean flag=true;
        for (int i = 0; i < gif.length; i++) {
//            System.out.print(Integer.toHexString(gif[i]) + " "); // .toHexString интерпритирует в 16ричном виде
            if (arr[i]!=jpeg[i]) {
                flag = false;
                break;
            }
        }
        if(flag) return FileTypes.GIF;


        flag=true;
        for (int i = 0; i <jpeg.length ; i++) {
            if (arr[i]!=jpeg[i]){
                flag=false;
                break;
            }
        }
        if(flag) return FileTypes.JPG;

        flag=true;
        for (int i = 0; i <klass.length ; i++) {
            if (arr[i]!=klass[i]){
                flag=false;
                break;
            }
        }
        if(flag) return FileTypes.CLASS;
        return null;
    }

}
