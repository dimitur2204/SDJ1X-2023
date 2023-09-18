public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Which Fibonacci number do you want to see?");
        var keyboard = new java.util.Scanner(System.in);
        var number = keyboard.nextInt();
        var fibonacci = new int[number + 1];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (var i = 2; i < number + 1; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println(fibonacci[number]);
    }
}
