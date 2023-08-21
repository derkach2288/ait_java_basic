package array.src;

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
//  метод пузырька
//    public static void sort(int[] array) {
//        // i - номер прохода
//        for (int i = 0; i < array.length - 1; i++) {
//            // внутренний цикл прохода
//            for (int j = array.length - 1; j > i; j--) {
//                if (array[j - 1] > array[j]) {
//                    int tmp = array[j - 1];
//                    array[j - 1] = array[j];
//                    array[j] = tmp;
//                }
//            }
//        }
//    }

    // сортировка массива вариант 2
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = searchMin(arr, i, arr.length); // метод возвращает индекс минимального элемента в диапазоне от i до arr.length
            if (arr[min]<arr[i]){
                swap(arr, i, min); // метод меняет местами минимальный и итый элементы

            }
        }


    }

    public static int searchMin(int[] arr, int iMin, int iMax) {
        int indexOfMinEl = iMin;
        for (int i = iMin; i < iMax; i++) {
            if (arr[i]<arr[indexOfMinEl]){
                indexOfMinEl = i;
            }
        }
        return indexOfMinEl;
    }

    private static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    // ----------------------пузырьковая сортировка вариант 2-----

    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            boolean isSorted = true; // если на этом цикле массив уже отсортирован
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]){
                    swapBuuble(array, j, j+1);
                    isSorted = false; // если на этом цикле массив уже отсортирован
                }
            }
            if (isSorted) return; // если на этом цикле массив уже отсортирован
        }


    }

    private static void swapBuuble(int[] array, int i1, int i2) {
        int temp = array[i1];
        array[i1]=array[i2];
        array[i2]=temp;
    }


}
