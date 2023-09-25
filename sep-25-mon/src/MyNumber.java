public class MyNumber {
    private final int number;

    public MyNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getLastDigit() {
        return Math.abs(number % 10);
    }

    public int getFirstDigit() {
        var firstDigit = number;
        while (firstDigit > 9) {
            firstDigit /= 10;
        }
        return Math.abs(firstDigit);
    }

    public boolean isDivisibleBy(int anotherInt) {
        return number % anotherInt == 0;
    }

    public int numberOfProperDivisors() {
        var numberOfProperDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (isDivisibleBy(i)) {
                numberOfProperDivisors++;
            }
        }
        return numberOfProperDivisors;
    }

    public boolean isPrime() {
        return numberOfProperDivisors() == 1;
    }

    public String toString() {
        if (isPrime()) {
            return number + " (a prime number)";
        }
        return String.valueOf(number);
    }

    public MyNumber plus(MyNumber anotherNumber) {
        if (anotherNumber == null) {
            anotherNumber = new MyNumber(0);
        }
        return new MyNumber(number + anotherNumber.number);
    }

    public boolean isPerfectNumber() {
        var sumOfProperDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (isDivisibleBy(i)) {
                sumOfProperDivisors += i;
            }
        }
        return sumOfProperDivisors == number;
    }
}
