public class Fibonacci {
    public int recursiveFibonacci(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return recursiveFibonacci(number - 1) + recursiveFibonacci(number - 2);
    }

    public int iterativeFibonacci(int number){
        var first = 1;
        var second = 1;
        var result = 0;
        for (int i = 2; i < number; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    public int arrayFibonacci(int number) {
        var fibonacci = new int[number + 1];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < number; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci[number];
    }
}
