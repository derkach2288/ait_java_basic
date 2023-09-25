public class Main {
    public static void main(String[] args) {

        // enum - фиксированный набор объектов
        Car car1 = new Car("Opel", "rrr995995", Color.BLACK);
        printAllColors();
        System.out.println("-------");
        System.out.println(getColor("RED"));
//========================================
        System.out.println("==============");
        Color2 c2 = Color2.GREEN;
        c2.printText();
        c2.printTextForAllColors();

        c2 = Color2.BLACK;
        c2.printText();
//===============================
        System.out.println("======Color3========");
        Color3 c3 = Color3.BLACK;
        System.out.println(c3);


    }

    public static Color getColor(String colorString){
//        if (colorString.equals("red")) return Color.RED;
        return Color.valueOf(colorString); // возвращает обьект по строке или...
    }

    public static void printAllColors(){
//        Color.values() // вернет массив всех цветов
        for(Color color : Color.values()){
            System.out.println(color);
        }
    }


}
