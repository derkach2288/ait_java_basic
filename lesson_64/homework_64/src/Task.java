public class Task {
    private String title;
            private String description;
    private Status status;
    private Date date;
    private Status switchStatus;
    private String changeTitle;

    public Task(String title, String description, Date date) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.status = Status.UNDONE;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    public void setSwitchStatus() {
        if (status.equals(Status.DONE)){
            this.status = Status.UNDONE;
        } else this.status = Status.DONE;

    }


    public void setChangeTitle(String title) {
        this.title = title;
    }



    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", date=" + date +
                '}';
    }
}
