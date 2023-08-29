import java.util.Scanner;

public class Exercise202 {
    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var firstInt = keyboard.nextInt();
        var secondInt = keyboard.nextInt();
        var thirdInt = keyboard.nextInt();
        System.out.println("The sum of the three numbers is " + (firstInt + secondInt + thirdInt));
    }
}
