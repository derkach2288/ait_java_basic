import java.util.Arrays;

public class Bus {
    private final int id;
    private String number;
    private String color;
    private int capacity;
    private Passenger[] passengers;
    static int counter;

    public Bus(String number, String color, int capacity) {
        this.number = number;
        this.color = color;
        this.capacity = capacity;
        this.id = counter++;
        passengers = new Passenger[0];
    }

//    public void addPassenger(Passenger passenger){
//        if (capacity == passengers.length) return;
//        Passenger[] temp = Arrays.copyOf(passengers, passengers.length +1 ); // null
//        temp[temp.length -1] = passenger;
//        passengers = temp;
//    }

    public boolean addPassenger(Passenger passenger){
        if (capacity == passengers.length) return false; // вернет false, если пассажир не влез в автобус
        Passenger[] temp = Arrays.copyOf(passengers, passengers.length +1 ); // null
        temp[temp.length -1] = passenger;
        passengers = temp;
        return true; // вернет true, если пассажир влез в автобус
    }

    public boolean dropLastPassender() { // удалить последнего пассажира
        if (passengers.length > 0) {
            passengers = Arrays.copyOf(passengers, passengers.length - 1);
            return true;
        }
        return false;
    }

    private int searchPassenger(Passenger searchPassenger){ // ищем пассажира по номеру id
        System.out.println("Ищу пассажира id: " + searchPassenger.getId() + " " + searchPassenger.getName());
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i].getId() == searchPassenger.getId()){ // если нашли - вернем индекс
                System.out.println("Нашел! Ура! " + i);
                return i;
            }
        }
        System.out.println("Не нашел никого");
        return -1; // если не нашли -1
    }
    public boolean dropPassenger(Passenger passenger){
        if (passengers.length < 1 ) return false; // проверяем, чтоб массив был не пустой
        int indexDeletingPas = searchPassenger(passenger); // присваиваем индекс элемента, который нужно удалить
        if (indexDeletingPas == -1) return false; // если индекс не нашли - выйдем из удаления

        Passenger[] temp = new Passenger[passengers.length - 1]; // создаем пустой временный массив из пасажиров на 1 меньше
        for (int i = 0; i < temp.length; i++) { // заполняем временный массив пассажирами
            if (i<indexDeletingPas){ // заполняем массив, до индекса элемента, который нужно удалить
                temp[i] = passengers[i];
            } else { // как только дошли до индекса, который нужно удалить - на его место записываем индекс+1 из старого массива
                temp[i] = passengers[i+1];
            }
        }
        passengers = temp; // переопределяем массив пассажиров
        return true; // возвращаем true, чтоб показать, что еэемент удалился успешно

    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "BUS: {id" + id + "; number: " + number + "; passengers: " + (passengers.length == 0 ? "{no passenders on board}" : Arrays.toString(passengers)) + "}";
    }
}
