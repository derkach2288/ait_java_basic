package homework;
import java.util.Random;

public class HomeRandom {
    public static void main(String[] args) {
         /*
Задача 3
Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
Выведите массив на печать. Поменяйте местами первый и последний
 элементы массива и снова выведите массив на печать.

 random.nextInt( max -min +1)+min
 */

        Random random = new Random();
        int[] nums = new int[20];

        int maxRandom = 20;
        int minRandom = 10;

        int j = 0;
        while(j < nums.length){
            nums[j] = random.nextInt(maxRandom - minRandom +1)+minRandom;
            System.out.print(nums[j]+"  ");
            j++;
        }
        int temp = nums[0]; // 11
        nums[0]=nums[nums.length - 1];//12
        nums[nums.length - 1] = temp; // 11

        /*
        nums.length
        a = 1;
        b = 2;

        tempBox = a; // 1
        a = b; //2
        b = tempBox // 1
         */

        System.out.println();
        System.out.println("print swapped array");

        j = 0;

        while ( j < nums.length){
            System.out.print(nums[j]+"  ");
            j++;
        }
    }
}
