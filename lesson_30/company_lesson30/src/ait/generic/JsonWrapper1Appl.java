package ait.generic;

import ait.generic.utils.JsonWrapper1;

public class JsonWrapper1Appl {
    public static void main(String[] args) {

//        double a = 3.5;
//        Double b = 3.5; //Double b = new Double(3.5); запаковка примитива в объект
//        a=b; // распаковка объекта в примитив

        JsonWrapper1 wrapper1 = new JsonWrapper1("10"); // автоупаковка (инт 10 в объект)
        System.out.println(wrapper1);
        String a = (String) wrapper1.getValue(); // нужно сделать кастинг, потому что wrapper1.getValue() это ссылка на объект, а нужна на Integer
        System.out.println(a);
    }
}
