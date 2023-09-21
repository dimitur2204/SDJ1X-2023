public class TestClass {
    public static void main(String[] args) {
        var myDate = new MyDate(2021, 9, 28);
        var myDate2 = new MyDate(2020, 9, 28);
        var myDate3 = new MyDate(2020, 9, 28);
        System.out.println(myDate);
        myDate.nextDays(5);
        System.out.println(myDate);
        System.out.println(MyDate.today());
        System.out.println(myDate.isBefore(myDate2));
        System.out.println(myDate2.isBefore(myDate));
        System.out.println(myDate3.isBefore(myDate3));
    }
}
