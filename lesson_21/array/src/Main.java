public class Main {
    public static void main(String[] args) {

        int[] array = {4, -2, 8, 0, 7, 6, 5, -5, 77, 4};
        int[] array2 = {-5, -2, 0, 4, 4, 5, 6, 7, 8, 77};


        System.out.println(Arrays.search(array, -2));
        System.out.println(Arrays.search(array, 7));
        System.out.println(Arrays.search(array, 1));

        System.out.println();


        System.out.println(Arrays.binarySearch(array2, 77));

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }





    }

}