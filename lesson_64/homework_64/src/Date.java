import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    private LocalDate localDate;

    public Date(String strDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy");
        this.localDate = LocalDate.parse(strDate, formatter);
    }

    public Date(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "Date{" +
                "localDate=" + localDate + " " + localDate.getDayOfWeek() +
                '}';
    }
}
