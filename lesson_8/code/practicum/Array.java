package practicum;

public class Array {
    public static void main(String[] args) {
        /*
        для int все элементы = 0
        для float, double все элементы = 0.0
        для String все элементы = "null"
        для char все элементы = '\0'
        для boolean все элементы = false
         */

        // Прямое (ручное) заполнение массива:
        int[] myArray = new int[3]; //массив называется myArray, тип данных - int , длина массива = 3
        myArray[0] = 5;
        myArray[1] = -19;
        myArray[2] = 155;

//        String[] directions = new String[4];

//        directions = {"left", "right", "up", "down"};
//        directions[0] = "left";
//        directions[1] = "right";
//        directions[3] = "down";

        //directions[4] = "up-side-down" //- ошибка, попытка обращения к несуществующему элементу массива
        //directions[5] - ошибка, попытка обращения к несуществующему элементу массива,
                // out of range - выход за пределы массива

        int[] marks = {2, 5, 48, 5, 3, 5, 4, 1}; // так тоже можно задавать массив
        System.out.println(marks[2]);
        System.out.println(marks.length);


    }
}
