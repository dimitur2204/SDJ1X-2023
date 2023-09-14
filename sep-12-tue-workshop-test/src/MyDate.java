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
        int h = (q + (13 * (m + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return switch (h) {
            case 0 -> "Monday";
            case 1 -> "Tuesday";
            case 2 -> "Wednesday";
            case 3 -> "Thursday";
            case 4 -> "Friday";
            case 5 -> "Saturday";
            case 6 -> "Sunday";
            default -> "No day";
        };
    }
}
