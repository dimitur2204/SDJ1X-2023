import java.time.LocalDateTime;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate(MyDate date) {
        this.year = date.year;
        this.month = date.month;
        this.day = date.day;
    }

    public static MyDate today() {
        var today = LocalDateTime.now();
        return new MyDate(today.getYear(), today.getMonthValue(), today.getDayOfMonth());
    }

    public String toString() {
        return String.format("%d-%d-%d", year, month, day);
    }

    public void nextDays(int days) {
        day += days;
        if (day > 30) {
            month += day / 30;
            day = day % 30;
        }
        if (month > 12) {
            year += month / 12;
            month = month % 12;
        }
    }

    public boolean isBefore(MyDate dateToCompare){
        if (this.year > dateToCompare.year)
            return false;
        if (this.year < dateToCompare.year)
            return true;
        if (this.month > dateToCompare.month)
            return false;
        if (this.month < dateToCompare.month)
            return true;
        if (this.day > dateToCompare.day)
            return false;
        if (this.day < dateToCompare.day)
            return true;

        return false;
    }
}
