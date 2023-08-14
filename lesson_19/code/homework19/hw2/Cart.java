package homework19.hw2;

public class Cart {

    private int size = 0;
    private Product[] arr = new Product[4];

    public void add(Product element) {
        if (size >= arr.length) {
            increaseArray();
        } else {
            arr[size] = element;
            size++;
        }
    }

    private void increaseArray(){
        Product[] tempArray = new Product[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[i];
        }
        arr = tempArray;
    }

    public String toString () {
        String res = "[";
        for (int i = 0; i < size; i++) {
            res += " " + arr[i] + " | ";
        }
        res+="]";
        return res;
    }

}
