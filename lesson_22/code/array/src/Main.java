package array.src;
public class Main {
    public static void main(String[] args) {

        int[] array = {4, -2, 8, 0, 7, 6, 5, -5, 77, 4};
        int[] array2 = {-5, -2, 0, 4, 4, 5, 6, 7, 8, 77};


        System.out.println(Arrays.search(array, -2));
        System.out.println(Arrays.search(array, 7));
        System.out.println(Arrays.search(array, 1));

        System.out.println();


        System.out.println(Arrays.binarySearch(array2, 77));

//        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
//-------------------------------------------------------
        System.out.println("\n-----sort2-----");
        Arrays.sort(array);
        System.out.println(java.util.Arrays.toString(array)); // вызов стандартного метода

//---------------Bubble--------
        System.out.println("==========Bubble==========");
        int[] array3 = {4, -2, 9, 0, 4, 99, 6, 5, -5, 77, 4};

        Arrays.bubbleSort(array3);
        System.out.println(java.util.Arrays.toString(array3));




    }

}