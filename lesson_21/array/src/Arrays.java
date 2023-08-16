public class Arrays {
    public static int search(int[] array, int value) { // поиск элемента в массиве
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    //поиск в сортированном массиве - бинарный посик
    public static int binarySearch(int[] array, int value) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while (leftIndex <= rightIndex) {
//            int midIndex = (rightIndex + leftIndex) / 2;
            int midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            if (array[midIndex] == value) return midIndex;
            if (array[midIndex] < value) {
                leftIndex = midIndex + 1;
            } else {
                rightIndex = midIndex - 1;
            }
        }
        return -1;
    }


    // сортировка массива
    public static void sort(int[] array) {
        // i - номер прохода
        for (int i = 0; i < array.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }



}
