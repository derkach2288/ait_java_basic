package homeWork;

public class HomeWork3 {
    public static void main(String[] args) {
        /*
        Задача 3. По данному числу n закончите фразу "На лугу пасется..."
        одним из возможных продолжений: "n коров", "n корова", "n коровы",
        правильно склоняя слово "корова". Входные данные: Дано целое
        положительное число n (n <= 10), Выходные данные: Программа должна
        вывести введенное число n и одно из слов: коров, корова или коровы,
        например, 1 корова, 2 коровы, 5 коров.
         */

        int n = 4;

        switch (n){
            case 1 : {
                System.out.println("На лугу пасется " + n + " корова");
                break;
            }
            case 2, 3, 4 : {
                System.out.println("На лугу пасется " + n + " коровы");
                break;
            }
            case 0, 5, 6, 7, 8, 9, 10 : {
                System.out.println("На лугу пасется " + n + " коров");
                break;
            }
            default: {
                System.out.println("Коров должно быть <= 10");
            }
        }
    }
}
