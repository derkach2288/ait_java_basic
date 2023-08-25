package unit_tests;

public class SumElements { //        Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}. Найдите среднюю
//        величину по всем четным элементам массива.
//        Разработайте соответсвующий тест (набор тестов).
    public static void main(String[] args) {

        int[] array = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};

        double res = averageEvenElements(array);
        System.out.println(res);

        }

        public static double averageEvenElements (int[] arr){
            double count = 0;
            double sum = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0){
                    count++;
                    sum += arr[i];
                }
            }

            double res = sum / count;
            return res;

        }

    }



