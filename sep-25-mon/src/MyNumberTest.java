public class MyNumberTest {
    public static void main(String[] args) {
        var number = new MyNumber(28);
        System.out.println(number.isPerfectNumber());
        System.out.println(number.getFirstDigit());
        System.out.println(number.getLastDigit());
        System.out.println(number.numberOfProperDivisors());
        System.out.println(number.isDivisibleBy(7));
        System.out.println(number.isPrime());
        var newNumber = number.plus(new MyNumber(3));
        System.out.println(newNumber.toString());
    }
}
