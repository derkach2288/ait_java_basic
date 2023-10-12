import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Conference implements Comparable<Conference>{
    private String title;
    private String invitationLink;
    private LocalDateTime dateTime;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInvitationLink() {
        return invitationLink;
    }

    public void setInvitationLink(String invitationLink) {
        this.invitationLink = invitationLink;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Conference(String title, String invitationLink, String strDate, String strTime) {
        this.title = title;
        this.invitationLink = invitationLink;
        DateTimeFormatter formatterDate =
                DateTimeFormatter.ofPattern("dd-MM-yyy");
        DateTimeFormatter formatterTime =
                DateTimeFormatter.ofPattern("HH-mm");

        LocalDate date = LocalDate.parse(strDate, formatterDate);
        LocalTime time = LocalTime.parse(strTime, formatterTime);


        this.dateTime = LocalDateTime.of(date, time);

    }

    @Override
    public String toString() {
        DateTimeFormatter formatterDate =
                DateTimeFormatter.ofPattern("dd-MM-yyy");
        DateTimeFormatter formatterTime =
                DateTimeFormatter.ofPattern("HH-mm");

        return "Conference{" +
                "title='" + title + '\'' +
                ", invitationLink='" + invitationLink + '\'' +
                ", Date=" + formatterDate.format(dateTime) + " Time=" + formatterTime.format(dateTime) +
                '}';
    }

    @Override
    public int compareTo(Conference o) {
        return this.dateTime.compareTo(o.dateTime);
    }
}
