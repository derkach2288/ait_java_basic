package homework;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String toString(){
        if (month<0 || month>12){ return "error"; }

        return (day<10?"0":"")  + day +"." + (month<10?"0":"") + month +"."+ year;
    }
}
