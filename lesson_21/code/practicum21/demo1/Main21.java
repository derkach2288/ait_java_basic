package practicum21.demo1;

import practicum20.hw1.Main;

public class Main21 {
    int var1=10;
    public static void main(String[] args) {
//        var1 = 111; // ошибка
//        temp(); // из статического контекста нельзя получить доступ к нестатическому
        temp2(); // из статического контекста можно обратиться к статическому методу
        Main21 main21 = new Main21(); // чтоб обратиться к нестатической переменной из статика - нужно завести объект класса
        main21.temp();

    }
    public void temp(){ // из статического контекста нельзя получить доступ к нестатическому
        System.out.println("hello");

    }
    public static void temp2(){
        System.out.println("hello");
    }
}
