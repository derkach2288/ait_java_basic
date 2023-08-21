public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus("AA45-67", "red", 3);

        System.out.println(bus.toString());
        System.out.println(bus.dropLastPassender());
        System.out.println("------------");

        Passenger passenger = new Passenger("John", "male");
        Passenger passenger1 = new Passenger("Anna", "female");
        Passenger passenger2 = new Passenger("Olivia", "female");
        Passenger passenger3 = new Passenger("Alex", "female");
        System.out.println(passenger.toString());
        System.out.println("-------------");

        bus.addPassenger(passenger);
        bus.addPassenger(passenger1);
        System.out.println(bus.addPassenger(passenger2));
        System.out.println(bus.addPassenger(passenger3));
        System.out.println("------------");

        System.out.println(bus.toString());

        System.out.println("=======Delete======");
        System.out.println(bus.dropPassenger(passenger3));
        System.out.println(bus.toString());
        System.out.println(bus.dropPassenger(passenger));
        System.out.println(bus.toString());


    }
}