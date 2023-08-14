package practicum;

public class Lesson10 {
    public static void main(String[] args) {

        int ints[] = {2, 67, 34, 8};

        for (int i = 0; i < ints.length; i++){
            System.out.println(ints[i]);
        }

        // for-each loop (enhanced for)
        System.out.println("for-each");

        for (int num : ints){
            System.out.println(num);
        }
        /*
        Цикл for-each служит для перебора элементов массива без указания
        индексов и длины массива.
        создается специальная переменная ( в нашелслучае num), в которую
        последовательно на каждом шаге цикла записывается очередное значение элемента массива.
        Она записывается в скобках после ключевого слова for.
        Дальше ставится двоеточие и справа пишем имя перебираемого массива
         */

        // contineu используется в цикле. Если в процессе выполнения программы встречается contineu, то идущая за ним часть цикла пропускается и происходит переход к выполнению следующей операции цикла
        System.out.println("continue");

        int arr[] = {2, 67, 34, 8};

        for (int i = 0; i < arr.length; i++){
            if (i > 2){
                continue;
            }
            System.out.println(arr[i]);
        }

        System.out.println("------");
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > 60){
                continue;
            }
            System.out.println(arr[i]);
        }

        System.out.println("----------");
        for (int i = 0; i < 5; i++){
            if (i == 3){
                continue;
            }
            System.out.println(i);
        }

        // break
        /*
        если в программе в цикле встречается слово break, то происходит выход из цикла.
        Если цикл в цикле - выход из того цикла, где break

         */
        System.out.println("----------");
        System.out.println("break");

        for (int i = 0; i < 100; i++){
            System.out.println(i);
            if (i == 5){
                break;
            }
        }
        System.out.println("_____");
        for (int i = 0; i < 100; i++){
            if (i == 5){
                break;
            }
            System.out.println(i);

        }
        System.out.println("------------");


    }
}
