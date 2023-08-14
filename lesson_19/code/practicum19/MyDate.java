package practicum19;

public class MyDate {
    private int day;
    private int month;
    private int year;
    private boolean format = true;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        setYearOrDefValue(year);
    }
    
    private void setYearOrDefValue(int year){
        this.year = (year>=2000)?year:2000;
    }


    public String toString() {
        if (!format) {
            return year + "-" + month + "-" + day;
        } else {
            return day + "-" + month + "-" + year;
        }
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public void setFormat(boolean format){
        this.format = format;
    }


}
