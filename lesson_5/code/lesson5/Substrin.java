package lesson5;

public class Substrin {
    public static void main(String[] args) {

        // substring() method
        // 1. находит часть строки с символа указанной позиции и до конца
        String world = "world";

        String subWorld = world.substring(1); // с какого индекса и до конца
        System.out.println(subWorld);

        // 2. находит часть строки начиная с символа на указанной позиции и заканчивая (но не включая) символом на позиции окончания
        subWorld = world.substring(1,4);
        System.out.println(subWorld);

        subWorld = world.substring(1,world.length()-1);
        System.out.println(subWorld);

        subWorld = world.substring(0);
        System.out.println(subWorld);

        // subWorld = world.substring(1,0); индекс не может быть меньше 0 и инд конца строки не может быть меньше инд начала

        //---------------------------------------




    }
}
