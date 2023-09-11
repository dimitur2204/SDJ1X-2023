
public class Ex5 {
    public static void main(String[] args){
        var date = new MyDate(1, 1, 2000);
        System.out.println(date.isLeapYear());
        var date2 = new MyDate(1, 1, 2022);
        System.out.println(date2.isLeapYear());
    }

}
