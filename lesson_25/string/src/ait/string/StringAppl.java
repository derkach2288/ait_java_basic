package ait.string;

public class StringAppl {
    public static void main(String[] args) {
        String str = "Hello";
        String newStr = "Hello";
        System.out.println(str.equals(newStr));
        System.out.println(str);
        char[] chars = {' ', 'w', 'o', 'r', 'l', 'd'};
        String str1 = new String(chars);
        System.out.println(str1);
        str = str + str1; // str.concat(str1); конкатинация строк

        System.out.println(str.length());

        char c = str.charAt(2);
        System.out.println(c);
        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        System.out.println("==========");
        String str2 = " WORLD";
        boolean check = str1.equalsIgnoreCase(str2);
        System.out.println(check);

        str2 = str.toUpperCase();
        System.out.println(str2);
        System.out.println(str);

        int index = str.indexOf('l');
        System.out.println(index);

        index = str.indexOf("lo");
        System.out.println(index);

        index = str.indexOf('l', 5);
        System.out.println(index);

        index = str.lastIndexOf('l');
        System.out.println(index);

        index = str.indexOf("lo", 5);
        System.out.println(index);

        System.out.println(str.substring(2));
        System.out.println(str.substring(2, 4));
        System.out.println(str.replace("l", "AAA"));

        System.out.println("====================");

        String text = "qwerty";
        String newText = "qwerty";
        check = text.equals(newText);
        System.out.println(check);


        check = text==newText;
        System.out.println(check);

        text = "qwerty";
        newText = new String("qwerty");
        check = text.equals(newText);
        System.out.println(check);

        text = "qwerty";
        newText = new String("qwerty");
        check = text==newText;
        System.out.println(check);

        System.out.println("=======split=======");

        text = "one, two, three, four, five";
        String[] arr = text.split(", "); //  разбивает на массив
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("====================");

        String email = " john@gmail.com ";
        System.out.println(email);
        email = email.trim(); // убирает пробелы вначале и вконце
        System.out.println(email);


        System.out.println("====================");

        text = String.join(", ", "one", "two", "three");
        System.out.println(text);

        text = String.join(", ", new String[]{"one", "two", "three"});
        System.out.println(text);


    }
}
