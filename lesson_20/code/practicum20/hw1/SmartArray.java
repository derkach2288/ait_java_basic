package practicum20.hw1;

import java.util.Arrays;

public class SmartArray {
    private int size=0;
    private int[] arr = new int[4];


    public void add(int element){
        if(size>=arr.length) {
            increaseArray();
        }

        arr[size] = element;
        size++;
    }

    private void increaseArray(){
        int[] tempArray = new int[arr.length*2];
        for (int i=0; i<arr.length;i++){
            tempArray[i]=arr[i];
        }
        arr = tempArray;
    }

    public String specialToString(){
        return Arrays.toString(arr) + "   size: "+size;
    }

    public int[] getArray(){
        int[] tempArray = new int[size];
        for (int i=0; i<size;i++){
            tempArray[i]=arr[i];
        }
        return tempArray;
    }

    public String toString(){
        String res="[";
        for (int i=0;i<size;i++){
            res+=" "+arr[i];
        }
        res+="]";
        return res;
    }

//    public void remove(int index){ // удаление по индексу
//        if(index>=0 && index<size){
//            for (int i = index+1; i < size; i++) {
//                arr[i-1] = arr[i];
//            }
//            size--;
//        }
//    }

    public void remove(int index){ // удаление по индексу
        if(index>=0 && index<size){
            for (int i = index; i < size; i++) {
                arr[i] = arr[i+1];
            }
            size--;
        }
    }


}