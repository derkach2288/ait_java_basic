import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person>{
    private String name;
    private Date dateOfBirth;

    public Person(String name, String strDateOfBirth) throws ParseException {
        this.name = name;
        this.dateOfBirth = convert(strDateOfBirth);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + printData(dateOfBirth) +
                '}';
    }


    private Date convert (String strDateOfBirth) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        dateOfBirth = formatter.parse(strDateOfBirth);
        return dateOfBirth;
    }

    private String printData(Date dateOfBirth){
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        String dateString = formatter.format(dateOfBirth);
        return dateString;
    }

    @Override
    public int compareTo(Person o) {
        return o.dateOfBirth.compareTo(this.dateOfBirth);
    }
}
