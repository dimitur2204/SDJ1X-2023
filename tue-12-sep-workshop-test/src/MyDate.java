public class MyDate {
    private int day;
    private int month;
    private int year;
    public String getDayOfWeek(){
        var q = day;
        var m = month;
        var k = year % 100;
        var j = year / 100;
        if (month == 1 || month == 2){
            m = month + 12;
            k = (year - 1) % 100;
            j = (year - 1) / 100;
        }
        var h = (q + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

    }
}
