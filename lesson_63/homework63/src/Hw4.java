public class Hw4 {
    public static void main(String[] args) {

        System.out.println(fibonacci(5));

    }

// 0, 1, 1, 2, 3, 5, 8
    public static long fibonacci(int n){
        if (n==1 || n==0){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
/*
                                            f(4)
                                         f(3) + f(2)
                                  f(2) + f(1) + f(1) + f(0)
                              f(1) + f(0) + 1 +  1
                               1 +        + 1 +  1 = 3
 */

/*
                                        f(5)
                                     f(4) + f(3)
                               f(3)+ f(2) + f(2) + f(1)
                f(2) + f(1) + f(1) + f(0) + f(1)+ f(0) + 1
         f(1) + f(0) + 1      + 1         +1           +1
           1         + 1      + 1         +1           +1 = 5
 */

