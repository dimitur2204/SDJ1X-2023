public class FibonacciTest {
    public static void main(String[] args) {
        System.out.println("Which Fibonacci number do you want to see?");
        System.out.println("Which function would you like to use");
        System.out.println("1. Recursive (Optimal)");
        System.out.println("2. Iterative (Optimal)");
        System.out.println("3. Iterative (Array)");
        var keyboard = new java.util.Scanner(System.in);
        var fnNumber = keyboard.nextInt();
        var number = keyboard.nextInt();
        var fibonacci = new Fibonacci();
        if (fnNumber == 1) {
            System.out.println(fibonacci.recursiveFibonacci(number - 1));
            return;
        }
        if (fnNumber == 2) {
            System.out.println(fibonacci.recursiveFibonacci(number - 1));
            return;
        }
        if (fnNumber == 3) {
            System.out.println(fibonacci.recursiveFibonacci(number - 1));
            return;
        }
    }


}