package practicum;

public class TablUmn {
    public static void main(String[] args) {
        // Вложенные циклы
        // Вывести на экран таблицу умножения

        int i1 = 1;
        while (i1 <= 9){

            int j1 = 1;
            while (j1 <= 9){
                System.out.println(i1+"*"+j1+"="+j1*i1);
                j1++;
            }
            System.out.println("**************");
            i1++;
        }
    }
}
