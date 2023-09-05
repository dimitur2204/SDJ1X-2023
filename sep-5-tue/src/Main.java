public class Main {
    public static void main(String[] args) {

        var person = new Person("Dimitar", "02/04/2002");
        System.out.println(person);

        var day = new MyDate(1,1, 2000);
        day.setDay(1);
        day.setMonth(1);
        day.setYear(2000);
        day.displayDate();
    }
}